import java.util.Arrays;


public class faith {

    public static void main(String args[]) {


        int[][] data = {
                {3, 2, 5},
                {1, 4, 4, 8, 13},
                {9, 1, 0, 2},
                {0, 2, 6, 3, -1, -8}
        };
        System.out.println(getMinValue(data));
        System.out.println(getMaxValue(data));

    }

    public static int getMaxValue(int[][] numbers) {
        int maxValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[][] numbers) {
        int minValue = numbers[0][0];

        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] < minValue) {
                    minValue = numbers[j][i];

                }
            }
        }
        return minValue;
    }


    public class Challenge {
        public double[] findLargestNums(double[][] arr) {
            return Arrays.stream(arr)
                    .mapToDouble(sa -> Arrays.stream(sa)
                            .max()
                            .orElse(0))
                    .toArray();
        }

        /** Practice Problems
         * Write a method that takes as its parameter an array of integers and returns the sum of the values in the array



         * Write a method that takes as its parameter an array of integers and returns the minimum of the values in the array.






         * Write a method that takes as its parameters two arrays of integers and returns the dot product of the two (i.e., the sum of the products of the corresponding elements)








         * Write a method that takes as its parameter an array a of integers and returns a new array of the same length, where each entry is the corresponding value in a multiplied by its index in the array










         * Write a method that takes as its parameters two arrays of integers and returns a new array where the value at each index is the sum of the corresponding two elements of the given arrays at the same index. Assume the arrays are of equal length





         * Write a method that takes as its parameters two arrays of integers and returns a new array where the value at each index is the sum of the corresponding two elements of the given arrays at the same index. Do not assume the arrays are of equal length. Pretend that the shorter array is padded with zeros at the end. (For example, if the arrays are of length 3 and 5, your result should be as if the shorter array had zeros in the "missing" slots.)









         * Write a method that takes as its parameter an array a of integers and modifies the given array so that it contains a running sum of its original values. For example, if the array originally had the values [3 2 4 7], after running your method that array would instead contain [3 5 9 16], and if you ran it another time on the same array, you'd have [3 8 17 33].
         */
    }
}

