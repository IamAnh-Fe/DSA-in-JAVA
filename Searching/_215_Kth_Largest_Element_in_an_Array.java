public class _215_Kth_Largest_Element_in_an_Array {
      public static int findKthLargest(int[] nums, int k) {
    return quickSelect(nums, 0, nums.length - 1, k);
  }

  private static int quickSelect(int[] nums, int l, int r, int k) {
    final int pivot = nums[r];

    int nextSwapped = l;
    for (int i = l; i < r; ++i)
      if (nums[i] >= pivot)
        swap(nums, nextSwapped++, i);
    swap(nums, nextSwapped, r);

    final int count = nextSwapped - l + 1; // # of nums >= pivot
    if (count == k)
      return nums[nextSwapped];
    if (count > k)
      return quickSelect(nums, l, nextSwapped - 1, k);
    return quickSelect(nums, nextSwapped + 1, r, k - count);
  }

  private static void swap(int[] nums, int i, int j) {
    final int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
    public static void main(String[] args) {
        int nums[] = { 3,2,1,5,6,4 };
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }
}
