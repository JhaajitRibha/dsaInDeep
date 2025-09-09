package GeeksForGeeksSelfPaced.searching;

public class BinarySearch {
    public int binarySearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        return binarySearch(arr, k, low, high);
    }

    public int binarySearch(int[] arr, int k, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (k == arr[mid]) {
            return mid;
        } else if (k > arr[mid]) {
            return binarySearch(arr, k, mid + 1, high);
        } else {
            return binarySearch(arr, k, low, mid - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,10,11,16,20,23,30,34,60};
        int target = 300;
        System.out.println(new BinarySearch().binarySearch(arr,target));
    }
}
