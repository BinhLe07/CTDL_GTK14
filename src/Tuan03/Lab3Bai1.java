package Tuan03;

import java.util.Scanner;

public class Lab3Bai1 {
    public static void main(String[] args) {
        int n;
        boolean KiemTra = true;
        Scanner Nhap = new Scanner(System.in);
        System.out.print("Nhập số n = ");
        n = Nhap.nextInt();
        for(int i = 2;i < n - 1;i++){
            if(n % i == 0){
                KiemTra = false;
                break;
            }
        }
        if(KiemTra == true)
            System.out.printf("%d là số nguyên tố.", n);
        else    
            System.out.printf("%d không phải là số nguyên tố.", n);
     }
    
}