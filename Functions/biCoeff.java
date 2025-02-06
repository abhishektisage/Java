import java.util.*;

public class biCoeff {
    
    public static int facto(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;  // ✅ Return factorial correctly
    }  // ✅ Closing brace added here

    public static int bicoeff(int n , int r) {
        int fac_n = facto(n);
        int fac_r = facto(r);
        int fac_nmr = facto(n - r);

        int biC = fac_n / (fac_r * fac_nmr);
        return biC;
    }

    public static void main(String args[]) {
        int biCoeff = bicoeff(5, 2);
        System.out.println("Binomial Coefficient: " + biCoeff);
    }
}
