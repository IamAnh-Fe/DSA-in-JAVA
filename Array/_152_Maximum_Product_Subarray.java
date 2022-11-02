public class _152_Maximum_Product_Subarray {
  
 public static int BruteForce1(int nums[]) {
	    int result = Integer.MIN_VALUE;
	    for(int i=0;i<nums.length-1;i++) 
	        for(int j=i+1;j<nums.length;j++) {
	            int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= nums[k];                    
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
    
    public static void main(String[] args) {
           int nums[] = {2,3,-2,4};
        //    System.out.println(BruteForce1(nums));
		        System.out.println(BruteForce2(nums));
                
    }
}
