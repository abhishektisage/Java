public class Keypad {
    // Mapping digits to corresponding letters
    final static char[][] L = {
        {}, {},                 // 0 and 1 have no letters
        {'a','b','c'},          // 2
        {'d','e','f'},          // 3
        {'g','h','i'},          // 4
        {'j','k','l'},          // 5
        {'m','n','o'},          // 6
        {'p','q','r','s'},      // 7
        {'t','u','v'},          // 8
        {'w','x','y','z'}       // 9
    };

    // Main function to start recursion
    public static void letterCombinations(String D) {
        int len = D.length();
        if (len == 0) {
            System.out.println("");
            return;
        }
        bfs(0, len, new StringBuilder(), D);
    }

    // Recursive function (backtracking)
    public static void bfs(int pos, int len, StringBuilder sb, String D) {
        if (pos == len) {
            System.out.println(sb.toString());
            return;
        }

        char[] letters = L[Character.getNumericValue(D.charAt(pos))];
        for (int i = 0; i < letters.length; i++) {
            bfs(pos + 1, len, new StringBuilder(sb).append(letters[i]), D);
        }
    }

    // Driver code
    public static void main(String args[]) {
        letterCombinations("23");
    }
}
