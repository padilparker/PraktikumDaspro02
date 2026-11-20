package Pertemuan12;

// P ; P+8 ; −(1+(P mod 7)) ; 20+(P mod 15) menggunakan nomor absen 2

import java.util.Arrays;

public class ArrayBilangan02 {
    public static void main(String[] args) {

        int[] bil = new int[4];
        bil[0] = 2;
        bil[1] = 10;
        bil[2] = -3;
        bil[3] = 22;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));
    }
}
