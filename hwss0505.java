import java.util.Scanner;

public class hwss0505 {
    public static boolean check_palindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString().equals(s);
    }
    public static String chuan_hoa(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.setCharAt(0, Character.toUpperCase(s.charAt(0)));
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (true) {
            System.out.println("******************** MENU ********************");
            System.out.println("1. Nhập chuỗi");
            System.out.println("2. Đếm số ký tự thường, hoa, số, đặc biệt");
            System.out.println("3. Đảo ngược chuỗi");
            System.out.println("4. Kiểm tra Palindrome");
            System.out.println("5. Chuẩn hóa chuỗi");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            int n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    System.out.print("Nhập chuỗi: ");
                    s =  sc.nextLine();
                    break;
                case 2:
                    if (s.isEmpty()) System.out.println("Bạn chưa nhập chuỗi! Vui lòng nhập chuỗi!");
                    else {
                        int thuong = 0;
                        int hoa = 0;
                        int so = 0;
                        int db = 0;
                        for (int i = 0; i < s.length(); i++) {
                            char c = s.charAt(i);
                            if (Character.isLowerCase(c)) thuong++;
                            else if (Character.isUpperCase(c)) hoa++;
                            else if (Character.isDigit(c)) so++;
                            else db++;
                        }
                        System.out.println("Số ký tự thường: "+thuong);
                        System.out.println("Số ký tự hoa: "+hoa);
                        System.out.println("Số chữ số: "+so);
                        System.out.println("Số ký tự đặc biệt: "+db);
                    }
                    break;
                case 3:
                    if (s.isEmpty()) System.out.println("Bạn chưa nhập chuỗi! Vui lòng nhập chuỗi!");
                    else {
                        System.out.println(new StringBuilder(s).reverse());
                    }
                    break;
                case 4:
                    if (s.isEmpty()) System.out.println("Bạn chưa nhập chuỗi! Vui lòng nhập chuỗi!");
                    else {
                        if (check_palindrome(s)) System.out.println("Chuỗi đúng là Palindrome.");
                        else System.out.println("Chuỗi không phải Palindrome.");
                    }
                    break;
                case 5:
                    if (s.isEmpty()) System.out.println("Bạn chưa nhập chuỗi! Vui lòng nhập chuỗi!");
                    else {
                        System.out.println("Chuỗi sau khi chuẩn hóa: " + chuan_hoa(s));
                    }
                    break;
                case 6:
                    System.out.println("Tạm biệt!");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập đúng lệnh có trên bảng trên!");
            }
        }
    }
}
