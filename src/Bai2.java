import java.util.Scanner;

public class Bai2 {
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
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Tổng = " + sum);
        } else {
            System.out.println("Không có số chia hết cho 3");
        }
        sc.close();
    }
}
