/* Algoritma Menghitung Gaji Bersih Karyawan
   1. Masukkan gaji pokok
   2. Masukkan jumlah anak
   3. Hitung tunjangan anak: tunjangan_anak = jumlah_anak * 100000
   4. Hitung potongan: potongan = gaji_pokok * 0.10
   5. Hitung gaji bersih: gaji_bersih = gaji_pokok - potongan + tunjangan_anak
   6. Tampilkan hasil gaji bersih */

import java.util.Scanner;
public class tugas1_15 {
    public static void main(String[] args) {
       int  jumlah_anak;
       double gaji_pokok , tunjangan_anak = 100000, potongan = 0.10 ;

        @SuppressWarnings("resource")
Scanner input = new Scanner(System.in);

       System.out.print("Masukkan gaji pokok : ");
       gaji_pokok = input.nextDouble();
       System.out.print("Masukkan jumlah anak : ");
       jumlah_anak = input.nextInt();

       double gaji =( (gaji_pokok)-(gaji_pokok*potongan) + (jumlah_anak*tunjangan_anak)); 
       System.out.println("Gaji Pokok : "+ gaji);


    }
}