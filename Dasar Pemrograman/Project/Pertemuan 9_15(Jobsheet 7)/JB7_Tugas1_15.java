import java.util.Scanner;
public class JB7_Tugas1_15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int hargaPerTiket = 50000, totalTiketSehari = 0, jumlahTiket;
        double totalPenjualanSehari = 0, diskon = 0, totalHarga, hargaSetelahDiskon;

        System.out.println("=== Program Penjualan Tiket Bioskop ===");
        System.out.println("Ketik 0 jika antrean sudah selesai/tutup.\n");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Nilai tidak valid. Masukkan nilai yang benar!");
                continue; 
            }

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            totalHarga = jumlahTiket * hargaPerTiket;
            hargaSetelahDiskon = totalHarga - (totalHarga * diskon);

            totalTiketSehari += jumlahTiket;
            totalPenjualanSehari += hargaSetelahDiskon;

            System.out.println("Total bayar pelanggan: Rp " + hargaSetelahDiskon);
        }

        System.out.println("\n======================================");
        System.out.println("Total tiket terjual  : " + totalTiketSehari);
        System.out.println("Total harga penjualan: Rp " + totalPenjualanSehari);

        sc.close();
    }
} 