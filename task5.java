public class task5 {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;

        if (b == 0) {
            System.out.println("1");
        } else if (b == 1) {
            System.out.println(a);
        } else if (b < 0) {
            float f = a;
            for (int i = 0; i >= b; i--) {
                f = f / a;
            }
            System.out.println(f);
        } else {
            for (int i = 1; i < b; i++) {
                a = a * a;
            }
            System.out.println(a);
        }
    }
}
