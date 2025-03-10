import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int[] arr = {};
        int n = 0;
        String result = "";
        while (true) {
            System.out.println("\n===== MENU CHINH =====");
            System.out.println("1. Xu ly chuoi");
            System.out.println("2. Xu ly so nguyen");
            System.out.println("3. Thoat chuong trinh");
            System.out.print("Chon chuc nang (1-3): ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("\n===== MENU XU LY CHUOI =====");
                        System.out.println("1. Nhap chuoi");
                        System.out.println("2. Loai bo khoang trang thua");
                        System.out.println("3. Dem so lan xuat hien cua tung ky tu");
                        System.out.println("4. Chuyen doi chuoi thanh chuan");
                        System.out.println("5. Quay lai menu chinh");
                        System.out.print("Chon chuc nang (1-5): ");
                        int subChoice = sc.nextInt();
                        if (subChoice == 5) {
                            break;
                        }
                        switch (subChoice) {
                            case 1:
                                sc.nextLine();
                                System.out.print("Nhap chuoi: ");
                                str = sc.nextLine();
                                break;
                            case 2:
                                str = str.trim().replaceAll("\\s+", " ");
                                System.out.println("Chuoi sau khi loai bo khoang trang thua: " + str);
                                break;
                            case 3:
                                result = "";
                                String checkedChars = "";
                                for (int i = 0; i < str.length(); i++) {
                                    char c = str.charAt(i);
                                    if (checkedChars.indexOf(c) == -1) {
                                        int count = 0;
                                        for (int j = 0; j < str.length(); j++) {
                                            if (str.charAt(j) == c) count++;
                                        }
                                        result += "'" + c + "': " + count + "\n";
                                        checkedChars += c;
                                    }
                                }
                                System.out.println(result);
                                break;
                            case 4:
                                str = str.toLowerCase().trim();
                                result = "";
                                boolean capitalize = true;

                                for (int i = 0; i < str.length(); i++) {
                                    char c = str.charAt(i);
                                    if (Character.isLetter(c)) {
                                        if (capitalize) {
                                            result += Character.toUpperCase(c);
                                            capitalize = false;
                                        } else {
                                            result += c;
                                        }
                                    } else {
                                        result += c;
                                        if (c == ' ') {
                                            capitalize = true;
                                        }
                                    }
                                }
                                str = result;
                                System.out.println("Chuoi chuan hoa: " + str);
                                break;
                            default:
                                System.out.println("Lua chon khong hop le!");
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("\n===== MENU XU LY MANG SO NGUYEN =====");
                        System.out.println("1. Nhap mang so nguyen");
                        System.out.println("2. Tim so nguyen to lon nhat trong mang");
                        System.out.println("3. Dem so phan tu co chu so dau tien la so le");
                        System.out.println("4. Kiem tra mang co phai la mang doi xung khong");
                        System.out.println("5. Quay lai menu chinh");
                        System.out.print("Chon chuc nang (1-5): ");
                        int subChoice = sc.nextInt();

                        if (subChoice == 5) {
                            break;
                        } ;
                        switch (subChoice) {
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
                                int maxPrime = -1;
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
                                    if (isPrime && arr[i] > maxPrime) {
                                        maxPrime = arr[i];
                                    }
                                }
                                if (maxPrime == -1) {
                                    System.out.println("Mang khong co so nguyen to!");
                                } else {
                                    System.out.println("So nguyen to lon nhat: " + maxPrime);
                                }
                                break;
                            case 3:
                                int count = 0;
                                for (int i = 0; i < arr.length; i++) {
                                    int firstDigit = Math.abs(arr[i]); // Lấy giá trị tuyệt đối để tránh số âm
                                    while (firstDigit >= 10) {
                                        firstDigit /= 10; // Lấy chữ số đầu tiên
                                    }
                                    if (firstDigit % 2 != 0) {
                                        count++;
                                    }
                                }
                                System.out.println("So phan tu co chu so dau tien la so le: " + count);
                                break;
                            case 4:
                                boolean isSymmetric = true;
                                for (int i = 0; i < arr.length / 2; i++) {
                                    if (arr[i] != arr[arr.length - 1 - i]) {
                                        isSymmetric = false;
                                        break;
                                    }
                                }
                                System.out.println(isSymmetric ? "Mang la doi xung" : "Mang khong la doi xung");
                                break;
                            default:
                                System.out.println("Lua chon khong hop le!");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Da thoat chuong trinh!");
                    sc.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai.");
            }
        }
    }
}
