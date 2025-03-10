import java.util.Scanner;

public class MangThemSuaXoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        do {
            System.out.println("\n----------MENU----------");
            System.out.println("1. Thêm phần tử vào mảng");
            System.out.println("2. Cập nhật phần tử trong mảng");
            System.out.println("3. Xóa phần tử trong mảng");
            System.out.println("4. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập giá trị muốn thêm vào mảng: ");
                    int valueToAdd = sc.nextInt();
                    System.out.print("Nhập vị trí muốn thêm vào mảng: ");
                    int positionToAdd = sc.nextInt();

                    if (positionToAdd < 0 || positionToAdd > n) {
                        System.out.println("Vị trí không hợp lệ!");
                    } else {
                        int[] newArray = new int[n + 1];

                        for (int i = 0, j = 0; i < newArray.length; i++) {
                            if (i == positionToAdd) {
                                newArray[i] = valueToAdd;
                            } else {
                                newArray[i] = arr[j++];
                            }
                        }

                        arr = newArray;
                        n++;
                        System.out.print("Mảng sau khi thêm: ");
                        printArray(arr);
                    }
                    break;

                case 2:
                    System.out.print("Nhập giá trị phần tử muốn cập nhật: ");
                    int oldValue = sc.nextInt();
                    System.out.print("Nhập giá trị mới: ");
                    int newValue = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == oldValue) {
                            arr[i] = newValue;
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Giá trị cần cập nhật không tồn tại trong mảng!");
                    } else {
                        System.out.print("Mảng sau khi cập nhật: ");
                        printArray(arr);
                    }
                    break;

                case 3:
                    System.out.print("Nhập giá trị phần tử muốn xóa: ");
                    int valueToDelete = sc.nextInt();
                    int count = 0;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == valueToDelete) {
                            count++;
                        }
                    }

                    if (count == 0) {
                        System.out.println("Phần tử không tồn tại trong mảng.");
                    } else {
                        int[] tempArray = new int[n - count];
                        int index = 0;

                        for (int i = 0; i < n; i++) {
                            if (arr[i] != valueToDelete) {
                                tempArray[index++] = arr[i];
                            }
                        }

                        arr = tempArray;
                        n -= count;
                        System.out.print("Mảng sau khi xóa: ");
                        printArray(arr);
                    }
                    break;

                case 4:
                    System.out.println("Đã thoát chương trình!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        } while (true);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
