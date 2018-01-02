import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/2/18.
 */
public class RockPaperScissorsTest {
    @Test
    public void evaluateCombination_returnsWinnerOnRockAndScissors_1() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        Integer expected = 1;
        assertEquals(expected, testRockPaperScissors.evaluateCombination("Rock", "Scissors"));
    }

    @Test
    public void evaluateCombination_returnsWinnerOnScissorsAndRock_0() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        Integer expected = 0;
        assertEquals(expected, testRockPaperScissors.evaluateCombination("Scissors", "Rock"));
    }

    @Test
    public void evaluateCombination_returnsWinnerOnPaperAndRock_1() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        Integer expected = 1;
        assertEquals(expected, testRockPaperScissors.evaluateCombination("Paper", "Rock"));
    }

    @Test
    public void evaluateCombination_returnsWinnerOnRockAndPaper_0() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        Integer expected = 0;
        assertEquals(expected, testRockPaperScissors.evaluateCombination("Rock", "Paper"));
    }

    @Test
    public void evaluateCombination_returnsWinnerOnPaperAndScissors_0() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        Integer expected = 0;
        assertEquals(expected, testRockPaperScissors.evaluateCombination("Paper", "Scissors"));
    }

    @Test
    public void evaluateCombination_returnsWinnerOnScissorsAndPaper_1() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        Integer expected = 1;
        assertEquals(expected, testRockPaperScissors.evaluateCombination("Scissors", "Paper"));
    }

    @Test
    public void evaluateCombination_returnsTieOnEqualValues_2() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        Integer expected = 2;
        assertEquals(expected, testRockPaperScissors.evaluateCombination("Scissors", "Scissors"));
    }

    @Test
    public void evaluateCombination_returnsErrorOnIncorrectValues_3() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        Integer expected = 3;
        assertEquals(expected, testRockPaperScissors.evaluateCombination("Banana", "Strawberry"));
    }
}