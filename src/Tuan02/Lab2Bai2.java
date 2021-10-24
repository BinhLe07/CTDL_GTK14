package Tuan02;

import java.util.Scanner;

public class Lab2Bai2 {
    public static void main(String[] args) 
    {
        Scanner nhap = new Scanner(System.in);
        double a, b, c;

        System.out.println("Nhập a: ");
        a = nhap.nextDouble();
        System.out.println("Nhập b: ");
        b = nhap.nextDouble();
        System.out.println("Nhập c: ");
        c = nhap.nextDouble();
        
        if(a ==0)
            if(b ==0)
                if(c ==0)
                    System.out.println("Vô Số Nghiệm");
                else
                    System.out.println("Vô Nghiệm");
            else
            {
                double x = -c / b;
                System.out.println("X = "+ x);
            }
        else   
            {
                double delta, x1, x2;
                delta = b * b - 4 * a * c;
                if(delta ==0)
                {
                    System.out.println("Delta = "+ delta);
                    System.out.printf("x1 = x2 = %f \n", - b / 2 *a);
                }
                if(delta <0)
                {
                    System.out.println("Delta = "+ delta);
                    System.out.println("Vô Nghiệm");
                }
                if(delta >0)
                {
                    x1 = -b + Math.sqrt(delta) / 2 * a;
                    x2 = -b - Math.sqrt(delta) / 2 * a;
                    System.out.println("Delta = "+ delta);
                    System.out.println("x1 = "+ x1);
                    System.out.println("x2 = "+ x2);
                }
                    
            }  
              
    }
}
