package Tuan01;

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner Nhap = new Scanner(System.in);
        double dienTich,chuVi,chieuDai,chieuRong;

        System.out.println("Nhập chiều dài: ");
        chieuDai = Nhap.nextDouble();
        System.out.println("Nhap chieu rong: ");   
        chieuRong = Nhap.nextDouble(); 

        chuVi = (chieuDai + chieuRong)*2;
        dienTich = chieuDai * chieuRong;

        System.out.print("Chu Vi = "+ chuVi);
        System.out.print("\nDien Tich = "+ dienTich);        
    }    
    
}
