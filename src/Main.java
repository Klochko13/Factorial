import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Введите число");
        int num = key.nextInt();
        int result = 1;
        for (int i = 1; i <=num; i++) {
            result = result * i;

        }
        System.out.printf ("Факториал числа %d составляет %d", num, result);
    }
}