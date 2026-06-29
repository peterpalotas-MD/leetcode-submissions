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
    void testIfRomanNumeralsAreComputedCorrectly_GivenAnInputOfTheSameNumerals(){

        String input = "III";
        int expected = 3;

        int actual = solution.romanToInt(input);

        assertEquals(expected, actual);
    }

    @Test
    void testIfRomanNumeralsAreComputedCorrectly_GivenAnInputOfDifferentSimpleNumerals(){

        String input = "LVIII";
        int expected = 58;

        int actual = solution.romanToInt(input);

        assertEquals(expected, actual);
    }

    @Test
    void testIfComplexRomanNumeralsAreComputedCorrectly_GivenASingleComplexNumeral(){

        String input = "IV";
        int expected = 4;

        int actual = solution.romanToInt(input);

        assertEquals(expected, actual);
    }

    @Test
    void testIfComplexRomanNumeralsAreComputedCorrectly_GivenALargeComplexNumeral(){

        String input = "MCMXCIV";
        int expected = 1994;

        int actual = solution.romanToInt(input);

        assertEquals(expected, actual);
    }


}
