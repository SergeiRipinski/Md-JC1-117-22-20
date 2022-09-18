/* Написать программу, которая в зависимости от значения переменной, содержащей значение текущего часа, показывает приветствие,
   соответствующее этому часу (например, 11 – выводится приветствие "Доброе утро").
   Решить с использованием switch.
*/

package HomeWork.Lesson3;
import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 24");
        int inputNumber = scanner.nextInt();

        switch (inputNumber) {
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("доброй ночи");
                break;
            case 6 :
            case 7 :
            case 8 :
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Доброе утро");
                break;
            case 12 :
            case 13 :
            case 14 :
            case 15 :
            case 16 :
            case 17 :
                System.out.println("Добрый день");
                break;
            case 18 :
            case 19 :
            case 20 :
            case 21 :
            case 22 :
            case 23 :
            case 24 :
                System.out.println("Добрый вечер");
                break;
            default:
                System.out.println("В сутках 24 часа, не верно введены данные");
        }
    }
}
