import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位评委的打分: ");
            arr[i] = sc.nextInt();
        }
        sc.close(); // 关闭Scanner对象

        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getSum(arr);
        double average = (sum - min - max) / 4.0; // 使用浮点数计算平均值
        System.out.println("去掉一个最高分和一个最低分后的平均分是: " + average);
    }

    public static int getMax(int[] arr) {
        int max = arr[0]; // 初始化为第一个元素
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0]; // 初始化为第一个元素
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
}
