import java.util.Scanner;
public class Tugas2PemilihanAsisten15 {
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
boolean statusMahasiswa, sertifikat;
int nilaiDaspro, nilaiWawancara;

System.out.print("Status Mahasiswa Aktif (true/false) = ");
statusMahasiswa = sc.nextBoolean();
System.out.print("Nilai Daspro Anda = ");
nilaiDaspro = sc.nextInt();
System.out.print("Apakah Punya Sertifikat Kompetensi Pemrograman (true/false) = ");
sertifikat = sc.nextBoolean();


if (statusMahasiswa){
    if (nilaiDaspro > 80 || sertifikat){
        System.out.println("Silahkan Mengikuti Wawancara");
        System.out.print("Berapa Nilai Wawanvara Anda = ");
        nilaiWawancara = sc.nextInt();
        if (nilaiWawancara >= 75){
            System.out.println("Selamat Anda Lulus Wawancara");
        }
        else{
            System.out.println("Maaf Anda Gagal Karena Nilai Anda Tidak Mencukupi");
        }}
    else{
        System.out.println("Maaf Nilai Daspro Anda Kurang & Tidak Memiliki Sertifikat");
    }
    
}
else{
    System.out.println("Maaf Status Tidak Aktif Tidak Bisa Ikut Wawancara");
}
sc.close();
}
}
