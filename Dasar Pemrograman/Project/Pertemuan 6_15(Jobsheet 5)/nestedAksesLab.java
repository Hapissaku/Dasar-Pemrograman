import java.util.Scanner;
public class nestedAksesLab {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    boolean mahasiswaAktif,sedangDisanksi,punyaIzinDosen,asistenLab;

    System.out.print("Mahasiswa Aktif (true/false) = ");
    mahasiswaAktif = sc.nextBoolean();
    System.out.print("Sedang Disanksi (true/false) = ");
    sedangDisanksi = sc.nextBoolean();
    System.out.print("Punya Izin Dosen (true/false) = ");
    punyaIzinDosen = sc.nextBoolean();
    System.out.print("Apakah Asisten Lab (true/false) = ");
    asistenLab = sc.nextBoolean();

    if (mahasiswaAktif && !sedangDisanksi) {
        if (punyaIzinDosen || asistenLab) {
        System.out.println("Akses laboratorium diberikan");
        }
        else {
        System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
        }
}   else {
    System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
}
sc.close();
    }
    
}
