package co.rajat.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TicTacToeTest {

    @Test
    public void ticTacToe_rowWin() {

        TicTacToe objectUnderTest = new TicTacToe(3);
        objectUnderTest.move(0, 0, 1);
        objectUnderTest.move(1, 1, 2);
        objectUnderTest.move(0, 1, 1);
        objectUnderTest.move(1, 0, 2);
        int winner = objectUnderTest.move(0, 2, 1);
        assertThat(winner, is(1));

    }

    @Test
    public void ticTacToe_colWin() {

        TicTacToe objectUnderTest = new TicTacToe(3);
        objectUnderTest.move(0, 0, 1);
        objectUnderTest.move(1, 1, 2);
        objectUnderTest.move(1, 0, 1);
        objectUnderTest.move(2, 1, 2);
        int winner = objectUnderTest.move(2, 0, 1);
        assertThat(winner, is(1));

    }

    @Test
    public void ticTacToe_diagonalWin() {

        TicTacToe objectUnderTest = new TicTacToe(3);
        objectUnderTest.move(0, 0, 1);
        objectUnderTest.move(0, 1, 2);
        objectUnderTest.move(1, 1, 1);
        objectUnderTest.move(2, 1, 2);
        int winner = objectUnderTest.move(2, 2, 1);
        assertThat(winner, is(1));

    }

    @Test
    public void ticTacToe_antiDiagonalWin() {

        TicTacToe objectUnderTest = new TicTacToe(3);
        objectUnderTest.move(0, 2, 1);
        objectUnderTest.move(1, 0, 2);
        objectUnderTest.move(1, 1, 1);
        objectUnderTest.move(2, 1, 2);
        int winner = objectUnderTest.move(2, 0, 1);
        assertThat(winner, is(1));

    }

    @Test(expected = IllegalArgumentException.class)
    public void ticTacToe_invalidNegativePlayer() {

        TicTacToe objectUnderTest = new TicTacToe(3);
        objectUnderTest.move(0, 2, -3);

    }

    @Test(expected = IllegalArgumentException.class)
    public void ticTacToe_invalidPositivePlayer() {

        TicTacToe objectUnderTest = new TicTacToe(3);
        objectUnderTest.move(0, 2, 8);

    }

    @Test(expected = IllegalArgumentException.class)
    public void ticTacToe_invalidNegativeRow() {

        TicTacToe objectUnderTest = new TicTacToe(3);
        objectUnderTest.move(-1, 2, 2);

    }

    @Test(expected = IllegalArgumentException.class)
    public void ticTacToe_invalidPositiveRow() {

        TicTacToe objectUnderTest = new TicTacToe(3);
        objectUnderTest.move(3, 2, 1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void ticTacToe_invalidNegativeColumn() {

        TicTacToe objectUnderTest = new TicTacToe(3);
        objectUnderTest.move(0, -2, 1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void ticTacToe_invalidPositiveColumn() {

        TicTacToe objectUnderTest = new TicTacToe(3);
        objectUnderTest.move(0, 8, 1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void ticTacToe_invalidMove() {

        TicTacToe objectUnderTest = new TicTacToe(3);
        objectUnderTest.move(0, 2, 1);
        objectUnderTest.move(0, 2, 2);

    }

    @Test(expected = IllegalArgumentException.class)
    public void ticTacToe_moveAfterWinning() {

        TicTacToe objectUnderTest = new TicTacToe(3);
        objectUnderTest.move(0, 2, 1);
        objectUnderTest.move(1, 0, 2);
        objectUnderTest.move(1, 1, 1);
        objectUnderTest.move(2, 1, 2);
        objectUnderTest.move(2, 0, 1);
        objectUnderTest.move(0, 0, 2);

    }

}