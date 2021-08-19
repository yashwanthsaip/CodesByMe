package arrays;

import java.util.ArrayList;
import java.util.Arrays;

    public class MergeIntervals {

        public static  int[][] merge(int[][] intervals) {

            ArrayList<int[]> res= new ArrayList<>();

            if(intervals.length==0 || intervals==null ) {
                return res.toArray(new int[0][]);
            }

            Arrays.sort(intervals , (a,b) -> a[0]-b[0]);

            int start= intervals[0][0];
            int end=intervals[0][1];
            for(int[] i: intervals){
                if(i[0] <= end){
                    end=Math.max(end,i[1]);
                }
                else{
                    res.add(new int[]{start,end});
                    start=i[0];
                    end=i[1];
                }
            }
            res.add(new int[]{start,end});
            return res.toArray(new int[0][]);
        }

        public static void main(String[] args) {

            int[][] arr1= new int[4][2];
            arr1[0][0]=1;
            arr1[0][1]=3;
            arr1[1][0]=2;
            arr1[1][1]=6;
            arr1[2][0]=8;
            arr1[2][1]=10;
            arr1[3][0]=15;
            arr1[3][1]=18;
            merge(arr1);
            System.out.println(Arrays.deepToString(arr1));

        }

    }
