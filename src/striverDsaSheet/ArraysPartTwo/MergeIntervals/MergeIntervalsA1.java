package striverDsaSheet.ArraysPartTwo.MergeIntervals;

import java.util.Arrays;

public class MergeIntervalsA1 {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a, b)->Integer.compare(a[0],b[0]));
        int temp[][] = new int[intervals.length][intervals[0].length];
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[i].length;j++){
                temp[i][j]=-1;
            }
        }

        temp[0][0]=intervals[0][0];
        temp[0][1]=intervals[0][1];
        int index=0;
        for(int i=1;i<intervals.length;i++){
            int start=temp[index][0];
            int end= temp[index][1];
            if(start>=intervals[i][0] && start<=intervals[i][1] ||
               end>= intervals[i][0] && end<=intervals[i][1] ||
                    intervals[i][0]>=start && intervals[i][0]<=end ||
                    intervals[i][1]>=start && intervals[i][1]<=end){
                int min = Math.min(start,intervals[i][0]);
                int max = Math.max(end,intervals[i][1]);
                int[] newArray = new int[2];
                newArray[0]=min;
                newArray[1]=max;
                temp[index]=newArray;
            }else{
                index++;
                temp[index]=intervals[i];
            }
        }

        int[][] res = new int[index+1][2];
        for(int i=0;i<res.length;i++){
            res[i]=temp[i];
        }
        return res;
    }

    public int[][] merge2(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int index = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[index][1] >= intervals[i][0]) {
                intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]);
            } else {
                index++;
                intervals[index] = intervals[i];
            }
        }
        return Arrays.copyOfRange(intervals, 0, index + 1);
    }


    public static void main(String[] args) {
      int[][] arr3 = {{1,3},{2,6},{8,10},{15,18}};
      int[][] arr2 = {{1, 2}, {2, 3},{5, 6}, {10, 15}, {14, 18}, {20, 25}};
      int[][] arr = {{1,4},{2,3}};
      new MergeIntervalsA1().merge(arr);


    }
}
