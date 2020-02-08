import java.util.*;

public class Chaney2 {
    public static void main(String[] args) {
        double[][] data = {
                {4.6, 19.433, 0},
                {56.3424, 9.33, -321, 93.2},
                {-24, 4.37, -4, 9.2},
                {-2.24, -4.32137, -57.6, -9.2},
        };

        System.out.println(getMax(data));
        System.out.println(getMin(data));
    }

    public static double getMax(double[][] numbers) {
        double maxValue = numbers[0][0];
        for (double[] number : numbers) {
            for (double v : number) {
                if (v > maxValue) {
                    maxValue = v;
                }
            }
        }
        return maxValue;
    }

//    // For loop doesn't work because it expects INTEGERS, but we run DOUBLES. We need to use ENHANCED FOR LOOP for this to work
//    public static double getMin(double[][] numbers) {
//        double minValue = numbers[0][0];
//        for (double j = 0; j < numbers.length; j++) {
//            for (double i = 0; i < numbers[j].length; i++) {
//                if (numbers[j][i] < minValue) {
//                    minValue = numbers[j][i];
//                }
//            }
//        }
//        return minValue;
//    }


    public static double getMin(double[][] numbers) {
        double minValue = numbers[0][0];
        for (double[] number : numbers) {
            for (double v : number) {
                if (v < minValue) {
                    minValue = v;
                }
            }
        }
        return minValue;
    }
}