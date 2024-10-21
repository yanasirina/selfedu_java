public class Lesson3 {
    public static void main(String[] args) {
        float a = 5.8f, b = 7.6f;
        double c = a-b;
        int d = (int )(a-b);
        System.out.println(c);  // -1.799999713897705
        System.out.println(d);  // -1

        int x = 7;
        int y = 2;
        double z = x/y;
        System.out.println(z);  // 3.0
        double z2 = (double)x/y;
        System.out.println(z2);  // 3.5

        double r = 3.1;
        r++;
        System.out.println(r);  // 4.1
    }
}
