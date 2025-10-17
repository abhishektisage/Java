import java.util.*;

public class removeDuplicates {
    public static void removeD(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx); // get current character

        if (map[currChar - 'a']) { // if character already seen
            removeD(str, idx + 1, newStr, map);
        } else { // if not seen before
            map[currChar - 'a'] = true;
            removeD(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String args[]) {
        String str = "abhishek";
        boolean map[] = new boolean[26]; // for 26 lowercase letters
        StringBuilder newStr = new StringBuilder();
        removeD(str, 0, newStr, map);
    }
}
