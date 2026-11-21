package Pertemuan12;

// menggunakan numerik (2 + (P mod 4) absen 2

import java.util.Scanner;

public class Tugas2_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        int n = 4;
        String[] namaPesanan = new String[n];
        int[] jmlPesanan = new int[n];
        int total = 0;

        System.out.println("Daftar Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " (Rp " + harga[i] + ")");
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Pesan ke-" + (i + 1) + ": ");
            String cari = sc.nextLine();

            int PosisiMenu = -1;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(cari)) {
                    PosisiMenu = j;
                    break;
                }
            }

            if (PosisiMenu != -1) {
                namaPesanan[i] = menu[PosisiMenu];
                System.out.print("Jumlah porsi: ");
                jmlPesanan[i] = sc.nextInt();
                sc.nextLine();
                total += harga[PosisiMenu] * jmlPesanan[i];
            } else {
                System.out.println("Menu tidak tersedia. Silakan ulangi.");
                i--;
            }
        }
        System.out.println("STRUK PESANAN");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " (" + jmlPesanan[i] + " porsi)");
        }
        System.out.println("Total Biaya: Rp " + total);
    }
}