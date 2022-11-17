import java.util.Arrays;

public class _53_Maximum_Subarray {
     public static int BruteForce(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
        int maxSubArray = 0;

            for (int j = i ; j < nums.length; j++) {
                maxSubArray = maxSubArray + nums[j];
                if(maxSubArray > max){
                    max = maxSubArray;
                }
            }
        }
        return max;
    }

    public static int Kadane(int[] nums) {
        int sum1 = Integer.MIN_VALUE, sum2 = 0;
        for (int x : nums) {
            sum2 += x;
            sum1 = Math.max(sum1, sum2);
            sum2 = Math.max(sum2, 0);
        }
        return sum1;
    }

    public static int Gready(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;

        for (final int num : nums) {
            sum += num;
            ans = Math.max(ans, sum);
            sum = Math.max(sum, 0);
        }

        return ans;
    }

           public static int Dynamic(int[] nums) {
   int[] dp = new int[nums.length];

    for (int i = 0; i < nums.length; ++i)
      if (i > 0 && dp[i - 1] > 0)
        dp[i] = dp[i - 1] + nums[i];
      else
        dp[i] = nums[i];

    return Arrays.stream(dp).max().getAsInt();
     }
    public static void main(String[] args) {
        // int nums[] = {1}; //splution: 1
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4}; //solution: 6
        // int nums[] = {5,4,-1,7,8}; //solution: 23

        System.out.println(BruteForce(nums));
        // System.out.println(Kadane(nums));
        // System.out.println(Gready(nums));
        // System.out.println(Dynamic(nums));

    }
}
