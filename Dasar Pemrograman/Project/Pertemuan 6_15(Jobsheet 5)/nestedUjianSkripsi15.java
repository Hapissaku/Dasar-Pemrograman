import java.util.Scanner;
public class nestedUjianSkripsi15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String pesan;

    System.out.print("Apakah mahasiswa sudah bebas kompen (ya/tidak) = ");
    String BebasKompen = sc.nextLine().trim();
    System.out.print("Masukkan jumlah log bimbingan Pembimbing 1 =  ");
    int Bimbingan1 = sc.nextInt();
    System.out.print("Masukkan jumlah log Pembimbing 2 = ");
    int Bimbingan2 = sc.nextInt();

    if (BebasKompen.equalsIgnoreCase("Ya")) {
        if (Bimbingan1 >= 8 && Bimbingan2 >= 4) {
        pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
        } else if (Bimbingan1 < 8 && Bimbingan2 < 4) {
        pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
        } else if (Bimbingan1  < 8) {
        pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
        } else {
        pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
        }
    } else {
    pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
    }
System.out.println(pesan);

sc.close();
    }
    
}
