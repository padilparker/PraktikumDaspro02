package LatihanMenujuUTS;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tahun;
        String golongan;
        String disiplin;

        System.out.print("Golongan anda (A/B) : ");
        golongan = sc.nextLine();
          
        System.out.print("Lama anda bekerja : ");
        tahun = sc.nextInt();
        sc.nextLine();

        if (golongan.equalsIgnoreCase("A")) {
            if (tahun > 5) {
                System.out.print("DIsiplin (Ya/Tidak) : ");
                disiplin = sc.nextLine();
                if (disiplin.equalsIgnoreCase("ya")) {
                    System.out.println("Anda mendapat bonus sebesar RP 10.000.000");
                } else {
                    System.out.println("Anda mendapat bonus sebesar RP 7.500.000");              
                }
            } else {
                System.out.println("Anda mendapat bonus sebesar RP 5.000.000");
            }
        } else if (golongan.equalsIgnoreCase("B")) {
            if (tahun > 5) {
                System.out.println("Anda mendapat bonus sebesar RP 4.000.000");
            } else {
                System.out.println("Anda mendapat bonus sebesar RP 2.000.000");            
            }
        } else {
            System.out.println("Anda bukan karyawan di sini");        
        }
    }
}
