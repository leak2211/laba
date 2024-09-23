import java.util.Scanner;



public class LinearCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("INF"); 
        } else if (a == 0) {
            System.out.println("NO");  
        } else {
            if (b % a == 0) { 
                int solution = -b / a;
                System.out.println("Решение в целых числах: " + solution);
            } else {
                System.out.println("Решение не является целым числом: " + (-b / (double) a));
            }
        }
    }
}

//task 8 переделан