package LatihanMenujuUTS;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaPelanggan,kategoriBarang,metodBayar,statBelanja;
        int kodeBarang,jumlahBarang,kodeBayar,hargaUnit = 0 ,totBelanja,potonganEwallet = 0;
        boolean kartuMember;
        double diskonBelanja,diskonMember,totalBayar;

        System.out.println("===== KASIR MINIMARKET =====");

        System.out.print("Masukkan nama pelanggan :");
        namaPelanggan = sc.nextLine();

        System.out.println("Pilih kategori barang: ");
        System.out.println("1. Makanan ");
        System.out.println("2. Minuman ");
        System.out.println("3. Peralatan mandi ");
        System.out.println("4. Alat tulis ");
        System.out.print("Masukkan kode barang : ");
        kodeBarang = sc.nextInt();

        switch (kodeBarang) {
            case 1:
                kategoriBarang = "Makanan";
                hargaUnit = 15000;
                break;
            case 2:
                kategoriBarang = "Minuman";
                hargaUnit = 10000;
                break;
            case 3:
                kategoriBarang = "Peralatan Mandi";
                hargaUnit = 25000;
                break;
            case 4:
                kategoriBarang = "Alat Tulis";
                hargaUnit = 5000;
                break;      
            default:
                kategoriBarang = "Tidak valid";
                break;
        }
        System.out.print("Masukkan jumlah barang : ");
        jumlahBarang = sc.nextInt();

        if (jumlahBarang <= 0) {
            System.out.println("Jumlah barang tidak valid");
        }
        totBelanja = hargaUnit * jumlahBarang;

        if (totBelanja >= 100000) {
            diskonBelanja = totBelanja*0.1;          
        } else if (totBelanja >=50000){
            diskonBelanja = totBelanja*0.05;
        } else {
            diskonBelanja = 0;
        }
        System.out.print("Apakah memiliki kartu member? (true/false) :");
        kartuMember = sc.nextBoolean();

        if (kartuMember = true) {
            if (totBelanja >= 10000) {
            diskonMember = totBelanja*0.05;    
            } else {
                diskonMember = totBelanja*0.02;
            }
        } else {
            diskonMember = 0;
        }
        System.out.println("Pilih metode pembayaran: ");
        System.out.println("1. Tunai ");
        System.out.println("2. Debit ");
        System.out.println("3. E-wallet ");
        System.out.print("Masukkan kode pembayaran: ");
        kodeBayar = sc.nextInt();

        switch (kodeBayar) {
            case 1:
                metodBayar = "Tunai";                                   
                break;
            case 2:
                metodBayar = "Debit";
                break;
            case 3:
                metodBayar = "E-wallet";
                if (totBelanja - diskonBelanja >= 50000){
                    potonganEwallet = 2000;
                }
                break;
            default:
                metodBayar = "Tidak valid";
                break;
        }

        totalBayar = totBelanja - diskonBelanja - diskonMember - potonganEwallet;

        if (totalBayar >= 10000) {
            statBelanja = "Belanja Besar";          
        } else if (totalBayar >=50000) {
            statBelanja = "Belanja Sedang";
        } else {
            statBelanja = "Belanja kecil";
        }

        System.out.println("==== STRUK BELANJA ====");
        System.out.println("Nama pelanggan : "+namaPelanggan);
        System.out.println("Kategori Barang : "+kategoriBarang);
        System.out.println("Harga per unit : Rp"+hargaUnit);
        System.out.println("Jumlah baranga : "+jumlahBarang);
        System.out.println("Total belanja : Rp"+totBelanja);
        System.out.println("Diskon belanja (10%) : Rp"+diskonBelanja);
        System.out.println("Diskon member (5%) : Rp"+diskonMember);
        System.out.println("Potongan e-wallet : Rp"+potonganEwallet);
        System.out.println("--------------------------------------");
        System.out.println("Total pembayaran : Rp"+totalBayar);
        System.out.println("Metode pembayaran : "+metodBayar);
        System.out.println("Status belanja : "+statBelanja);

        System.out.println("Terimakasih telah berbelanja");

    }
    
}