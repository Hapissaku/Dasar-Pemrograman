import java.util.Scanner;
public class StudiKasus2_15 {
    public static void main(String[] args) {
        String nama, jenisKegiatan;
        int jumlahDokumen,juara;
        boolean status;

    Scanner sc = new Scanner(System.in);

    System.out.print("Nama = ");
    nama = sc.nextLine();
    System.out.print("Jenis Kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, dll) = ");
    jenisKegiatan = sc.nextLine();   
    
    

    if (jenisKegiatan.equalsIgnoreCase("belmawa") || jenisKegiatan.equalsIgnoreCase("bakorma") 
        || jenisKegiatan.equalsIgnoreCase("mandiri")){
        System.out.print("Jumlah Dokumen Yang Diupload = ");
        jumlahDokumen = sc.nextInt();
        if (jumlahDokumen == 4){
            System.out.print("Juara (1/2/3/0 untuk tidak juara) = ");
            juara = sc.nextInt();
            if ((juara == 1)||(juara == 2)||(juara == 3)){
                System.out.println("Dokumen Lengkap, Dana Diberikan");}
            else{
                System.out.println("Bukan Juara 1/2/3 Tidak Mendapat Dana");
            }}
        else{
            System.out.println("Jumlah Dokumen kurang "+(4-jumlahDokumen)+(" , Dana Tidak Diberikan"));
        }}
    else if (jenisKegiatan.equalsIgnoreCase("pkm")){
        System.out.print("Status Pendanaan (True/False) = ");
        status = sc.nextBoolean();
        if (status){
            System.out.println("Dana Penghargaan Diberikam");
        }
        else{
            System.out.println("Pendanaan Tidak Lolos, Dana Tidak DIberikan");
        }
    }
    else{
        System.out.println("Jenis Kegiatan Lain Tidak Mendapat Dana");
    }
    sc.close();
}
}
