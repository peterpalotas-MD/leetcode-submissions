import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Given a string s, return the longest palindromic substring in s.
class SolutionTest {


    Solution solution;
    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }
    @Test
    void longestPalindromeReturnsFirstValidPalindromeInString() {
        String s = "babad";
        String expected = "bab";
        //"aba" is also a valid answer.

        String actual = solution.longestPalindrome(s);

        assertEquals(expected, actual);

    }

    @Test
    void longestPalindromeReturnsOnlyValidPalindromeInString() {
        String s = "cbbd";
        String expected = "bb";
        //"aba" is also a valid answer.

        String actual = solution.longestPalindrome(s);

        assertEquals(expected, actual);

    }

    @Test
    void ShouldReturnTheLongestPalindromeGivenNoRepeatingCharacters() {
        String s = "bacd";
        String expected = "b";
        //"aba" is also a valid answer.

        String actual = solution.longestPalindrome(s);

        assertEquals(expected, actual);

    }

}
