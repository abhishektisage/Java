import java.util.*;

public class Compress {
    public static String compress(String str) {
        StringBuilder newstr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // Count consecutive duplicates
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Append character
            newstr.append(str.charAt(i));

            // Append count only if > 1
            if (count > 1) {
                newstr.append(count);
            }
        }
        return newstr.toString();
    }

    public static void main(String args[]) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}
