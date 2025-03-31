public class pg9_for循环 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println("你好啊第"+i+"个人");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 5; i > 0; i -= 1) {
            System.out.println(i);
        }

        int a = 0;
        for (int i = 1; i <= 5; i++) {
            a += i;
        }
        System.out.println(a);

        int b = 0;
        for (int i = 1; i <= 50; i++) {
            b += 2*i;
        }
        System.out.println(b);
    }
}
