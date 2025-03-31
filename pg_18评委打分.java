import java.util.Scanner;

public class pg_18评委打分 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [6];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第"+(i+1)+"位评委的打分");
            arr[i] = sc.nextInt();
        }

        int max =getmax(arr);
        int min =getmin(arr);
        int sum =getsum(arr);
        double num =(sum - min - max)/4.0;
        System.out.println(num);
    }
    public static int getmax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;

        }
        return max;
    }

    public static int getmin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = arr[i] < min ? arr[i] : min;
        }
        return min;
    }

    public static int getsum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


}
