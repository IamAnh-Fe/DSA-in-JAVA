import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _22_Generate_Parentheses {
  // Brute Force
  public static List<String> BruteForce(int n) {
    List<String> combinations = new ArrayList<>();
    generateAll(new char[2 * n], 0, combinations);
    return combinations;
  }

  public static void generateAll(char[] current, int pos, List<String> result) {
    if (pos == current.length) {
      if (valid(current)) {
        result.add(new String(current));
      }

    } else {
      current[pos] = '(';
      System.out.println(pos);
      generateAll(current, pos + 1, result);
      current[pos] = ')';
      generateAll(current, pos + 1, result);
      System.out.println(Arrays.toString(current));
    }
  }

  public static boolean valid(char[] current) {
    int balance = 0;
    for (char c : current) {
      if (c == '(')
        balance++;
      else
        balance--;
      if (balance < 0)
        return false;
    }
    return (balance == 0);
  }

  // Backtracking
  public List<String> Backtracking(int n) {
    List<String> ans = new ArrayList();
    backtrack(ans, new StringBuilder(), 0, 0, n);
    return ans;
  }

  public void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max) {
    if (cur.length() == max * 2) {
      ans.add(cur.toString());
      return;
    }

    if (open < max) {
      cur.append("(");
      backtrack(ans, cur, open + 1, close, max);
      cur.deleteCharAt(cur.length() - 1);
    }
    if (close < open) {
      cur.append(")");
      backtrack(ans, cur, open, close + 1, max);
      cur.deleteCharAt(cur.length() - 1);
    }
  }

  public static void main(String[] args) {

    System.out.println(BruteForce(3));
  }
}
