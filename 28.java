import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long temp = Math.abs((long)n);
        int count = 0;

        if (temp == 0)
            count = 1;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        System.out.println("Number of Digits = " + count);
    }
}
