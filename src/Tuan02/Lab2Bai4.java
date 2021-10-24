package Tuan02;

import java.util.Scanner;

public class Lab2Bai4 {
    public static void main(String[] args) 
    {       
        System.out.println("--------- MEUNU ---------");
        System.out.println("1/ Giải PT Bậc 1 ");
        System.out.println("2/ Giải PT Bậc 2 ");
        System.out.println("3/ Tính Tiền Điện ");
        System.out.println("--------------------------");
        Scanner NhapChucNang = new Scanner(System.in);
        System.out.println("Nhập chức năng muốn sử dụng");
        int ChucNang = NhapChucNang.nextInt();
        switch(ChucNang)
        {
            case 1:
            {                   
                double NhapVaoA, NhapVaoB;
                System.out.println("Nhập a: ");
                NhapVaoA = NhapChucNang.nextDouble();
                System.out.println("Nhập b: ");
                NhapVaoA = NhapChucNang.nextDouble();
                PTBac1(NhapVaoA, NhapVaoA);
            }; break;

            case 2:
            {
                double SoA, SoB, SoC;
                System.out.println("Nhập a: ");
                SoA = NhapChucNang.nextDouble();
                System.out.println("Nhập b: ");
                SoB = NhapChucNang.nextDouble();
                System.out.println("Nhập c: ");
                SoC = NhapChucNang.nextDouble();
                PTBac2(SoA, SoB, SoC);             
            }; break;

            case 3:
            {
                double DienSuDung;
                System.out.println("Nhập số điện: ");
                DienSuDung = NhapChucNang.nextDouble();
                TinhTiendien(DienSuDung);               
            }; break;

            default: System.out.println("Nhập Sai ");
        }

    }
    static void PTBac1(double a, double b)
    {
        if(a==0)
            if(b==0)
                System.out.println("Vô số Nghiệm");
            else
                System.out.println("Vô Nghiệm");
        else
        {
            double x = - b/ a;
            System.out.println("x = "+ x);
        } 
    } 

    static void PTBac2(double SoA, double SoB, double SoC)
    {
        if(SoA==0)
            if(SoB ==0)
                if(SoC ==0)
                    System.out.println("Vô số nghiệm");
                else
                    System.out.println("Vô Nghiệm");
            else
            {
                double x = -SoC / SoC;
                System.out.println("X = "+ x);
            }
        else   
            {
                double delta, x1, x2;
                delta = SoB * SoB - 4 * SoA * SoC;

                if(delta ==0)
                {
                    System.out.println("Delta = "+ delta);
                    System.out.printf("x1 = x2 = %f \n", - SoB / 2 *SoA);
                }
                if(delta <0)
                {
                    System.out.println("Delta = "+ delta);
                    System.out.println("Phuong Trinh Vo Nghiem");
                }

                if(delta >0)
                {
                    x1 = -SoB + Math.sqrt(delta) / 2 * SoA;
                    x2 = -SoB- Math.sqrt(delta) / 2 * SoA;
                    System.out.println("Delta = "+ delta);
                    System.out.println("x1 = "+ x1);
                    System.out.println("x2 = "+ x2);
                }
            }
        }

    static void TinhTiendien(double nhapsodienSuDung)
    {
        if(nhapsodienSuDung < 50 )
            System.out.println("So Tien La: "+ nhapsodienSuDung * 1000);
        if(nhapsodienSuDung >= 50 )
            System.out.println("So Tien La: "+ nhapsodienSuDung * 1200);
    }
}
