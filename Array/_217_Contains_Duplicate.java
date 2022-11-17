import java.util.HashSet;
import java.util.Set;

public class _217_Contains_Duplicate {
    public static boolean BruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean HashTable(int[] nums) {
    Set<Integer> seen = new HashSet<>();

    for (final int num : nums)
      if (!seen.add(num))
        return true;

    return false;
  }
    public static void main(String[] args) {
        // int nums[] = {1,2,3,1}; //solution: true
        int nums[] = {1,2,3,4}; //solution: false

        // System.out.println(BruteForce(nums));
        System.out.println(HashTable(nums));
        
    }
}
