package Lesson2;/*Проверить, имеет ли число вещественную часть.
 Например, число 3.14 – имеют вещественную часть, а число 11.0 – нет.
*/
import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        double n = scanner.nextDouble();

        if (n % 1 != 0) {
            System.out.println("Число" + n + " имеет вещественную часть");
        } else if (n % 1 == 0) {
            System.out.println("Число" + n + " не имеет вещественной части");
        }
    }
}
