package co.rajat.leetcode;

/**
 * Leetcode Problem #348
 * Difficulty: Medium
 * https://leetcode.com/problems/design-tic-tac-toe/
 */
public class TicTacToe {

    private final int size;
    private final int[] rows;
    private final int[] cols;
    private int diagonal;
    private int antiDiagonal;
    private final boolean[][] moves;
    private int winner;

    public TicTacToe(int n) {

        size = n;
        rows = new int[n];
        cols = new int[n];
        diagonal = 0;
        antiDiagonal = 0;
        moves = new boolean[n][n];
        winner = 0;

    }

    public int move(int row, int col, int player) {

        if (!isValid(row, col, player)) {
            throw new IllegalArgumentException("Invalid move");
        }

        int move = (player == 1) ? 1 : -1;

        rows[row] += move;
        cols[col] += move;
        if (row == col) {
            diagonal += move;
        }
        if (row + col == size - 1) {
            antiDiagonal += move;
        }
        moves[row][col] = true;

        if (Math.abs(rows[row]) == size
                || Math.abs(cols[col]) == size
                || Math.abs(diagonal) == size
                || Math.abs(antiDiagonal) == size) {
            winner = player;
        }

        return winner;

    }

    private boolean isValid(int row, int col, int player) {

        if (winner != 0) {
            return false;
        }

        if ((row < 0 || row >= size) || (col < 0 || col >= size) || (player < 1 || player > 2)) {
            return false;
        }

        return !moves[row][col];

    }

}
