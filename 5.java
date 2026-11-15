import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating number: ");
        double num = sc.nextDouble();

        int result = (int) num;

        System.out.println("Original Value: " + num);
        System.out.println("Converted Value: " + result);
    }
}
