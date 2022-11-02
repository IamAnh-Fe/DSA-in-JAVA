public class _242_Valid_Anagram {
    public static boolean BruteForce(String s, String t) {
    if (s.length() != t.length())
      return false;

    int[] count = new int[128];
    
    for (final char c : s.toCharArray()) {
        ++count[c];
    }
    for (final char c : t.toCharArray()) {
        if (--count[c] < 0) {
            return false;
        }
    }

    return true;
    }
    public static void main(String[] args) {
        // String s = "anagram";
        // String t = "nagaram";
        String s = "rat"; String t = "car";
        System.out.println( BruteForce(s, t));
    }
}
