package LatihanMenujuUTS;

import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, jurusan;
        int nisn;
        double nilaiMat, nilaiInggris;
        int pilihan;

        System.out.print("Masukkan nama anda:");
        nama = sc.nextLine();
        System.out.print("MAsukkan NISN:");
        nisn = sc.nextInt();
        System.out.println("Pilih jurusan anda:");
        System.out.println("1. TI");
        System.out.println("2. SI");
        System.out.println("3. DKV");
        System.out.println("maukkan pilihan");
        jurusan = sc.nextLine();
        pilihan = sc.nextInt();
        System.out.print("Masukkan nilai matematika:");
        nilaiMat = sc.nextInt();
        System.out.print("Masukkan nilai bahasa inggris:");
        nilaiInggris = sc.nextInt();

        switch (pilihan) {
            case 1:
                if (nilaiMat <= 80 && nilaiInggris >= 70) {
                    System.out.print("Mahasiswa lolos seleksi");
                } else {
                    System.out.println("Mahasiswa tidak lolos");
                }
                jurusan = "TEKNIK INFORMATIKA";
                break;
            case 2:
                if (nilaiMat <= 70 && nilaiInggris >= 70) {
                    System.out.print("Mahasiswa lolos seleksi");
                } else {
                    System.out.println("Mahasiswa tidak lolos");
                }
                jurusan = "SISTEM iNFORMASI";
                break;
            case 3:
                if (nilaiMat <= 60 && nilaiInggris >= 65) {
                    System.out.print("Mahasiswa lolos seleksi");
                } else {
                    System.out.println("Mahasiswa tidak lolos");
                }
                jurusan = "DKV";
                break;

            default:
                System.out.println("kode jurusan tidak valid");
                break;
        }

        System.out.println("===SELEKSI JURUSN===");
        System.out.println("Nama =" + nama);
        System.out.println("NISN =" + nisn);
        System.out.println("Jurusan =" + jurusan);
        System.out.println("Nilai Matematika =" + nilaiMat);
        System.out.println("Nilai Inggris =" + nilaiInggris);
    }
}
