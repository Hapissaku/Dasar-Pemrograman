import java.util.Scanner;
public class SearchNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Elemen = ");
        int jumlah = sc.nextInt();
        int[] nilai = new int[jumlah];
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + " = ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan Nilai Yang Ingin Dicari = ");
        int key = sc.nextInt();

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + (i+1));
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
        sc.close();
    }
}