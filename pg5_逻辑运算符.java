public class pg5_逻辑运算符 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        //& 有false则false
        System.out.println((a > b) & (c > b));//f
        System.out.println((a < b) & (c > b));//t
        System.out.println((a > b) & (c < b));//f
        System.out.println((a < b) & (c < b));//f
        System.out.println("-----------------");
        //& 和  and

        //| 有true则true
        System.out.println((a > b) | (c > b));//t
        System.out.println((a < b) | (c > b));//t
        System.out.println((a > b) | (c < b));//f
        System.out.println((a < b) | (c < b));//t
        System.out.println("-----------------");
        //| 是或   or

        //^ 相同是true,不同是false
        System.out.println((a > b) ^ (c > b));//t
        System.out.println((a < b) ^ (c > b));//f
        System.out.println((a > b) ^ (c < b));//f
        System.out.println((a < b) ^ (c < b));//t
        System.out.println("-----------------");


        //! 逻辑非
        System.out.println(a > b);
        System.out.println(!(a > b));
        System.out.println(!!(a > b));
        System.out.println(!!!(a > b));
        System.out.println("-----------------");

        //&& 短路与 若短路与的左边为false则右边不执行
        System.out.println((a++ > 100) && (b++ > 100));
        System.out.println(a);//11
        System.out.println(b);//20

        //短路或同理, || 短路或的左边为true则右边不执行
        System.out.println((a++ < 100) || (b++ < 100));
        System.out.println(a);//12
        System.out.println(b);//20

    }
}
