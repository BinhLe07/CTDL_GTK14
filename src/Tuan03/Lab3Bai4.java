package Tuan03;

import java.util.Scanner;

public class Lab3Bai4 {
    public static void main(String[] args) {
        Scanner DuLieu = new Scanner(System.in);
        System.out.print("Nhập số sinh viên: ");
        int n = DuLieu.nextInt();
        String HoTen[] = new String[n];
        double Diem[] = new double[n];
        for(int i = 0;i < n;i++) {
            DuLieu.nextLine();
            System.out.printf("Họ và tên sinh viên thứ %d: ", i+1);
            HoTen[i] = DuLieu.nextLine();
            System.out.printf("Điểm sinh viên thứ %d: ", i+1);
            Diem[i] = DuLieu.nextDouble();
        }
        for(int i = 0;i < n;i++){
            for(int j = i + 1;j < n - 1;j++){
                if(Diem[i] > Diem[j]){
                    double Tam = Diem[i];
                    Diem[i] = Diem[j];
                    Diem[j] = Tam;
                    String Tam2 = HoTen[i];
                    HoTen[i] = HoTen[j];
                    HoTen[j] = Tam2;
                }
            }
        }
        System.out.printf("Danh sách sinh viên");
        for(int i = 0;i < n;i++){
            System.out.printf("\nHọ và tên: %s\n", HoTen[i]);
            System.out.printf("Điểm: %.2f\n", Diem[i]);
            if(Diem[i] >= 9)
                System.out.println("Xếp loại: Xuất sắc");
            else{
                if(Diem[i] >= 7.5)
                    System.out.println("Xếp loại: Giỏi");
                else{
                    if(Diem[i] >= 6.5)
                        System.out.println("Xếp loại: Khá");
                    else{
                        if(Diem[i] >= 5)
                            System.out.println("Xếp loại: Trung bình");
                        else    
                            System.out.println("Xếp loại: Yếu");
                    }
                }
            }
            System.out.print(".........");
        }
    }
}
