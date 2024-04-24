public class Solution {
    public static int[] reverseArray(int n, int []nums) {
    reversearray(nums, 0, n-1);
    return nums;

    }

    public static void reversearray(int[] nums, int i, int j)
    {

        if(i<j){
            int num=nums[i];
            nums[i]=nums[j];
            nums[j]=num;
            reversearray(nums, i+1, j-1);
        }

       
    }

}
