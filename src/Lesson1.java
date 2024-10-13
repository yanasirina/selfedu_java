public class Lesson1 {
    public static void main(String[] args) {
        final double PI = 3.14;

        short a;
        short b = 5;
        double e = 5.5, f;
        float varF = 3.5f;
        char ch = 'a';
        boolean fl = true, flFile = false;

        System.out.println(b);
        System.out.println(PI);

        a = 8;
        ch = 'b';
        System.out.println(a);
        System.out.println(ch);

        a++;
        System.out.println(a);

        a += 2;
        System.out.println(a);

        e = e + 1;
        System.out.println(e);

        varF =  varF + 1;
        System.out.println(varF);

        int x = 10_000_000;
        short y;
        y = (short)x;
        System.out.println(y); // неожиданно -27008

        float var_f = 8.7f;
        int var_i;
        var_i = (int)var_f;
        System.out.println(var_i);  // 8 (только целая часть)


    }
}
