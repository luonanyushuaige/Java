public class pg12_最大值 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,1,3,5};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
