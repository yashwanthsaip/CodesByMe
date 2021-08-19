package arrays;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {

        if(nums== null || nums.length<=1)
            return;
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i>=0){
            int j= nums.length-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }

        reverse(nums,i+1,nums.length-1);
    }
    public static void swap(int[] a,int i, int j){

        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;

    }
    public static void reverse(int[] a, int i, int j){
        while(i<j){
            swap(a,i++,j--);
        }
    }

    public static void main(String[] args) {

        int[] ar=new int[3];
        ar[0]=1;
        ar[1]=2;
        ar[2]=3;
        nextPermutation(ar);
        for(int i=0;i<ar.length; i++){
            System.out.print(ar[i]);
        }

    }

}
