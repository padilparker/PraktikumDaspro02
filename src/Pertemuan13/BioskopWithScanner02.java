package Pertemuan13;

import java.util.Scanner;

public class BioskopWithScanner02 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                        while (true) {
                            System.out.print("Masukkan baris (1-" + penonton.length + "): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom (1-" + penonton[0].length + "): ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            if (baris < 1 || baris > penonton.length) {
                                System.out.println("Baris " + baris + " tidak tersedia! Silakan ulangi.");
                            } else if (kolom < 1 || kolom > penonton[baris - 1].length) {
                                System.out.println("Kolom " + kolom + " tidak tersedia! Silakan ulangi.");
                            } else if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Kursi sudah terisi oleh "
                                        + penonton[baris - 1][kolom - 1] + "! Pilih kursi lain.");
                            } else {
                                break;
                            }
                        }

                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("Input penonton lainnya? (y/n): ");
                        pilihan = sc.nextLine();
                        if (pilihan.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print(penonton[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (menu != 3);
    }
}
