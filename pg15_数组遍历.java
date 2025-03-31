public class pg15_数组遍历 {
    public static void getnum(int arr[]) {
        System.out.print("arr =");
        System.out.print('[');

        for (int x = 0;x < arr.length;x++){
            System.out.print(arr[x]);
            System.out.print(',');
        }
        System.out.println(']');
    }


    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        getnum(arr);
    }


}
