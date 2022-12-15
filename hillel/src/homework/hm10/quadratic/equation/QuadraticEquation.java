package homework.hm10.quadratic.equation;

import java.util.Arrays;

public class QuadraticEquation {
    private static int a;
    private static int b;
    private static int c;
    
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calcilations() {
        printEquation();

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("The equation has no roots");
            System.exit(0);
        }

        if (discriminant == 0) {
            System.out.println("discriminant == 0 " + findOneRoot());
        }
        Arrays.stream(findTwoRoots(discriminant)).forEach(System.out::println);
    }

    private static double findOneRoot() {
        return (b * -1) / (2 * a);
    }

    private static double[] findTwoRoots(double discriminant) {
        double[] roots = new double[2];
        int tmpValue = 1;

        for (int i = 0; i < roots.length; i++) {
            roots[i] = (b * -1 + Math.sqrt(discriminant) * tmpValue) / (2 * a);
            tmpValue -= 2;
        }
        return roots;
    }

    private static void checkEquation() {
        double x = 0;
        double x1 = 0;
        double x2 = 0;

        if (a == 0) {
            //A=0
            System.out.println("Exception");
            System.exit(0); //need exception
        }

        if (b == 0) {
            //B=0
            double tmpValue = (c * -1) / a;
            if (tmpValue > 0) {
                //          ?????
            }
        }

        if (c == 0) {
            //C=0
            x1 = 0;
            x2 = (b * -1) / a;
        }

        if (b == 0 && c == 0)
            //B=0 && C=0
            x = 0;
    }

    private static void printEquation() {
        String equation = "";

        if (a == 1 || a == -1) {
            equation += (a == 1) ? "x²" : "-x²";
        } else {
            equation += a + "x²";
        }

        if (b == 1 || b == -1) {
            equation += (b == 1) ? "+x" : "-x";
        } else {
            equation += (b >= 0) ? "+" + b + "x" : b + "x";
        }

        equation += (c >= 0) ? "+" + c + "=0" : c + "=0";

        System.out.println(equation);
    }
}
