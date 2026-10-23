package Pertemuan9;

//• Harga tiket = 40000 + (P mod 6) × 2000 → gantikan Rp50.000 pada soal ( absen 2 menjadi 44000)
//• Syarat diskon pertama = lebih dari (3 + (P mod 3)) tiket, dengan diskon (8 + (P mod 5))% → gantikan lebih dari 4 tiket, diskon 10% (nomer absen 2 jadi 5 tiket diskon 10%)
//• Syarat diskon kedua = lebih dari (8 + (P mod 4)) tiket, dengan diskon (15 + (P mod 4))% → gantikan "lebih dari 10 tiket, diskon 15%" (nomer absen 2 jadi 10 tiker diskon 17%)
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 44000, totalTiketTerjual = 0, jumlah, i = 0;
        double totalPenjualan = 0;

        System.out.print("Masukkan jumlah pelanggan: ");
        jumlah = sc.nextInt();

        while (i < jumlah) {
            System.out.print("Masukkan jumlah tiket untuk pelanggan ke-" + (i + 1) + ": ");
            int jumlahTiket = sc.nextInt(); 

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan lagi jumlah yang valid.");
                continue;
            }

            int diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 17; 
            } else if (jumlahTiket > 5) {
                diskon = 10; 
            }

            double hargaTotalPelanggan = jumlahTiket * hargaTiket * (1 - (diskon / 100.0));
            
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaTotalPelanggan;

            System.out.println("Total pembayaran ke-" + (i + 1) + ": Rp " + (int) hargaTotalPelanggan + " (Diskon: " + diskon + "%)");
            System.out.println(); 
    
            i++; 
        }
        
        System.out.println("Total Tiket Terjual : " + totalTiketTerjual + " tiket");
        System.out.println("Total Penjualan     : Rp " + (int) totalPenjualan);
    }
}