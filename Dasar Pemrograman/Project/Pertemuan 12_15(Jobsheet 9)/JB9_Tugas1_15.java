import java.util.Scanner;
public class JB9_Tugas1_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Nilai =  ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;
        double rata;

        for (int i = 0; i<nilai.length; i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke-"  + (i+1) + " = ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        rata = (double) total/nilai.length;
        System.out.println("Rata-rata Kelas = " + rata);
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        int penghitung = 1;
        for (int j : nilai ){
            if (j >= 70){
                System.out.println("Mahasiswa ke-" + penghitung + ": " + j + " (LULUS)");
            }
            else if(j < 70){
                System.out.println("Mahasiswa ke-" + penghitung + ": " + j + " (TIDAK LULUS)");
            }
            penghitung++;
        }
        sc.close();
    }
}
