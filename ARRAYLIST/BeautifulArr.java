import java.util.*;

public class BeautifulArr {
    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);

        while (arr.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();

            // EASY PART: just use two simple loops instead of formulas
            for (int x : arr) {
                if (x * 2 - 1 <= n)  // odd number
                    temp.add(x * 2 - 1);
            }

            for (int x : arr) {
                if (x * 2 <= n)  // even number
                    temp.add(x * 2);
            }

            arr = temp;  // update array
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        ArrayList<Integer> result = beautifulArray(n);
        System.out.println("Beautiful ArrayList: " + result);
    }
}
