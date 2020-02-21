// https://www.geeksforgeeks.org/java-lang-system-class-java/

public class Chaney3 {
    private final static int TOTAL_ELEMENTS = 10;
    public static void main(String[] args) {
        // return sum of ints divisible by 3 and 5 up to int n
        System.out.println(solution(10));

        // Unix epoch time using System
        System.out.println("difference between the "
                + "current time and midnight,"
                + " January 1, 1970 UTC is: " +
                System.currentTimeMillis());
        System.out.println("cuurent time in "
                + "nano sec: " +
                System.nanoTime());

        //Write program to check if Java is installed (key/value pairs in private Properties class)
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");


        // Copy array using System class
        int[] src = new int[TOTAL_ELEMENTS];

        // Populate the array with some elements.
        for(int i = 0; i < TOTAL_ELEMENTS; ++i)
            src[i] = i + 1;

        // Print the elements.
        System.out.print("Source array: ");
        for(int i = 0; i < TOTAL_ELEMENTS; ++i)
            System.out.print(src[i] + " ");
        System.out.println();

        // Copy the array to the destination.
        int dst_size = src.length / 2;
        int[] dst = new int[dst_size];
        // Source array, index start, destination (copied) array, size of destination array (what index to copy to)
        System.arraycopy(src, 0, dst, 0, dst_size);

        // Print the elements.
        System.out.print("Destination array: ");
        for(int i = 0; i < dst_size; ++i)
            System.out.print(dst[i] + " ");
        System.out.println();

    }

    public static int solution(int number) {
        //TODO: Code stuff here
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }



}

