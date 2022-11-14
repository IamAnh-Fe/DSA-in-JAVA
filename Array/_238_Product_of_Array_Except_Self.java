import java.util.Arrays;

public class _238_Product_of_Array_Except_Self {
     public static int[] BruteForce(int[] nums) {
         int n = nums.length;
        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            int pro = 1;
            for (int j = 0; j < n; j++) {
                if(i == j) continue;
                pro *= nums[j];
            }
            ans[i] = pro;
        }
        return ans;
    }
     public static int[] Dividing(int[] nums) {
       int n = nums.length;
        int ans[] = new int[n];
        int pro = 1;
        for(int i : nums) {
            pro *= i;
            System.out.println(pro);
        }
        
        for(int i = 0; i < n; i++) {
            ans[i] = pro / nums[i];
        }
        return ans;
    }

    public static int[] Prefix_and_Suffix(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;
        int ans[] = new int[n];

        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1]; // 1 2 6
        }
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1]; // 4 12 24
        }
        for (int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        return ans; // [24, 12, 8, 6]
    }

     
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};//solution: [24,12,8,6]
        // System.out.println(Arrays.toString(BruteForce(nums)));
        System.out.println(Arrays.toString(Dividing(nums)));
        // System.out.println(Arrays.toString(Prefix_and_Suffix(nums)));
    }
}
