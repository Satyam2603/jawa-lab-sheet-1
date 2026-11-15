import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        if (n < 100 || n > 999) {
            System.out.println("Enter a valid three-digit number");
        } else {
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + digit * digit * digit;
                temp = temp / 10;
            }

            if (sum == n)
                System.out.println("Armstrong Number");
            else
                System.out.println("Not an Armstrong Number");
        }
    }
}
