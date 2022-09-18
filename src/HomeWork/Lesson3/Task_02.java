/* Написать программу, которая в зависимости от значения переменной с номером дня недели,
   показывает название этого дня (например, 6 – это суббота).
   Решить с использованием if-else.
*/

package HomeWork.Lesson3;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int day = scanner.nextInt();

        if (day == 1) {
            System.out.println("The day is Sunday");
        } else if (day == 2) {
            System.out.println("The day is Sunday");
        } else if (day == 3) {
            System.out.println("The day is Sunday");
        } else if (day == 4) {
            System.out.println("The day is Sunday");
        } else if (day == 5) {
            System.out.println("The day is Sunday");
        } else if (day == 6) {
            System.out.println("The day is Sunday");
        } else if (day == 7) {
            System.out.println("The day is Sunday");
        } else {
            System.out.println(" Incorrect input number");
        }
    }
}
