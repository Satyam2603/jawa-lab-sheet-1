import java.util.Scanner;

public class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers (0 or 1): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter operator (&, |, ^): ");
        char op = sc.next().charAt(0);

        if ((a != 0 && a != 1) ||
            (b != 0 && b != 1)) {
            System.out.println("Enter only 0 or 1");
        }
        else if (op == '&') {
            System.out.println("Result = " + (a & b));
        }
        else if (op == '|') {
            System.out.println("Result = " + (a | b));
        }
        else if (op == '^') {
            System.out.println("Result = " + (a ^ b));
        }
        else {
            System.out.println("Invalid Operator");
        }
    }
}
