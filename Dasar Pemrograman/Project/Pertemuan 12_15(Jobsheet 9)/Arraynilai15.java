import java.util.Scanner;
public class Arraynilai15 {
    public static void main(String[] args) {

        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) { 
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": "); 
            nilaiAkhir[i] = input.nextInt(); 
        } 
        
        int penghitung = 1;
        int lulus = 0;
        int taklulus = 0;
        for (int nilai : nilaiAkhir) {
            if (nilai > 70) {
                System.out.println("Mahasiswa ke-" + penghitung + ": " + nilai + " (LULUS)");
                lulus++;
            }
            else{
                taklulus++;
            }
                penghitung++;
        }
        System.out.println("Jumlah Lulus = " + lulus);
        System.out.println("Jumlah Tidak Lulus = " + taklulus);
        input.close();
    }
}
