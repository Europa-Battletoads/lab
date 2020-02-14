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
        System.out.println(isKaprekar(34234));
        System.out.println(move("computer"));
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

//    A Kaprekar Number is a positive integer that, after being squared and split into two lexicographical parts, is equal to the sum of the two new numbers obtained:
//
//    If the quantity of digits of the squared number is even, the left and right parts will have the same length.
//    If the quantity of digits of the squared number is odd, then the right part will be the longest half, with the left part being the smallest or equal to zero if the quantity of digits is equal to 1.
//    Given a positive integer n implement a function that returns true if it's a Kaprekar number, and false if it's not.

        public static boolean isKaprekar(long n) {
            if (n <= 1) {
                return true;
            }
            String sq = ("" + (n * n));
            long n1 = (sq.length() == 1) ? 0 : Long.parseLong(sq.substring(0, sq.length()/2));
            long n2 = Long.parseLong(sq.substring(sq.length()/2));
            return n1 + n2 == n;
        }

//    Write a function that changes every letter to the next letter:
//
//            "a" becomes "b"
//            "b" becomes "c"
//            "d" becomes "e"
//    and so on ...

        public static String move(String word) {
            String alpha = "abcdefghijklmnopqrstuvwxyz";
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                int index = alpha.indexOf(c);
                sb.append(alpha.charAt(index+1));
            }
            return sb.toString();
        }

//    move("hello") ➞ "ifmmp"
//
//    move("bye") ➞ "czf"
//
//    move("welcome") ➞ "xfmdpnf"
    }