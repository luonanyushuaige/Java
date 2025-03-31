import java.util.Scanner;

public class pg_17减肥计划if版 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("星期");
        int a = sc.nextInt();
        if ( a == 1){
            System.out.println("游泳");
        }
        if (a == 2){
            System.out.println("跑步");
        }
        if (a == 3){
            System.out.println("");
        }
    }
}
