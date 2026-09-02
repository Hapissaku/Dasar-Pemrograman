import java.util.Scanner;

public class Tugas2_15 {
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

