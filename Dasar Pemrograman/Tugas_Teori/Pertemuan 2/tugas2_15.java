/* Algoritma Menghitung Sisa Tanah Setelah Dibangun Taman dan Kolam
   1. Masukkan panjang
   2. Masukkan lebar
   3. Hitung luas tanah dengan rumus: luas = panjang * lebar
   4. Hitung luas taman dengan rumus: luas_taman = panjang_taman * panjang_taman
   5. Hitung jari-jari kolam dengan rumus: jari_jari = diameter / 2
   6. Hitung luas kolam dengan rumus: luas_kolam = phi * jari_jari * jari_jari
   7. Hitung sisa tanah dengan rumus: sisa_tanah = luas_tanah - (luas_taman + luas_kolam)
   8. Tampilkan hasil sisa tanah */

import java.util.Scanner;
public class tugas2_15 {
    public static void main(String[] args) {
        
        double panjang, lebar, panjang_persegi, luas_persegi_panjang, luas_lingkaran, luas_persegi;
        double jari_jari, phi = 3.14, diameter;

        @SuppressWarnings("resource")
Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan Panjang Tanah: ");
        panjang = input.nextDouble();
        System.out.print("Masukkan Lebar Tanah: ");
        lebar = input.nextDouble();
        System.out.print("Masukkan Panjang Taman: ");
        panjang_persegi = input.nextDouble();
        System.out.print("Masukkan Diameter Kolam: ");
        diameter = input.nextDouble();

        luas_persegi_panjang = panjang * lebar;
        luas_persegi = panjang_persegi * panjang_persegi;
        jari_jari = diameter / 2;
        luas_lingkaran = phi * jari_jari * jari_jari;
        double luas_sisa_tanah = luas_persegi_panjang - (luas_persegi + luas_lingkaran);

        System.out.println("Luas Tanah: " + luas_persegi_panjang);
        System.out.println("Luas Taman: " + luas_persegi);
        System.out.println("Jari Jari Kolam: " + jari_jari);
        System.out.println("Luas Kolam: " + luas_lingkaran);
        System.out.println("Luas Sisa Tanah: " + luas_sisa_tanah);

    }
}
