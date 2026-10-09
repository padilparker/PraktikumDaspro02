package kuis;

import java.util.Scanner;

public class peternakanTelur02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int rata = 25;
        int dikemas = 30;
        int berat = 62;
        int berattotal;
        int totalTelur, jumlahTray, TelurEceran, TotalBerat, JumlahAyam, sisa;

        System.out.println("Masukkan jumlah ayam :");
        JumlahAyam = sc.nextInt();
        
        totalTelur = JumlahAyam*rata;
        sisa = totalTelur-dikemas;
        jumlahTray = dikemas/totalTelur; 
        TelurEceran = jumlahTray-sisa;
        berat = 1*berat;
        berattotal = berat*totalTelur/1000;

        System.out.println("Total Telur :"+totalTelur);
        System.out.println("Jumlah Tray :"+jumlahTray);
        System.out.println("Telur eceran :"+TelurEceran);
        System.out.println("Berat Total (kg) :"+berattotal);
    }
}
// Masukkan jumlah ayam :
// 2
// Total Telur :50
// Jumlah Tray :0
// Telur eceran :-20
// Berat Total (kg) :3100
