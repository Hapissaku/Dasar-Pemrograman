import java.util.Scanner;
public class OperatorLogikaWifi15{
public static void main(String[] args) {
    
    boolean mahasiswa, dosen, diblokir;

    Scanner sc = new Scanner(System.in);

    System.out.print("Apakah pengguna mahasiswa? (true/false): ");
mahasiswa = sc.nextBoolean();

System.out.print("Apakah pengguna dosen? (true/false): ");
dosen = sc.nextBoolean();

System.out.print("Apakah akun sedang diblokir? (true/false): ");
diblokir = sc.nextBoolean();

if ((mahasiswa && dosen) && !diblokir) {
    System.out.println("Akses WiFi diberikan");
} else {
    System.out.println("Akses WiFi ditolak");
}

sc.close();
}
}