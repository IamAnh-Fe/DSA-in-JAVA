import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum {
    //Brute Force
    public static int[] BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
    
    //Two Poiter
    public static int[] TwoPoiter(int[] nums, int target) {
        int left = 0, right = nums.length - 1, tempSum;
        while (left < right) {
            tempSum = nums[left] + nums[right];
            if (tempSum == target)
                return new int[] { left, right };
            if (tempSum > target)
                right--;
            else
                left++;
        }
        return null;
    }
    
    //HashTable
    public static int[] HashTable(int[] nums, int target) {
         Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            System.out.println(numMap);
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    

  }
    
    public static void main(String[] args) {
         int[] nums = {2,7,11,15}; //solution [0,1]
         int target = 9;
        //  System.out.println(Arrays.toString(BruteForce(nums, target))); 
         //  System.out.println(Arrays.toString(TwoPoiter(nums, target)));
         System.out.println(Arrays.toString(HashTable(nums, target))); 
        

    }
}
