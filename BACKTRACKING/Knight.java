public class Knight {
    static int N = 8; // board size

    // Check if (x, y) is valid and not yet visited
    public static boolean isSafe(int x, int y, int sol[][]) {
        return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }

    // Print the solution board
    public static void printSolution(int sol[][]) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++)
                System.out.print(sol[x][y] + "\t");
            System.out.println();
        }
    }

    // Main function to solve the Knight's Tour
    public static boolean solveKT() {
        int sol[][] = new int[N][N];

        // Initialize solution matrix with -1
        for (int x = 0; x < N; x++)
            for (int y = 0; y < N; y++)
                sol[x][y] = -1;

        // Possible moves for a knight
        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};

        // Starting position
        sol[0][0] = 0;

        // Start recursion
        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solution does not exist");
            return false;
        } else {
            printSolution(sol);
        }

        return true;
    }

    // Recursive backtracking function
    public static boolean solveKTUtil(int x, int y, int movei, int sol[][],
                                      int xMove[], int yMove[]) {
        int k, next_x, next_y;
        if (movei == N * N)
            return true;

        // Try all next moves
        for (k = 0; k < 8; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];

            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove))
                    return true;
                else
                    sol[next_x][next_y] = -1; // backtrack
            }
        }

        return false;
    }

    // Main method
    public static void main(String args[]) {
        solveKT();
    }
}
