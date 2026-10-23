package Pertemuan8_UTS;

import java.util.Scanner;

// harga tiket per kode 1 reguler 35.000 + (p mod 3) * 5.000 = 45.000
// harga tiket per kode 2 terusan 60.000 + (p mod 3) * 5.000 = 70.000
// harga tiket per kode 3 reguler 25.000 + (p mod 3) * 5.000 = 35.000
// T1 6 + (p mod 5) = 7
// T2 15 + (p mod 5)= 16

public class TamanKreasi_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String Layanan;
        int biayaDasar, kodeTiket, jumlahTiket;
        double diskon, totBayar;
        boolean member;

        System.out.println("===Taman Kreasi===");
        System.out.println("Pilihan tiket :");
        System.out.println("1. Tiket Regular :");
        System.out.println("2. Tiket Terusan :");
        System.out.println("3. Tiket Pelajar :");
        System.out.println("Masukkan kode Tiket :");
        kodeTiket = sc.nextInt();

        switch (kodeTiket) {
            case 1:
                System.out.println("Harga = 45.000");
                break;
            case 2:
                System.out.println("Harga = 70.000");
                break;
            case 3:
                System.out.println("Harga = 35.000");
                break;
        
            default:
            System.out.println("kode tidak ada");
                break;
        }
        System.out.println("Masukkan jumlah tiket :");
        jumlahTiket = sc.nextInt();

        if (jumlahTiket <= 7) {
            System.out.println("Jumlah barang tidak valid");
        }
        totBayar = jumlahTiket * 45000;

        if (totBayar >= 45000) {
            System.out.println("tidak mendapatkan diskon");          
        }




    }
}

/*
===Taman Kreasi===
Pilihan tiket :
1. Tiket Regular :
2. Tiket Terusan :
3. Tiket Pelajar :
Masukkan kode Tiket :
1
Harga = 45.000
Masukkan jumlah tiket :
2
Jumlah barang tidak valid
tidak mendapatkan diskon */