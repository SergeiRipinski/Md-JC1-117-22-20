package HomeWork.Lesson2;
/*Есть прямоугольник, у которого известна ширина w и высота h.
  Высота и ширина прямоугольника должны задаваться переменными в программе. Найти и вывести в консоль:
  периметр прямоугольника
  площадь прямоугольника
  */
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите ширину"); //просим пользователя указать ширину прямоугольника
        int w = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Укажите высоту"); //просим пользователя указать высоту прямоугольника
        int h = scanner1.nextInt();

        System.out.println("Периметр прямоугольника равен " + 2 * (w + h)); //вывожим в консоль результат деления
        System.out.println("Площадь прямоугольника равна " + (w * h)); //выводим в консоль результат остатка от деления
    }

}


