public class pg4_自增自减运算符 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        i++;
        System.out.println(i);//11
        ++i;
        System.out.println(i);//12

        int j = 10;
        System.out.println(j);//10
        j = ++i;
        System.out.println(j);//13
        System.out.println(i);//13
        j = i++;
        System.out.println(j);//13
        System.out.println(i);//14
    }
}
