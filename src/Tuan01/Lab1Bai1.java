package Tuan01;

import java.util.Scanner;

public class Lab1Bai1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String ho_va_ten;
        double diem_tb;
        System.out.println("Nhập họ và tên: ");
        ho_va_ten= scanner.nextLine();
        System.out.println("Nhap Vao Diem Trung Binh: "); 
        diem_tb = scanner.nextDouble();

        System.out.printf("Ho Va Ten: %s \n", ho_va_ten);
        System.out.print("Diem Trung Binh = "+ diem_tb);     
    }    
}
