package Pertemuan7;
/* Nomor absen saya adalah 2
p = 2
rumus = (p mod 6) = 2
hargaPerCup = 15000 + (2 mod 6) × 1000 = 17.000
Syarat minimal belanja untuk diskon = 80000 + (2 mod 5) × 10000 = 100.000
Persentase diskon = 5 + (2 mod 6) % = 7%  */

import java.util.Scanner;

public class StudiKasus102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, totalBayar, kembalian, kurang;

        System.out.print("Masukkan jumlah cup :");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar :");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        int diskon  = 0;

        if (totalHarga >= 100000 ) {
            diskon = totalHarga*10/100;
        }

        totalBayar = totalHarga - diskon;
        
        System.out.println("Total Harga : " + totalHarga);
        System.out.println("Diskon : " + diskon);
        System.out.println("Total Bayar :" + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kembalian :" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup kurang Rp:" + kurang);
        }
    }
}
