package kiemtragiuaky;

import java.util.Scanner;

public class Apple {

    String id,khoi_luong,mau_sac;

    static Scanner nhap = new Scanner(System.in);


    void inThongTin(){
            System.out.println("===================");
            System.out.println("Mã id: " + id);
            System.err.println("Khối Lượng: " + khoi_luong);
            System.out.println("Màu sắc: " + mau_sac);
    }
    void nhapThongTin(){
        System.out.println("Mã id: ");
        id = nhap.nextLine();
        System.out.println("Khối Lượng: ");
        khoi_luong = nhap.nextLine();
        System.out.println("Màu sắc: ");
        mau_sac = nhap.nextLine();
    }
}
