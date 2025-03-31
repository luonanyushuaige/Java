public class pg3 {
    public static void main(String[] args) {
        int a = 44;
        int b = 20;
//        int c = a + b;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        //除法要输出小数,两变量必须为浮点类型


        double c = 3.14;
        System.out.println(c);
        double d = a + b+ c;
        System.out.println(d);



        System.out.println(9 + "hallo");//9hallo
        System.out.println("hallo" + 9);//hallo9
        System.out.println(9 + 99 + "hallo");//108hallo
        System.out.println(9  + "hallo" );//9hallo
        System.out.println(9  + "hallo" +999);//9hallo999
        System.out.println("hallo" + 999 + 9);//hallo9999
    }
}
