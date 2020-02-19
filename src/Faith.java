public class Faith {

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
//The four concepts of Object Oriented Programming  encapsulation, inheritance and polymorphism and abstraction
    //Encapsulation controls the way data is accessed or modifies, more flexible and easy changed code, change one part of the code without affecting other parts
    //To achieve encapsulation we will declare the class variables as private and provide public getters and setters methods to modify and view the variables
    //Example

    public static class Student {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        //Example 2

    }
}


