package datastructure.algorithms.backtrackingalgorithms;

public class NQueens {
    private static int N = 4; // Number of queens and board size

    public static void main(String[] args) {
        solveNQueens();
    }

    private static void solveNQueens() {
        int[][] board = new int[N][N];

        if (solveNQueensUtil(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    private static boolean solveNQueensUtil(int[][] board, int col) {
        if (col >= N) {
            return true; // All queens have been placed
        }

        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;

                if (solveNQueensUtil(board, col + 1)) {
                    return true;
                }

                board[i][col] = 0; // Backtrack and try a different position
            }
        }

        return false; // No safe position found in this column
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        int i, j;

        // Check the left side of the current row
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check the upper diagonal on the left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check the lower diagonal on the left side
        for (i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true; // It is safe to place a queen at (row, col)
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

