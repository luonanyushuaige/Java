public class pg10_跳转控制 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i >= 7) {
                break;
            }
            System.out.println(i);

        }
    }
}
