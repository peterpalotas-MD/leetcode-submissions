package problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    Solution solution;
    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void shouldReturnWholeArray_GivenItAllAddsToZero() {
        int[] input = new int[] {0,0,0};
        List<List<Integer>> expected = new ArrayList<>(List.of(List.of(0, 0, 0)));

        List<List<Integer>> actual = solution.threeSum(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyList_GivenNoSolutions() {
        int[] input = new int[] {0,1,1};
        List<List<Integer>> expected = new ArrayList<>();

        List<List<Integer>> actual = solution.threeSum(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnAllPossibleSolutions_GivenAnInputWith2Solutions() {
        int[] input = new int[] {-1,0,1,2,-1,-4};
        List<List<Integer>> expected = new ArrayList<>(List.of( List.of(-1, 0, 1), List.of(-1, -1, 2)));

        List<List<Integer>> actual = solution.threeSum(input);

        assertEquals(expected, actual);
    }


}
