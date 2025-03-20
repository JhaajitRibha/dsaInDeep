package GeeksForGeeksSelfPaced.stack.videos.twoStackImplInArr;

public class TSIIAA1 {

    int[] arr;
    int capacity;
    int stack1Start;
    int stack1End;
    int stack2Start;
    int stack2End;

    int count;

    public TSIIAA1(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.stack1Start = -1;
        this.stack1End = capacity / 2 - 1;
        this.stack2Start = capacity ;
        this.stack2End = capacity / 2;
        this.count = 0;
    }

    public void pushOne(int data) {
//        if(count==capacity){
//            return;
//        }
//        if (stack2End == stack1Start) {
//            if(stack2Start!=stack1Start){
//                arr[stack1Start++]=data;
//                stack1End++;
//                stack2End++;
//                count++;
//                return;
//            }
//        }
//        arr[stack1Start++] = data;
//        count++;

        if(stack1Start<stack2Start){
            stack1Start++;
            arr[stack1Start]=data;
        }
    }

    public int popTwo() {
        if (stack2Start<capacity) {
            return arr[stack2Start++];
        }
        return -1;
    }

    public void pushTwo(int data) {
//        if(count==capacity){
//            return;
//        }
//        if (stack2Start==stack1End) {
//            if(stack2Start!=stack1Start){
//                arr[stack2Start--]=data;
//                stack2End--;
//                stack1End--;
//                count++;
//                return;
//            }
//        }
//        arr[stack2Start--] = data;
//        count++;
        if(stack2Start>stack1Start){
            stack2Start--;
            arr[stack2Start]=data;
        }
    }

    public int popOne() {
        if (stack1Start>0) {
            return arr[stack1Start--];
        }
        return -1;
    }

    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        TSIIAA1 ts = new TSIIAA1(10);
        ts.pushTwo(1);
        ts.pushTwo(2);
        ts.pushTwo(3);
        ts.pushOne(4);
        ts.pushOne(5);
        ts.pushTwo(6);
        ts.pushTwo(7);
        ts.pushTwo(8);
        ts.pushTwo(9);
        ts.pushTwo(10);
        ts.pushTwo(11);
        ts.pushTwo(12);
        ts.printArray();
        System.out.println();
//        System.out.println(ts.stack1Start);
//        System.out.println(ts.stack1End);
//        System.out.println(ts.stack2Start);
//        System.out.println(ts.stack2End);
//        System.out.println();




    }
}
