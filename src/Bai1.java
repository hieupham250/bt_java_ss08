import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Nhập kích thước của mảng: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Kích thước không hợp lệ. Vui lòng nhập số nguyên dương.");
                }
            } else {
                System.out.println("Kích thước không hợp lệ. Vui lòng nhập số nguyên dương.");
                sc.next();
            }
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Giá trị lớn nhất trong mảng: " + max);
        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);

        sc.close();
    }
}
