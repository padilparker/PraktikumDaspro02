package Pertemuan12;

//Menggunakan angka numerik nomor absen 2 5 + (P mod 11) dan p mod 100

import java.util.Scanner;

public class Tugas1_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMhs = 7;
        int[] nilai = new int[jumlahMhs];
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        double rata2 = (double) total / nilai.length;

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        System.out.println("Total nilai: " + total);
        System.out.printf("Rata-rata: %.2f\n", rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        System.out.println("Daftar Nilai dan Status Kelulusan:");
        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 60) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }
    }
}