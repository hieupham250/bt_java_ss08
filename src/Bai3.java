import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email, password;
        String emailRegex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        String specialChars = "!@#$%^&*()-+";

        while (true) {
            System.out.print("Nhập email: ");
            email = sc.nextLine().trim();

            System.out.print("Nhập mật khẩu: ");
            password = sc.nextLine().trim();

            boolean isEmailValid = email.matches(emailRegex) && email.indexOf('@') == email.lastIndexOf('@');
            boolean isPasswordValid = false;

            if (password.length() >= 8) {
                boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

                for (int i = 0; i < password.length(); i++) {
                    char ch = password.charAt(i);

                    if (ch >= 'A' && ch <= 'Z') {
                        hasUpper = true;
                    } else if (ch >= 'a' && ch <= 'z') {
                        hasLower = true;
                    } else if (ch >= '0' && ch <= '9') {
                        hasDigit = true;
                    } else if (specialChars.indexOf(ch) != -1) {
                        hasSpecial = true;
                    }
                }

                isPasswordValid = hasUpper && hasLower && hasDigit && hasSpecial;
            }
            if (isEmailValid && isPasswordValid) {
                System.out.println("\nEmail và mật khẩu hợp lệ!");
                break;
            }

            // Thông báo lỗi
            if (!isEmailValid) {
                System.out.println("Email không hợp lệ. Vui lòng nhập lại!");
            }
            if (!isPasswordValid) {
                System.out.println("Mật khẩu không hợp lệ. Vui lòng nhập lại!");
            }
        }
        sc.close();
    }
}
