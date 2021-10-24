package Tuan04;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4Bai1 {
    public static void main(String[] args) {
        double b;
        String a;
        double tong = 0;
        Scanner Nhap = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        while(true){
            System.out.printf("Nhập phần tử thứ %d: ", list.size());
            b = Nhap.nextDouble();
            list.add(b);
            Nhap.nextLine();
            System.out.println("Nhập thêm Y/N: ");
            a = Nhap.nextLine();
            if(a.equals("N"))
                 break;
        }
        System.out.println("Các phần tử");
        for(Double x : list){
            System.out.printf("+ %.2f\n", x);
            tong += x;
        }
        System.out.println("Tổng các phần tử là: " + tong);
    }
}
