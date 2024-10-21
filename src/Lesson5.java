import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        /*
        && - И
        // - ИЛИ
        ! - НЕ
         */
        short item = -1;
        Scanner in = new Scanner(System.in);
        System.out.print("1 - площадь треугольника\n2 - площадь прямоугольника\n");
        item = in.nextShort();

        double h, a, S = 0;
        if (item == 1) {
            System.out.print("Введите высоту и основание треугольника: ");
            h = in.nextDouble();
            a = in.nextDouble();
            S = 0.5*h*a;
        }
        else if (item == 2) {
            System.out.print("Введите стороны прямоугольника: ");
            h = in.nextDouble();
            a = in.nextDouble();
            S = h * a;
        }
        System.out.println("Площадь равна: " + S);


        System.out.print("0 - выход из программы\n1 - площадь треугольника\n2 - площадь прямоугольника\n3 - площадь круга\n4 - площадь трапеции\n");
        item = in.nextShort();
        switch (item) {
            case 1: System.out.println("выбрана площадь треугольника");
            case 2: System.out.println("выбрана площадь прямоугольника");
            case 3: System.out.println("выбрана площадь круга");
            case 4: System.out.println("выбрана площадь трапеции");
            default: System.out.println("не выбран ни один из пунктов меню");
        }

        in.close();
    }
}
