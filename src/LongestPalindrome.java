public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return null;
        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            String oddPalindrome = expandAroundCenter(s, i, i);
            if (oddPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = oddPalindrome;
            }

            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            if (evenPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = evenPalindrome;
            }
        }
        return longestPalindrome;

    }

    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
