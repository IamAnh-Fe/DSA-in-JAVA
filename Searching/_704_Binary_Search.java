public class _704_Binary_Search {
    public static int BinarySearch(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (target == nums[m]) {
                return m;
            } else if (target > nums[m]) {
                l = l + 1;
            } else if (target < nums[m]) {
                r = r - 1;
            }
        }
        return -1;
    }
    //----------------------------
    public static int Recursive(int[] nums, int l, int r ,int target) {
        if (r >= l) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] > target) {
                return Recursive(nums, l, m-1, target);
            }
            return Recursive(nums, m + 1, r, target);
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = { -1,0,3,5,9,12 };
        int target = 9;
        // System.out.println(BinarySearch(nums, target)); //4
        //-----------------
        int l = 0;
        int r = nums.length - 1;
        System.out.println(Recursive(nums, l, r, target)); //4
    }
}
