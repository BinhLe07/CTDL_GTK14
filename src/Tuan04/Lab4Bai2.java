package Tuan04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab4Bai2 {
    static Scanner n = new Scanner(System.in);
    static ArrayList<String> DS = new ArrayList<String>();
    public static void main(String[] args) {
        int LuaChon;
        do{
            System.out.println("1.Nhập thông tin");
            System.out.println("2.Xuât danh sách vừa nhập");
            System.out.println("3.Xuất danh sách ngấu nhiên");
            System.out.println("4.Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5.Tìm và xóa họ tên");
            System.out.println("6.Thoát");
            System.out.print("- Nhập vào sự lựa chọn: ");
            LuaChon = n.nextInt();
            switch(LuaChon){
                case 1: Nhap(); break;
                case 2: Xuat(); break;
                case 3: XuatNgauNhien(); break;
                case 4: SapXepVaXuatDS(); break;
                case 5: Xoa(); break;
                case 6: break;
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
            System.out.print("Quay lại MENU: ");
            System.out.print("1.Yes / 2.No  ");
            LuaChon = n.nextInt();
        } while(LuaChon == 1);
    }
    static void Nhap(){
        while(true){
            System.out.print("Nhập họ và tên: ");
            n.nextLine();
            String hoTen = n.nextLine();
            DS.add(hoTen);
            System.out.println("Bạn có muốn nhập thêm không ");
            System.out.print("1.Yes / 2.No  ");
            int a = n.nextInt();
            if(a == 0)
                break; 
        }
    }
    static void Xuat(){
        System.out.println("DANH SÁCH");
        for(String x : DS){
            System.out.printf("Họ và tên: %s\n", x);
        }
    }
    static void XuatNgauNhien(){
        Collections.shuffle(DS);
        Xuat();
    }
    static void SapXepVaXuatDS(){
        Collections.sort(DS);
        Collections.reverse(DS);
        Xuat();
    }
    static void Xoa(){
        for(String x: DS){
            System.out.println("Nhập tên cần xóa: ");
            String HoTen = n.nextLine();
            if(x == HoTen){
                DS.remove(HoTen);
            }
        }
    }
}