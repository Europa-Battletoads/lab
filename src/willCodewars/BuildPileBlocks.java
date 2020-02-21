package willCodewars;

public class BuildPileBlocks {
    public static void main(String[] args) {
        System.out.println(findNumBlocks(225)); //5. Bottom block is 5^3 = 225
        System.out.println(findNumBlocks(125)); //-1 Impossible bottom block
        System.out.println(findNumBlocks(0)); //0
        System.out.println(findNumBlocks(441)); //6
        System.out.println(findNumBlocks(444)); //-1
    }

    public static long findNumBlocks(long m) {
        long sum = 0;
        long n = 0;
        while (sum < m) {
            n++;
            sum += n*n*n;
        }
        if (sum == m) {
            return n;
        } else {
            return -1;
        }
    }
}
