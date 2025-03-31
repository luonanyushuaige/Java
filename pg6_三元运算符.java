public class pg6_三元运算符 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println( a > b ? a : b);//20
        //三元运算符格式  a>b?a:b  输出较大值
        int max = a > b ? a : b;
        System.out.println("max = " + max);



        //三个和尚,比身高
        int height1 = 160;
        int height2 = 180;
        int height3 = 158;
        int max1 = height1 > height2 ? height1 : height2;
        int max2 = max1 > height3 ? max1 : height2;
        System.out.println("max2 = " + max2);
    }
}
