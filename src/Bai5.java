import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {};
        int n = 0;
        do {
            System.out.println("************** MENU **************");
            System.out.println("1. Nhap gia tri n phan tu cua mang");
            System.out.println("2. In gia tri cac phan tu trong mang");
            System.out.println("3. Tinh trung binh cac phan tu duong");
            System.out.println("4. Tim vi tri cac phan tu co gia tri bang k");
            System.out.println("5. Tinh so luong cac phan tu la so nguyen to");
            System.out.println("6. Thoat chuong trinh");
            System.out.print("Chon chuc nang: ");
            int choice = sc.nextInt();
            int sum = 0, count = 0;
            switch (choice) {
                case 1:
                    System.out.print("Nhap so luong phan tu: ");
                    n = sc.nextInt();
                    arr = new int[n];
                    System.out.println("Nhap cac phan tu: ");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Cac phan tu trong mang: ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] > 0) {
                            sum += arr[i];
                            count++;
                        }
                    }
                    System.out.println("Trung binh cac so duong: " + (count > 0 ? (double) sum / count : 0));
                    break;
                case 4:
                    System.out.print("Nhap gia tri k: ");
                    int k = sc.nextInt();
                    System.out.print("Vi tri cac phan tu bang k: ");
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == k) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    count = 0;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] < 2) {
                            continue;
                        }
                        boolean isPrime = true;
                        for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                            if (arr[i] % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            count++;
                        }
                    }
                    System.out.println("So luong cac so nguyen to trong mang: " + count);
                    break;
                case 6:
                    System.out.print("Da thoat chuong trinh");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui long chon 1-6");
            }
        } while (true);
    }
}