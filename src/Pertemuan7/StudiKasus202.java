package Pertemuan7;

import java.util.Scanner;

public class StudiKasus202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen, peringkatJuara;
        String pesan;

        System.out.print("Masukkan nama :");
        nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/Lainnya) :");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen :");
            jumlahDokumen = sc.nextInt();
            System.out.print("Jumlah juara :");
            peringkatJuara = sc.nextInt();
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen < 4) {
                    jumlahDokumen = 4 - jumlahDokumen;
                    pesan = "Status : Dokumen tidak lengkap (kurang " + jumlahDokumen
                            + "dokumen) dana pernghargaan tidak diberikan";
                } else {
                    pesan = "Status : Dokumen lengkap. Dana penghargaan diberikan.";
                }
            } else {
                pesan = "Status : Bukan juara. Dana penghargaan tidak diberikan.";
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen :");
            jumlahDokumen = sc.nextInt();
            System.out.print("Jumlah juara :");
            peringkatJuara = sc.nextInt();
            if (peringkatJuara == 1) {
                if (jumlahDokumen < 4) {
                    jumlahDokumen = 4 - jumlahDokumen;
                    pesan = "Status : Dokumen tidak lengkap (kurang " + jumlahDokumen
                            + " dokumen) dana penghargaan tidak diberikan";
                } else {
                    pesan = "Status : Dokumen lengkap, dana diberikan.";
                }
            } else {
                pesan = "Status : Bukan juara. Dana penghargaan tidak diberikan.";
            }
        } else {
            pesan = "Status : Tidak ada kegiatan";
        }
        
        System.out.println(pesan);
    }
}
