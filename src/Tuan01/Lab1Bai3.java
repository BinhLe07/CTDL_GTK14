package Tuan01;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner Nhap = new Scanner(System.in);

        double Canh,TheTich;
        System.out.println("Nhap canh: ");
        Canh=Nhap.nextDouble();
        
        TheTich=(Canh*Canh*Canh);

        System.out.println("The tich khoi lap phuong la: "+TheTich);

    }
}
