package LatihanMenujuUTS;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil;
        int pilihan;

        System.out.println("===KALKULATOR===");
        System.out.println("Masukkan angka pertama:");
        angka1 = sc.nextDouble();
        System.out.println("Masukkan angka kedua:");
        angka2 = sc.nextDouble();

        System.out.println("===operasi===");
        System.out.println("1. penjumlahan (+)");
        System.out.println("2. pengurangan (-)");
        System.out.println("3. perkalian (*)");
        System.out.println("4. pembagian (/)");
        pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil="+ hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil = "+ hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil ="+ hasil);
                break;
            case 4:
                if ( angka2 !=0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil ="+ hasil);
                } else {
                    System.out.println("Eror tidak bisa dibagi 0");
                }
                break;
        
            default:
                break;
        }
    }
}
