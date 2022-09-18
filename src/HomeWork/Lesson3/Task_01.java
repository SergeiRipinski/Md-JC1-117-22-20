/*Написать программу, которая в зависимости от значения переменной с номером дня недели, показывает название этого дня (например, 5 – это пятница).
  Решить с использованием switch.
*/

package HomeWork.Lesson3;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int inputNumber = scanner.nextInt();
        String day;
        switch (inputNumber) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day";
                break;
        }
        System.out.println("The day is "+ day);
    }
}
