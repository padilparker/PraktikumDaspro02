/*
Karena P = 2, kita hitung dulu parameter uniknya:

Kamus: (8 + (2 mod 5))% = 10%
Batas kamus: 2 + (2 mod 2) = 2 → diskon berlaku jika lebih dari 2 buku
Novel: (5 + (2 mod 4))% = 7%
Batas novel: 3 + (2 mod 2) = 3
Novel > 3 → tambahan 2%
Novel ≤ 3 → tambahan 1%
Jenis selain kamus/novel: (3 + (2 mod 4))% = 5%
Batasnya: 3 + (2 mod 2) = 3 → berlaku jika lebih dari 3 buku
 */

package Pertemuan6;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenisBuku, jumlahBuku;
        double diskon = 0;

        System.out.println("=== PROGRAM DISKON TOKO BUKU ===");
        System.out.println("1. Buku Kamus");
        System.out.println("2. Buku Novel");
        System.out.println("3. Buku Lainnya");

        System.out.print("Pilih jenis buku: ");
        jenisBuku = sc.nextInt();

        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = sc.nextInt();


        if (jenisBuku == 1) {

            if (jumlahBuku > 2) {
                diskon = 10;

            } else {
                diskon = 0;
            }

        } else if (jenisBuku == 2) {

            if (jumlahBuku > 3) {
                diskon = 7 + 2;

            } else {
                diskon = 7 + 1;
            }

        } else {

            if (jumlahBuku > 3) {
                diskon = 5;
                
            } else {
                diskon = 0;
            }
        }

        System.out.println("\n=== HASIL PEMBELIAN ===");
        System.out.println("Diskon       : " + diskon + "%");
        
    }
}
