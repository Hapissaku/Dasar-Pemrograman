import java.util.Scanner;
public class Bank15 {
    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);  
    
    int tabungan_awal, lama_menabung;
    double persen_bunga = 0.02, bunga, tabungan_akhir;

    System.out.print("Masukkan jumlah tabungan awal: ");
    tabungan_awal = sc.nextInt();
    System.out.print("Masukkan lama menabung (dalam tahun): ");
    lama_menabung = sc.nextInt();

    bunga = lama_menabung * persen_bunga * tabungan_awal;
    tabungan_akhir = tabungan_awal + bunga;

    System.out.println("Bunga adalah : " + bunga);
    System.out.println("Tabungan akhir adalah : " + tabungan_akhir);

}
}