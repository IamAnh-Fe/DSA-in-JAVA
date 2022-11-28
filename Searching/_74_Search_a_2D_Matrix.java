public class _74_Search_a_2D_Matrix {
    public static boolean BinarySearch (int[][] matrix, int target) {
    if (matrix.length == 0)
      return false;

    final int m = matrix.length;
    final int n = matrix[0].length;
    int l = 0;
    int r = m * n;

    while (l < r) {
      final int mid = (l + r) / 2;
      final int i = mid / n;
      final int j = mid % n;
      if (matrix[i][j] == target)
        return true;
      if (matrix[i][j] < target)
        l = mid + 1;
      else
        r = mid;
    }

    return false;
  }
    public static void main(String[] args) {
        int[][] matrix = { { 1,3,5,7 }, { 10, 11, 16,20 }, { 23,30,34,60 } };
        int target = 3;
        System.out.println(BinarySearch(matrix, target)); //solution
    }
}
