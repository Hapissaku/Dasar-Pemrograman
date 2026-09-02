public class ContohVariabel15 {
    public static void main(String[] args) {
   
    String hobi_saya = "Bermain Badminton";
    boolean pandai = true;
    char jenis_kelamin = 'L';
    byte umur_saya = 20;
    double ipk_saya = 4.0, tinggi_saya = 165.0;

    System.out.println("Hobi saya: " + hobi_saya);
    System.out.println("Apakah saya pandai? " + pandai);
    System.out.println("Jenis kelamin saya: " + jenis_kelamin);
    System.out.println("Umur saya: " + umur_saya);

    System.out.println(String.format("ipk saya %s dan tinggi saya %s", ipk_saya, tinggi_saya));
    }
    
}
/*
%s (format string untuk teks/String)
%d: Untuk bilangan bulat (integer seperti int, long).
%f: Untuk bilangan desimal (seperti float, double).
%b: Untuk nilai boolean (true atau false).
%c: Untuk karakter tunggal (char). */