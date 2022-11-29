public class _153_Find_Minimum_in_Rotated_Sorted_Array {
    public static int BinarySearch(int[] nums) {
    int l = 0;
    int r = nums.length -1;
    while(r > l){
        int m = l + (r - l) /2;
        if(nums[m] < nums[r]){
            r = m;
        } else {
            l = m + 1;
        }
    }
    return nums[l];
    }
    public static void main(String[] args) {
        int nums[] = { 3,4,5,1,2 };
        System.out.println(BinarySearch(nums)); //solution: 1
        
    }
}
