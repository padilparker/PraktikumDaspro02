package Pertemuan12;

import java.util.Scanner;

public class SearchNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya elemen array: ");
        int jmlElemen = sc.nextInt();

        int[] nilai = new int[jmlElemen];

        System.out.println("Masukkan nilai-nilai elemen array:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari (key): ");
        int key = sc.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Maaf, nilai " + key + " tidak ditemukan di dalam array yang berisi " + jmlElemen + " elemen tersebut.");
        }
    }
}