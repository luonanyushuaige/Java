public class pg14_方法重载 {
    public static int arr (int a , int b){
        return a + b;

    }
    public static double arr (double a , double b, double c){
        return a + b + c;
    }


    public static void main(String[] args) {
        int number = 10 ;
        change(number);
        System.out.println(number);
    }
    public static void change(int number){
        number = 1;
    }

}
