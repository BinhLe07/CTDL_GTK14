package Tuan03.BaiTapThem;

public class Xe {
    String tenChuXe;
    String hangSanXuat;
    String dongXe;
    String giayPhep;
    double dungTichXang;

    void inThongTin(){
        System.out.println("Tên chủ xe: "+tenChuXe);
        System.out.println("Hãng sản xuất: "+hangSanXuat);
        System.out.println("Dòng: "+dongXe);
        System.out.println("Giấy phép: "+giayPhep);
        System.out.printf("dung tích xăng: %.2f lít", dungTichXang);
    }
}
