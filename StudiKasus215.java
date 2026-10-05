import java.util.Scanner;

public class StudiKasus215 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = input.nextLine().toUpperCase(); 

        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = input.nextInt();

       if (jumlahDokumen < 4) {
            int kurangDokumen = 4 - jumlahDokumen;
            System.out.println("Status : Dokumen tidak lengkap (kurang " + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan.");
        } else {
            
            if (jenisKegiatan.equals("BELMAWA") || jenisKegiatan.equals("BAKORMA") || jenisKegiatan.equals("MANDIRI")) {
                
                System.out.print("Peringkat juara : ");
                int peringkatJuara = input.nextInt();

                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Dokumen lengkap dan meraih Juara " + peringkatJuara + ". Selamat, dana penghargaan diberikan!");
                } else {
                    System.out.println("Status : Juara Harapan atau peserta tidak memperoleh dana penghargaan.");
                }

            } 
        }

        input.close();
    }
}