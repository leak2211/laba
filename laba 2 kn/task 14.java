import java.util.Scanner;

public class SignFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int x = scanner.nextInt();

        if (x > 0) {
            System.out.println("1");
        } else if (x < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
    }
}
//task 14