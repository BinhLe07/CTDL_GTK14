package Tuan03.BaiTapThem;

import java.util.Scanner;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach sach = new Sach();
        sach.nhaXuatBan="Tuổi trẻ";
        sach.namXuatBan=2021;
        sach.loai="Tạp chí";
        sach.soLuong=10;
        sach.giaBan=10000;

        sach.inThongTin();
    }
}
