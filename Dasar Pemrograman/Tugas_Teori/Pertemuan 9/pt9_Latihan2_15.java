import java.util.Scanner;

public class pt9_Latihan2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pegawaiKe = 1, jamKerja, gajiHarian;

        System.out.println("Masukkan jam kerja negatif (misal -1) untuk menghentikan program.");

        while (true) {
            System.out.println("Data Pegawai ke-" + pegawaiKe);
            System.out.print("Masukkan jam kerja harian  : ");
            jamKerja = sc.nextInt();

            if (jamKerja < 0) {
                System.out.println("Input jam kerja negatif terdeteksi. Program dihentikan.");
                break;
            }

            System.out.print("Masukkan gaji harian : Rp ");
            gajiHarian = sc.nextInt();

            double bonus = 0;

            if (jamKerja > 8) {
                bonus = gajiHarian * 0.20; // Bonus 20%
            }

            // Tampilkan hasil
            System.out.println("Bonus yang diterima        : Rp " + bonus);
            System.out.println("Total Gaji (Gaji + Bonus)  : Rp " + (gajiHarian + bonus));
            
            pegawaiKe++;
        }

        sc.close();
    }
}