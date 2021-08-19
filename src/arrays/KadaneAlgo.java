package arrays;

public class KadaneAlgo {

    public static int maxSubArray(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int MaxSum=nums[0];
        int CurSum=0;
        for(int i=0;i<nums.length;i++){
            CurSum+=nums[i];
            if(CurSum > MaxSum){
                MaxSum=CurSum;
            }
            if(CurSum < 0){
                CurSum=0;
            }
        }

        return MaxSum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, -3, 0, 1};
        int ans = maxSubArray(nums);
        System.out.println(ans);
    }
}
