 import java.util.Scanner ;
    public class StudiKasus115 {
      public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         int hargaPerCup = 18000;
         int jumlahCup;
         int uangBayar;
         int totalHarga;
         int diskon;
         int totalBayar;
         int Kembalian;
         int Kurang;

         System.out.print("Masukan jumlah cup : ");
         jumlahCup = sc.nextInt();
         System.out.print("masukan nominal bayar : ");
         uangBayar = sc.nextInt();

         totalHarga = jumlahCup * hargaPerCup;
         diskon = 0;

         if (totalHarga>100000) {
            diskon = totalHarga * 10 / 100;
            
            totalBayar = totalHarga - diskon;

            System.out.print("--RINCIAN PEMBAYARAN--");
            System.out.println("Total Harga : Rp" + totalHarga);
            System.out.println("Diskon : Rp " + diskon);
            System.out.println("Total Bayar : Rp" + totalBayar);

            if (uangBayar >= totalBayar) {
               Kembalian = uangBayar - totalBayar;
               System.out.println("Kembalian : Rp" + Kembalian);
            } else {
               Kurang = totalBayar - uangBayar;
               System.out.println("Uang tidak cukup, Kurang : Rp" + Kurang);
            }
         }
         sc.close();
      }
    }
 
    

