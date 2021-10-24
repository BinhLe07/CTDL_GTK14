package Tuan03.BaiTapThem;

public class MayTinh {
    String nhaSanXuat;
    int namSanXuat;
    String heDieuHanh;
    String RAM;
    String CPU;
    double gia;
    int namBaoHanh;

    void inThongTin(){
        System.out.println("Nhà sản xuất: "+nhaSanXuat);
        System.out.printf("Năm sản xuất: "+namSanXuat);
        System.out.println("\nHệ điều hành: "+heDieuHanh);
        System.out.println("RAM: "+RAM);
        System.out.println("CPU: "+CPU);
        System.out.println("Giá bán: "+gia+"Đồng");
        System.out.println("Năm bảo hành: "+namBaoHanh);
    }
}

