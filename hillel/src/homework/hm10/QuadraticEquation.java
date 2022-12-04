package homework.hm10;

import java.util.Arrays;

public class QuadraticEquation {
    private static final int[] VALUES = {-2, 1, -1};

    public static void main(String[] args) {
        action();
        //printEquation();
    }

    private static void action() {
        printEquation();

        double discriminant = VALUES[1] * VALUES[1] - 4 * VALUES[0] * VALUES[2];

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
        return (VALUES[1] * -1) / (2 * VALUES[0]);
    }

    private static double[] findTwoRoots(double discriminant) {
        double[] roots = new double[2];
        int tmpValue = 1;

        for (int i = 0; i < roots.length; i++) {
            roots[i] = (VALUES[1] * -1 + Math.sqrt(discriminant) * tmpValue) / (2 * VALUES[0]);
            tmpValue -= 2;
        }
        return roots;
    }

    private static void checkEquation() {
        double x = 0;
        double x1 = 0;
        double x2 = 0;

        if (VALUES[0] == 0) {
            //A=0
            System.out.println("Exception");
            System.exit(0); //need exception
        }

        if (VALUES[1] == 0) {
            //B=0
            double tmpValue = (VALUES[2] * -1) / VALUES[0];
            if (tmpValue > 0) {
                //          ?????
            }
        }

        if (VALUES[2] == 0) {
            //C=0
            x1 = 0;
            x2 = (VALUES[1] * -1) / VALUES[0];
        }

        if (VALUES[1] == 0 && VALUES[2] == 0)
            //B=0 && C=0
            x = 0;
    }

    private static void printEquation() {
        String equation = "";

        if (VALUES[0] == 1 || VALUES[0] == -1) {
            equation += (VALUES[0] == 1) ? "x²" : "-x²";
        } else {
            equation += VALUES[0] + "x²";
        }

        if (VALUES[1] == 1 || VALUES[1] == -1) {
            equation += (VALUES[1] == 1) ? "+x" : "-x";
        } else {
            equation += (VALUES[1] >= 0) ? "+" + VALUES[1] + "x" : VALUES[1] + "x";
        }

        equation += (VALUES[2] >= 0) ? "+" + VALUES[2] + "=0" : VALUES[2] + "=0";

        System.out.println(equation);
    }
}
