import java.util.Scanner;
public class KafeDoWhile15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, totalharga;
        String namaPelanggan;
        int hargakopi = 12000, hargateh = 7000, hargaroti = 20000;

        do{
            System.out.print("Masukkan Nama Pelanggan (Masukkan 'batal' untuk keluar) = ");
            namaPelanggan = sc.nextLine();
            if(namaPelanggan.equalsIgnoreCase("batal"))
                break;
            System.out.print("Jumlah Kopi = ");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh = ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti = ");
            roti = sc.nextInt();

            totalharga = ((kopi*hargakopi)+(teh*hargateh)+(roti*hargaroti));
            System.out.println("Jumlah Yang Harus Dibayar : Rp. " + totalharga);
            sc.nextLine();

        }
        while(true);
        System.out.println("Semua Transaksi Selesai");
        sc.close();
    }
}
