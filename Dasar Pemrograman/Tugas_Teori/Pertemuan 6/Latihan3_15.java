import java.util.Scanner;

public class Latihan3_15 {
    public static void main(String[] args) {
        
        int ukuran;
        String merk, kategori;
        long harga = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Merk Sepatu (Converse/Sketcher/Nike) = ");
        merk = sc.nextLine();
        
        System.out.println("Kategori Sepatu = \nSlip On\nHigh Top\nWoman\nMan\nKids\nAdult");
        System.out.print("Masukkan Kategori Sepatu = ");
        kategori = sc.nextLine();
        
        System.out.print("Masukkan Ukuran Sepatu = ");
        ukuran = sc.nextInt();

        merk.toLowerCase();
        kategori.toLowerCase();

        if (merk.equals("converse")) {
            if (kategori.equals("slip on")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) { 
                        harga = 800000;
                    }
                }
            } else if (kategori.equals("high top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                    }
                }
            }
        } 
        else if (merk.equals("sketcher")) {
            if (kategori.equals("woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                    }
                }
            } else if (kategori.equals("man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                    }
                }
            }
        } 
        else if (merk.equals("nike")) {
            if (kategori.equals("kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                    }
                }
            } else if (kategori.equals("adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                    }
                }
            }
        }

        if (harga == 0) {
            System.out.println("Data tidak valid. Kategori atau ukuran tidak tersedia.");
        } else {
            System.out.println("Harga Anda = Rp" + harga);
        }
        
        sc.close();
    }
}