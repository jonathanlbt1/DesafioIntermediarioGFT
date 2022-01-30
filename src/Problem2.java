import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};

        int N = scan.nextInt();
        if (N <= 1) {
            System.out.println("Top 1");
        } else if (N <= 3) {
            System.out.println("Top 3");
        } else if (N <= 5) {
            System.out.println("Top 5");
        } else if (N <= 10) {
            System.out.println("Top 10");
        } else if (N <= 25) {
            System.out.println("Top 25");
        } else if (N <= 50) {
            System.out.println("Top 50");
        } else if (N <= 100) {
            System.out.println("Top 100");
        }
    }
}