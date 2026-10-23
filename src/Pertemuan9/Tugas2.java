package Pertemuan9;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        int total = 0;

        int tarifMobil = 2500 + (2 % 6) * 250; 
        int tarifMotor = 1500 + (2 % 6) * 250;

        do {
            System.out.print("Masukkan jenis kendaraan (1: mobil, 2: motor, 0: keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * tarifMobil;
                } else {
                    total += durasi * tarifMotor;
                }
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid!");
            }

        } while (jenis != 0);

        System.out.println("\nTotal pembayaran parkir: Rp " + total);

    }
}
