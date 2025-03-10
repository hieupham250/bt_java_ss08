package Bai_tap_lark;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang n: ");
        int n = sc.nextInt();
        System.out.print("Nhap so cot m: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        do {
            System.out.println("************** MENU **************");
            System.out.println("1. Nhap gia tri cac phan tu cua mang");
            System.out.println("2. In gia tri cac phan tu trong mang theo ma tran");
            System.out.println("3. Tinh so luong cac phan tu chia het cho 2 va 3 trong mang");
            System.out.println("4. In cac phan tu va tong cac phan tu nam tren duong bien, duong cheo chinh va duong cheo phu");
            System.out.println("5. Sap xep tang dan theo cot cua mang");
            System.out.println("6. In ra cac phan tu la so nguyen to trong mang");
            System.out.println("7. Sap xep cac phan tu tren duong cheo chinh giam dan");
            System.out.println("8. Chen mang 1 chieu vao mang 2 chieu");
            System.out.println("9. Thoat");
            System.out.print("Chon chuc nang: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap cac phan tu cua mang:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            arr[i][j] = sc.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Mang da nhap:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (arr[i][j] % 2 == 0 && arr[i][j] % 3 == 0) {
                                count++;
                            }
                        }
                    }
                    System.out.println("So luong phan tu chia het cho 2 va 3: " + count);
                    break;
                case 4:
                    int sum = 0;
                    System.out.println("Cac phan tu tren duong bien, duong cheo chinh va duong cheo phu:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (i == 0 || j == 0 || i == n - 1 || j == m - 1 || i == j || i + j == n - 1) {
                                System.out.print(arr[i][j] + " ");
                                sum += arr[i][j];
                            }
                        }
                    }
                    System.out.println("\nTong: " + sum);
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Cac so nguyen to trong mang:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (arr[i][j] < 2) {
                                continue;
                            }
                            boolean isPrime = true;
                            for (int k = 2; k <= Math.sqrt(arr[i][j]); k++) {
                                if (arr[i][j] % k == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                            if (isPrime) {
                                System.out.print(arr[i][j] + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.print("Da thoat chuong trinh!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (true);
    }
}
