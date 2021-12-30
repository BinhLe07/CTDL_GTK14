package kiemtracuoiki;

import java.util.Date;
import java.util.Scanner;

public class Menu {

	static Scanner Nhap = new Scanner(System.in);
	public static KhoHang kho = new KhoHang();
	
	public static void main(String[] args) {
		
		Date a = new Date();
		
		DienMay headDM = new DienMay(101, "Tivi", 1, a);
		SanhSu headSS = new SanhSu(201, "Bo ly thuy tinh", 2, a);
		ThucPham headTP = new ThucPham(301, "Gao", 3, a);

		kho.headDienMay = headDM;
		kho.headSanhSu = headSS;
		kho.headThucPham = headTP;
		while (true){
        	System.out.println();
    		System.out.println("------------MENU---------");
            System.out.println("1.In danh sach hang hoa trong kho");
            System.out.println("2.Them san pham vao kho");
            System.out.println("3.Xoa san pham");
            System.out.println("4.Tim san pham");
            System.out.println("5.Thong ke hang trong kho");

            System.out.print("Lua chon 1->5: ");
            int key = Nhap.nextInt();
            
            switch(key){
        	case 1:	InTT(kho);break;
        	case 2:	ThemHang(kho);break;
        	case 3:	XoaHang(kho);break;
        	case 4:	TimHang(kho);break;
        	case 5:	ThongKeKho(kho);break;
        	default: break;
        	}
		}
	}
	
	public static void ThemHang(KhoHang kho) {
		kho.ThemHang(Nhap);
	}
	
	public static void InTT(KhoHang kho){
		kho.inThongTin();
	}
	
	public static void XoaHang(KhoHang kho) {
		kho.XoaHang(Nhap);
	}
	
	public static void TimHang(KhoHang kho) {
		kho.TimHang(Nhap);
	}
	
	public static void ThongKeKho(KhoHang kho) {
		kho.ThongKe(Nhap);
	}
}