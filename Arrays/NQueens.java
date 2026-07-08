public class NQueens {
    // Function to check if a queen can be placed at board[row][col]
    public static boolean isSafe(char[][] board, int row, int col, int n) {
        // Check the same row
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Check the same column for any queen
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check the upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the down-left diagonal
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the down-right diagonal
        for (int i = row, j = col; i < n && j < n; i++, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Function to solve the N-Queens problem
    public static boolean solveNQueens(char[][] board, int row, int n) {
        // If all queens are placed
        if (row == n) {
            printBoard(board, n);
            return true;
        }

        boolean hasSolution = false;

        // Try placing a queen in all columns for the current row
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                // Place the queen
                board[row][col] = 'Q';

                // Recur to place the rest of the queens
                hasSolution = solveNQueens(board, row + 1, n) || hasSolution;

                // Backtrack by removing the queen
                board[row][col] = '.';
            }
        }

        return hasSolution;
    }

    // Function to print the board
    public static void printBoard(char[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 4 ;  // You can change the size of the board here
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        if (!solveNQueens(board, 0, n)) {
            System.out.println("No solution exists");
        }
    }
}