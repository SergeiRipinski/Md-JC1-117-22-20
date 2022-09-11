package HomeWork.Lesson2;
/*Подсчитать площадь и длину окружности для круга с радиусом r.
  Радиус должен быть задан переменной в программе. Вывести результат в консоль.
*/
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите радиус окружности"); //просим пользователя указать радиус
        int r = scanner.nextInt();
        int r1 = 2;

        System.out.println("Площадь окружности равна " + Math.PI * Math.pow(r,r1) ); //формула Площади окружности по радиусу S= п*r(в квадрате 2)
        System.out.println("Длина окружности равна " + 2 * (Math.PI * r)); //формула длины окружности по радиусу P = 2(П*r)
    }
}

