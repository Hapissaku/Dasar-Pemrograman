import java.util.Scanner;

public class SiakadFor15 {
    public static void main(String[] args) {
        
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0; 
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <=10; i++){
            System.out.print("Masukkan Nilai Siswa Ke-" + i + ": ");
            nilai = sc.nextDouble();
            
            // Logika tertinggi dan terendah
            if(nilai > tertinggi){
                tertinggi = nilai;
            }
            if(nilai < terendah) {
                terendah = nilai;
            }
            
            if(nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah  : " + terendah);
        System.out.println("Jumlah mahasiswa lulus       : " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + tidakLulus);

        sc.close();
    }
}