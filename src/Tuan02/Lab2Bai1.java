package Tuan02;

import java.util.Scanner;

public class Lab2Bai1 {
    public static void main(String[] args) {
        System.out.println("Giải PT Bậc 1");
        double a,b;
        Scanner nhap = new Scanner(System.in);

        System.out.println("Nhập a: ");
        a = nhap.nextDouble();
        System.out.println("Nhập b: ");
        b = nhap.nextDouble();

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
}   
