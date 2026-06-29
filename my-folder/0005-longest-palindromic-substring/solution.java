public class Solution {
    private int maxPalindromeStartIndex = 0;
    private int maxPalindromeLength = 1;

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            expandAroundCenter(chars, i, i);

            expandAroundCenter(chars, i, i + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = maxPalindromeStartIndex; i < maxPalindromeStartIndex + maxPalindromeLength; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    private void expandAroundCenter(char[] chars, int left, int right) {
        while (left >= 0 && right < chars.length && chars[left] == chars[right]) {

            int currentLength = right - left + 1;

            if (currentLength > maxPalindromeLength) {
                maxPalindromeStartIndex = left;
                maxPalindromeLength = currentLength;
            }

            left--;
            right++;
        }
    }
}
