package Tuan04.BaiTapThem;

import java.util.Scanner;

public class MayTinh {
    String nhaSanXuat;
    int namSanXuat;
    String heDieuHanh;
    String RAM;
    String CPU;
    double gia;
    int namBaoHanh;
    Scanner n = new Scanner(System.in);

    void inThongTin(){
        System.out.println("Nhà sản xuất: "+nhaSanXuat);
        System.out.printf("Năm sản xuất: "+namSanXuat);
        System.out.println("\nHệ điều hành: "+heDieuHanh);
        System.out.println("RAM: "+RAM);
        System.out.println("CPU: "+CPU);
        System.out.println("Giá bán: "+gia+"Đồng");
        System.out.println("Năm bảo hành: "+namBaoHanh);
    }
    void nhapThongTin(){
        System.out.print("Nhà sản xuất : ");
        nhaSanXuat = n.nextLine();
        System.out.print("Năm sản xuất : ");
        namSanXuat = n.nextInt();
        n.nextLine();
        System.out.print("Hệ điều hành : ");
        heDieuHanh = n.nextLine();
        System.out.print("RAM : ");
        RAM = n.nextLine();
        System.out.print("CPU: ");
        CPU = n.nextLine();
        System.out.println("Giá bán : ");
        gia = n.nextInt();
        System.out.println("Năm bảo hành : ");
        namBaoHanh = n.nextInt();
    }
}
