import java.util.Arrays;

public class TwoSum {
    //Brute Force
    public static int[] BruteForce(int[] nums, int target) {
           for(int i = 0; i < nums.length; i++){
        for(int j = i + 1; j < nums.length; j++){
            if (nums[i] + nums[j] == target){
                return new int[] { i,j };
            }
        }
    }
    return new int[] {};
    }
    //Two Poiter
    public static int[] TwoPoiter(int[] nums, int target) {
        int left = 0 , right = nums.length - 1 , tempSum;
        while(left < right)
        {
            tempSum = nums[left] + nums[right];
            if(tempSum == target)
            return new int[]{left , right};
            if(tempSum > target)
                right--;
            else
                left++;
        }
        return null;
    }
    public static void main(String[] args) {
         int[] nums = {2,7,11,15};
         int target = 9;
        //  System.out.println(Arrays.toString(BruteForce(nums, target))); 
         System.out.println(Arrays.toString(TwoPoiter(nums, target)));


    }
}
