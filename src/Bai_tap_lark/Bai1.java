package Bai_tap_lark;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {};
        int n, count = 0;
        do {
            System.out.println("************** MENU **************");
            System.out.println("1. Nhap gia tri n phan tu cua mang");
            System.out.println("2. In gia tri cac phan tu trong mang");
            System.out.println("3. Tinh trung binh cac phan tu duong");
            System.out.println("4. Tim vi tri cac phan tu co gia tri bang k");
            System.out.println("5. Sap xep mang giam dan (Bubble Sort)");
            System.out.println("6. Dem so nguyen to trong mang");
            System.out.println("7. Sap xep theo yeu cau dac biet");
            System.out.println("8. Chen gia tri m vao mang da sap xep giam dan");
            System.out.println("9. Thoat chuong trinh");
            System.out.print("Chon chuc nang: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap so luong phan tu mang:");
                    n = sc.nextInt();
                    arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Cac phan tu trong mang:");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    int sum = 0;
                    count = 0;
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
                    for (int i = 0; i < arr.length - 1; i++) {
                        for (int j = 0; j < arr.length - 1 - i; j++) {
                            if (arr[j] < arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Mang sau khi sap xep giam dan: ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 6:
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
                    System.out.println("So luong so nguyen to: " + count);
                    break;
                case 7:
                    // Phân loại vị trí các nhóm trong mảng
                    int[] temp = new int[arr.length];
                    int idx = 0;

                    // Đưa chẵn chia hết cho 3 vào đầu mảng
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 3 == 0 && arr[i] % 2 == 0) {
                            temp[idx++] = arr[i];
                        }
                    }

                    // Đưa các phần tử còn lại vào giữa
                    for (int i = 0; i < arr.length; i++) {
                        if (!(arr[i] % 3 == 0)) {
                            temp[idx++] = arr[i];
                        }
                    }

                    // Đưa lẻ chia hết cho 3 vào cuối mảng
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 3 == 0 && arr[i] % 2 != 0) {
                            temp[idx++] = arr[i];
                        }
                    }

                    // Copy lại vào mảng chính
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = temp[i];
                    }

                    // Sắp xếp nhóm 1 (chẵn chia hết cho 3) tăng dần
                    int end1 = 0;
                    while (end1 < arr.length && arr[end1] % 3 == 0 && arr[end1] % 2 == 0) end1++;
                    for (int i = 0; i < end1 - 1; i++) {
                        for (int j = i + 1; j < end1; j++) {
                            if (arr[i] > arr[j]) {
                                int tempVal = arr[i];
                                arr[i] = arr[j];
                                arr[j] = tempVal;
                            }
                        }
                    }

                    // Sắp xếp nhóm 2 (phần còn lại) tăng dần
                    int start2 = end1, end2 = arr.length;
                    while (start2 < arr.length && arr[start2] % 3 != 0) start2++;
                    for (int i = end1; i < start2 - 1; i++) {
                        for (int j = i + 1; j < start2; j++) {
                            if (arr[i] > arr[j]) {
                                int tempVal = arr[i];
                                arr[i] = arr[j];
                                arr[j] = tempVal;
                            }
                        }
                    }

                    // Sắp xếp nhóm 3 (lẻ chia hết cho 3) giảm dần
                    for (int i = start2; i < arr.length - 1; i++) {
                        for (int j = i + 1; j < arr.length; j++) {
                            if (arr[i] < arr[j]) {
                                int tempVal = arr[i];
                                arr[i] = arr[j];
                                arr[j] = tempVal;
                            }
                        }
                    }

                    // In mảng kết quả
                    System.out.println("Mang sau khi sap xep theo yeu cau dac biet:");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 8:
                    System.out.print("Nhap gia tri m can chen: ");
                    int m = sc.nextInt();
                    int[] newArr = new int[arr.length + 1];
                    boolean inserted = false;
                    int j = 0;
                    for (int i = 0; i < arr.length; i++) {
                        if (!inserted && arr[i] < m) {
                            newArr[j++] = m;
                            inserted = true;
                        }
                        newArr[j++] = arr[i];
                    }
                    if (!inserted) {
                        newArr[j] = m;
                    }
                    arr = newArr;
                    System.out.println("Mang sau khi chen " + m + " vao:");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
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
