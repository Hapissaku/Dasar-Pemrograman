/* Algoritma Menghitung Bunga Per Tahun
   1. Masukkan tabungan awal
   2. Masukkan lama menabung (tahun)
   3. Hitung bunga dengan rumus: bunga = tabungan * bunga_pertahun
   4. Tampilkan hasil tabungan dengan = tabungan + bunga
   5. untuk tahun berikutnya, bunga = tabungan tahun sebelumnya * bunga_pertahun 
   6. dan untuk hasil akhir (tahun berikutnya), tabungan = tabungan tahun sebelumnya + bunga */

import java.util.Scanner;
public class kasus2 {
    public static void main(String[] args) {
       
       @SuppressWarnings("resource")
Scanner input = new Scanner(System.in);


        int tabungan_awal, lama_menabung;
        double bunga_pertahun = 0.02, bunga;

        System.out.print("Masukkan tabungan awal: ");
        tabungan_awal = input.nextInt();
        System.out.print("Masukkan lama menabung (tahun): ");
        lama_menabung = input.nextInt();

        double tabungan_tahun1 = tabungan_awal + (tabungan_awal * bunga_pertahun);
        bunga = tabungan_tahun1 - tabungan_awal;
    
        System.out.println("Tabungan Tahun 1: " + tabungan_tahun1 );
        System.out.println("Bunga: " + bunga);


        double tabungan_tahun2 = tabungan_tahun1 + (tabungan_tahun1 * bunga_pertahun);
        bunga = tabungan_tahun2 - tabungan_tahun1;
        System.out.println("Tabungan Tahun 2: " + tabungan_tahun2 );
        System.out.println("Bunga: " + bunga);

        double tabungan_tahun3 = tabungan_tahun2 + (tabungan_tahun2 * bunga_pertahun);
        bunga = tabungan_tahun3 - tabungan_tahun2;
        System.out.println("Tabungan Tahun 3: " + tabungan_tahun3 );
        System.out.println("Bunga: " + bunga);

        double tabungan_tahun4 = tabungan_tahun3 + (tabungan_tahun3 * bunga_pertahun);
        bunga = tabungan_tahun4 - tabungan_tahun3;
        System.out.println("Tabungan Tahun 4: " + tabungan_tahun4 );
        System.out.println("Bunga: " + bunga);

        double tabungan_tahun5 = tabungan_tahun4 + (tabungan_tahun4 * bunga_pertahun);
        bunga = tabungan_tahun5 - tabungan_tahun4;
        System.out.println("Tabungan Tahun 5: " + tabungan_tahun5 );
        System.out.println("Bunga: " + bunga);

    }    
}
