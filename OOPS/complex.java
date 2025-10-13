import java.util.*;

class Complex {
    double real, imag;

    void getData(double r, double i) {
        real = r;
        imag = i;
    }

    void add(Complex c1, Complex c2) {
        double r = c1.real + c2.real;
        double i = c1.imag + c2.imag;
        System.out.println("Sum = " + r + " + " + i + "i");
    }

    void subtract(Complex c1, Complex c2) {
        double r = c1.real - c2.real;
        double i = c1.imag - c2.imag;
        System.out.println("Difference = " + r + " + " + i + "i");
    }

    void multiply(Complex c1, Complex c2) {
        double r = (c1.real * c2.real) - (c1.imag * c2.imag);
        double i = (c1.real * c2.imag) + (c1.imag * c2.real);
        System.out.println("Product = " + r + " + " + i + "i");
    }
}

public class complex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex result = new Complex();

        System.out.print("Enter real and imaginary part of first number: ");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();
        c1.getData(r1, i1);

        System.out.print("Enter real and imaginary part of second number: ");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();
        c2.getData(r2, i2);

        result.add(c1, c2);
        result.subtract(c1, c2);
        result.multiply(c1, c2);

        sc.close();
    }
}
