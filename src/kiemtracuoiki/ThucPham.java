package kiemtracuoiki;

import java.util.Date;
import java.util.Scanner;

public class ThucPham {
	int id;
	String name;
	float gia;
	Date ngayNhapKho;
	
	ThucPham next;
	
	ThucPham(){
		
	}
	
	ThucPham(int maHang, String tenHang, float giaHang, Date ngayNhap){
		id = maHang;
		name = tenHang;
		gia = giaHang;
		ngayNhapKho = ngayNhap;
	}
	
	public void NhapTT(Scanner scanner) {
		
		scanner.nextLine();
		System.out.print("Nhap ten san pham: ");
		name = scanner.nextLine();
		
		System.out.print("Nhap gia san pham: ");
		gia = scanner.nextFloat();
		
		ngayNhapKho = new Date();
	}
	
	public void inTT() {
		System.out.println("==================================================================");
        System.out.println("Ten hang: " +name+ ", Loai: Thuc pham,     Ngay nhap: "+ngayNhapKho);
		System.out.println("ID: " +id+ ", Gia: "+gia);
		System.out.println("==================================================================");
	}
	
	public String GetName() {
		System.out.println(name);
		return name;
	}
}
