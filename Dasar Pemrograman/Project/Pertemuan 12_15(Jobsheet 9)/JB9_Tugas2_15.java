import java.util.Scanner;

public class JB9_Tugas2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        while (true) {
            System.out.print("\nApakah Anda ingin mencari menu? (ya/tidak) = ");
            String tanyaCari = sc.nextLine();

            if (tanyaCari.equalsIgnoreCase("tidak")) {
                break;
            } else if (tanyaCari.equalsIgnoreCase("ya")) {
                System.out.print("Ketikkan nama menu yang dicari = ");
                String keyKata = sc.nextLine();

                boolean ditemukan = false;
                for (int i = 0; i < menu.length; i++) {
                    if (menu[i].equalsIgnoreCase(keyKata)) {
                        System.out.println("Menu " + menu[i] + " tersedia dengan harga Rp " + harga[i]);
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Menu " + keyKata + " tidak tersedia.");
                }
            } else {
                System.out.println("Input tidak valid! Silakan ketik 'ya' atau 'tidak'.");
            }
        }

        System.out.println("\n=== PEMESANAN MENU ===");
        System.out.print("Masukkan jumlah pesanan = ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] daftarPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalHarga = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan pesanan ke-" + (i + 1) + " = ");
            String pesan = sc.nextLine();

            boolean valid = false;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(pesan)) {
                    daftarPesanan[i] = menu[j];
                    hargaPesanan[i] = harga[j];
                    totalHarga += harga[j];
                    valid = true;
                    break;
                }
            }

            if (!valid) {
                System.out.println("Menu tidak tersedia di daftar! Silakan masukkan ulang.");
                i--;
            }
        }

        System.out.println("\n=== RINCIAN PESANAN ANDA ===");
        for (int i = 0; i < daftarPesanan.length; i++) {
            System.out.println((i + 1) + ". " + daftarPesanan[i] + " : Rp " + hargaPesanan[i]);
        }
        System.out.println("-----------------------------------");
        System.out.println("Total Harga : Rp " + totalHarga);

        sc.close();
    }
}