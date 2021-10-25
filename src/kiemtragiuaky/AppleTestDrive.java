package kiemtragiuaky;

import java.util.Scanner;

public class AppleTestDrive {
    public static void main(String[] args) {
        AppleData apple1 = new AppleData();
        Scanner nhap = new Scanner(System.in);
        do {
            System.out.println("1 Nhập Danh Sách Apple");
            System.out.println("2 Xuất Danh Sách Apple");
            System.out.println("3 Tìm Theo Màu");
            System.out.println("Chọn chức năng 1->3 : ");
            int luaChon = nhap.nextInt();

            switch (luaChon) {
            case 1:
                apple1.nhapDanhSach();
                break;
            case 2:
                apple1.xuatDanhSach();
                break;
            case 3:
                apple1.timTheoMau(); break;
            case 4:
                System.out.println("Kết Thúc!");
                System.exit(0);
                break;
            }
            nhap.nextLine();
        } while (nhap.nextLine().equals("y"));
    }
}