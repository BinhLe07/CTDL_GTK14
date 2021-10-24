package Tuan02;

import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args) 
    {
        Scanner SoDienSuDung = new Scanner(System.in);
        System.out.println("Nhập số điện sử dụng: ");
        double NhapSoDien = SoDienSuDung.nextDouble();
        if(NhapSoDien < 50 )
            System.out.println("Tiền phải trả là: "+ NhapSoDien * 1000);
        if(NhapSoDien >= 50 )
            System.out.println("Tiền phải trả là: "+ NhapSoDien * 1200);   
    }    
}
