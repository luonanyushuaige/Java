public class pg13_方法调用 {
    public static void max (){
        int num = 111;

        if (num % 2 == 0) {
            System.out.println("这是偶数");
        }
        else {
            System.out.println("这是奇数");
        }
    }
    public static int min (int a , int b, int c, int d) {
        int isMin = a > b ? b : a;
        isMin = isMin > c ? c : isMin;
        isMin = isMin > d ? d : isMin;
//        System.out.println(isMin);
        return isMin;
    }
    public static void main(String[] args) {
        max();
        System.out.println(min (5,2,3,4));
    }

    
}
