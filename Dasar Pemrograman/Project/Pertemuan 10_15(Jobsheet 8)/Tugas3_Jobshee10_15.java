import java.util.Scanner;

public class Tugas3_Jobshee10_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahtoko;
        System.out.print("\nMasukkan Jumlah Toko = ");
        jumlahtoko = sc.nextInt();
            while(jumlahtoko<0){
                System.out.print("Tidak Boleh Negatif, Ulangi = ");
                jumlahtoko = sc.nextInt();
        }

        int totsemua = 0, max = -1, terbanyak = 0;


        for(int i =1; i<= jumlahtoko; i++) {
            System.out.println("----------------------\nToko " + i);
            int jumlahpelanggan;
            System.out.print("Masukkan Jumlah Pelanggan = ");
            jumlahpelanggan = sc.nextInt();
                while(jumlahpelanggan<0){
                    System.out.print("Tidak Boleh Negatif, Ulangi = ");
                    jumlahpelanggan = sc.nextInt();
        }
            

            int barangtoko = 0;
            int totalproduk = 0;
            for(int j=1; j<=jumlahpelanggan; j++){
                System.out.print("Masukkan Jumlah Barang Pelanggan " + j + " = ");
                barangtoko = sc.nextInt();
                    while(barangtoko<0){
                        System.out.print("Tidak Boleh Negatif, Ulangi = ");
                        barangtoko = sc.nextInt();
        }
                totalproduk += barangtoko;

            }
            if(totalproduk>max){
                max = totalproduk;
                terbanyak = i;
            }
            totsemua += totalproduk;
            System.out.print("Total Produk Toko " + i + " = " + totalproduk);
            System.out.println();
        
            

        }
        System.out.println("----------------------");
        System.out.println("Total Barang Semua Toko = " + totsemua);
        System.out.println("Toko Dengan Penjualan Terbanyak = " + terbanyak);

        sc.close();
    }
}