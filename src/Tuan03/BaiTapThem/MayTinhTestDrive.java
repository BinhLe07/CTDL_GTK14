package Tuan03.BaiTapThem;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh mayTinh = new MayTinh();

        mayTinh.nhaSanXuat="Asus";
        mayTinh.namBaoHanh=2020;
        mayTinh.namSanXuat=2018;
        mayTinh.heDieuHanh="Windows";
        mayTinh.CPU="i3";
        mayTinh.RAM="16G";
        mayTinh.gia=15000000;

        mayTinh.inThongTin();
    }
}
