import java.util.Scanner;

public class pg7_案例 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高");
        int a = sc.nextInt();
        System.out.println("请输入第二个和尚的身高");
        int b = sc.nextInt();
        System.out.println("请输入第三个和尚的身高");
        int c = sc.nextInt();

        int max = a > b ? a : b;
        int max2 = max > c ? max : c;
        System.out.println(max2);
    }
}
