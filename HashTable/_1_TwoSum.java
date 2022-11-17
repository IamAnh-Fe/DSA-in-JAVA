import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class _1_TwoSum {
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
        System.out.println(Arrays.toString(HashTable(nums, target))); 
    }
}
