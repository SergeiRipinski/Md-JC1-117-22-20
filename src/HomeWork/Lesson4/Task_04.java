/* Вывести таблицу умножения чисел от 1 до 10 (используя while внутри while).
 */
package HomeWork.Lesson4;

public class Task_04 {
    public static void main(String[] args) {

        int i = 1, n = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            while (n <= 9) {
                n++;
                System.out.print(i * n + " ");
            }
            i++;
            n = 1;
            System.out.println("");
        }
    }
}
