/*  Используя while, вывести в Standard Output первых 10 чисел Фибоначчи.
 */
package HomeWork.Lesson4;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int fib = 1;
        int i = 2;
        System.out.print("Фибоначчи числа " + n + ": ");
        System.out.print(a + " " + b);
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            i++;
            System.out.print(" " + fib);
        }
    }
}

