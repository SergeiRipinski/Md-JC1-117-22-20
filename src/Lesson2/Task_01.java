package Lesson2;/*В переменных х и y хранятся два целых числа. Создайте программу,
  выводящую в консоль:
  результат деления x на y;
  остаток от деления x на y;
  */
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число х"); //просим пользователя ввести число Х с консоли
        int x = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число y"); //просим пользователя ввести число Y с консоли
        int y = scanner1.nextInt();

        System.out.println("Резьтат деления х на y =" + (x / y)); //вывожим в консоль результат деления
        System.out.println("Остаток от деления x на y =" + (x % y)); //выводим в консоль результат остатка от деления
        }

    }
