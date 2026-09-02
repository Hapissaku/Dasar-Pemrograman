public class ContohTipeData15 {
    public static void main(String[] args) {
    
        char golongan_darah = 'O';
        short jarak =  130;
        short jumlah_penduduk = 1025;
        float suhu = 36.5F;
        double berat = 0.5467812345;
        long saldo = 150000000;
        int angka_desimal = 0x10;

        System.out.println("Golongan darah saya\t: " +  (byte)golongan_darah);
        System.out.println("Jarak\t\t\t: " + jarak);
        System.out.println("Jumlah penduduk\t\t: " + jumlah_penduduk);
        System.out.println("Suhu\t\t\t: " + suhu);
        System.out.println("Berat\t\t\t: " + (float) berat);
        System.out.println("Saldo\t\t\t: " + saldo);
        System.out.println("Angka desimal\t\t: " + angka_desimal);
    }
    
}