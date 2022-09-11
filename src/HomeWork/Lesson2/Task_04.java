package HomeWork.Lesson2;
/*В переменной n хранится целое трехзначное число.
  Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
*/
import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное целое число"); //просим пользователя ввести целое трехзначное число и записываем его в переменную n в 10 строке
        int n = scanner.nextInt();

        System.out.println("Сумма цифр числа " +n +" равна "+((n%10)+((n/10)%10)+((n/100)%10)));
    }
}
