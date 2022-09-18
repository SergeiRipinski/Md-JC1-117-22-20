/*Написать программу, которая в зависимости от значения переменной, содержащей значение текущего часа,
  показывает приветствие, соответствующее этому часу (например, 11 – выводится приветствие "Доброе утро").

  Решить с использованием if-else.
 */

package HomeWork.Lesson3;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 24 для определения времени суток");
        int time = scanner.nextInt();

        if (time >= 6 && time <= 11) {
            System.out.println("Доброе утро");
        } else if (time >= 12 && time <= 17) {
            System.out.println("Добрый день");
        } else if (time >= 18 && time <= 24) {
            System.out.println("Добрый вечер");
        } else if (time >= 0 && time <= 5){
            System.out.println("Доброй ночи");
        } else {
            System.out.println("Введённое число не верно, в сутках всего 24 часа");
        }
    }
}

/* Можно ли в джаве указать сперва диапозон чисел к примеру от 0 до 24 и если введённое число подходит для условий то выполнять блок if ,
   а если нет то сразу кидать ошибку описанную в else ?
 */




