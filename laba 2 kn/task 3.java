import java.util.Scanner;

public class CelToFahr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        float celsius = scanner.nextFloat();
        float fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Температура по Фаренгейту: " + fahrenheit);
    }
}


//task3