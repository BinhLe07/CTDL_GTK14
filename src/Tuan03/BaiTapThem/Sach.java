package Tuan03.BaiTapThem;

public class Sach {
    String nhaXuatBan;
    int namXuatBan;
    double giaBan;
    int soLuong;
    String loai;


    void inThongTin(){
        System.out.println("Nhà xuất bản: "+nhaXuatBan);
        System.out.println("Năm Sản Xuất: "+namXuatBan);
        System.out.println("Số lượng: "+soLuong);
        System.out.println("Loại: "+loai);
        System.out.printf("Giá bán: %.3f đồng", giaBan);
    }
}
