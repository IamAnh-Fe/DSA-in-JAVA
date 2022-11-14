public class _152_Maximum_Product_Subarray {
  
 public static int BruteForce1(int nums[]) {
	    int result = Integer.MIN_VALUE;
	    for(int i=0;i<nums.length-1;i++) 
	        for(int j=i+1;j<nums.length;j++) {
	            int prod = 1;
                for (int k = i; k <= j; k++) {
					prod *= nums[k];
					System.out.print(prod +  " ");          
                }
	            result = Math.max(result,prod);
	        }
            return result;     
        }
  
    public static int BruteForce2(int[] nums) {
       int result = nums[0];
	    for(int i=0;i<nums.length-1;i++) {
	        int p = nums[i];
	        for(int j=i+1;j<nums.length;j++) {
	            result = Math.max(result,p);
	            p *= nums[j];
	        }
	        result = Math.max(result,p);
	    }
	   return result;  
    }

	public static int Dynamic(int[] nums) {
		     int ans = nums[0];
    int dpMin = nums[0]; // Min so far
    int dpMax = nums[0]; // Max so far

    for (int i = 1; i < nums.length; ++i) {
      final int num = nums[i];
      final int prevMin = dpMin; // dpMin[i - 1]
      final int prevMax = dpMax; // dpMax[i - 1]
      if (num < 0) {
        dpMin = Math.min(prevMax * num, num);
        dpMax = Math.max(prevMin * num, num);
      } else {
        dpMin = Math.min(prevMin * num, num);
        dpMax = Math.max(prevMax * num, num);
      }
      ans = Math.max(ans, dpMax);
    }

    return ans;
	}
    public static void main(String[] args) {
           int nums[] = {2,3,-2,4}; //solution: 6
        System.out.println(BruteForce1(nums));
		// System.out.println(BruteForce2(nums));
		//    System.out.println(Dynamic(nums));
				
                
    }
}
