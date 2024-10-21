import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        short a = 5;
        double b = 4.5;
        System.out.println(a);
        System.out.println("a = " + a);
        System.out.println("a = " + a + ", b = " + b);
        // a = 5, b = 4.5

        short x = 5;
        double y = 4.5;
        float z = 1.2f;
        /*
        d - для целочисленных
        f - для вещетсвенных
        c - для char
        s - для строк
        %% - экранирование процента
         */
        System.out.printf("x = %d, y = %f, z = %.2f\n", x, y, z);
        // x = 5, y = 4,500000, z = 1,20

        Scanner in = new Scanner(System.in);
        /*
        next(): считывает введенную строку до первого пробела;
        nextLine(): считывает введенную строку до перевода строки;
        nextByte(): считывает введенное число как byte;
        nextShort(): считывает введенное число как short;
        nextInt(): считывает введенное число как тип int;
        nextDouble(): считывает введенное число как double;
        nextFloat(): считывает введенное число как float;
        nextBoolean(): считывает значение boolean.
        */

        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        float height = in.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);

        // сканер необходимо закрывать
        in.close();
    }
}
