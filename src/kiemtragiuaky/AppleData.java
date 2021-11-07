package kiemtragiuaky;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleData {
        ArrayList<Apple> danhSachApple = new ArrayList<>();
        Scanner nhap = new Scanner(System.in);

            public void nhapDanhSach(){
            while(true){

            Apple apple = new Apple();
            apple.nhapThongTin();

            nhap.nextLine();
            danhSachApple.add(apple);

            System.out.println("Nhập thêm táo(Y/N) : ?");
            if(nhap.nextLine().equals("n"))
            break;
        }
    }
        public void xuatDanhSach(){
        for(Apple apple: danhSachApple){
            apple.inThongTin();
        }
    }
        public void timTheoMau(){
        System.out.println("Màu cần tìm là: ");
        for(Apple apple: danhSachApple){
            if(nhap.nextLine().equals(apple.mau_sac))
            apple.inThongTin();
        }
    }
}
