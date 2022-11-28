public class _378_Kth_Smallest_Element_in_a_Sorted_Matrix {
          public static int BinarySearch (int[][] matrix, int k) {
    int l = matrix[0][0];
    int r = matrix[matrix.length - 1][matrix.length - 1];

    while (l < r) {
      final int m = l + (r - l) / 2;
      if (numsNoGreaterThan(matrix, m) >= k)
        r = m;
      else
        l = m + 1;
    }

    return l;
  }

  private static int numsNoGreaterThan(int[][] matrix, int m) {
    int count = 0;
    int j = matrix[0].length - 1;
    // For each row, find the first index j s.t. row[j] <= m
    // So numsNoGreaterThan m for this row will be j + 1
    for (int[] row : matrix) {
      while (j >= 0 && row[j] > m)
        --j;
      count += j + 1;
    }
    return count;
  }
    
    public static void main(String[] args) {
        int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
        int k = 8;
        System.out.println(BinarySearch(matrix, k));//solution: 13
    }
}
