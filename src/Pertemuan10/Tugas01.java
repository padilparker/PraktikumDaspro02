package Pertemuan10;

import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 1;
        int total = 0;

        while (i <= n) {
            int j = 1;

            while (j <= i) {
                System.out.print(j + " ");
                total += j;
                j++;
            }

            System.out.println();
            i++;
        }

        System.out.println("Total angka yang tercetak: " + total);

        sc.close();
    }
}
