import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Deklarasi Objek
        Resepsionis resepsionis = new Resepsionis();
        Tamu tamu = new Tamu();
        Chef chef = new Chef();
        Makanan makanan = new Makanan();
        Housekeep housekeep = new Housekeep();
        Bayar bayar = new Bayar();
        Kamar hotel = new Kamar();
        Scanner input = new Scanner(System.in);


        //Menu Resepsionis
        System.out.println("=====MENU RESEPSIONIS====");
        System.out.println("Masukkan kamar yang tersedia : ");
        String kamar = input.nextLine();
        resepsionis.setKamar(kamar);
        resepsionis.cekKamar();
        System.out.println("Cek Data : 1. Yes/9. Lanjut");
         int pil2 = input.nextInt();
        if (pil2 == 1) {
            System.out.println("FITUR RESEPSIONIS");
            System.out.println("Lihat data 1.HouseKeeping/2.Chef/3.Data Makanan/4.Data Kamar");
            int pil3 = input.nextInt();
            if (pil3 == 1) {
                housekeep.dataHousekeep();
            } else if (pil3 == 2) {
                chef.dataChef();
            } else if (pil3 == 3){
                makanan.DataMakanan();
            }else if (pil3 == 4){
                hotel.DataKamar();
            }else{
                System.out.println("Data tidak ditemukan");
            }

        }
        System.out.println("===============================================");
        System.out.println("Halo Selamat Datang Di HOTEL BERSAMA");
        System.out.println("===============================================");
        String trik = input.nextLine();
        tamu.setNama(trik);
        System.out.print("Masukkan Nama anda : ");
        String namat = input.nextLine();
        tamu.setNama(namat);
        System.out.print("Masukkan Alamat anda : ");
        String alamtt = input.nextLine();
        tamu.setAlamat(alamtt);
        System.out.println("==============================");
        System.out.println("Halo Mr/Mrs. " + namat);
        System.out.println("MENU TAMU ");
        System.out.println("==============================");
        int jawab;
        do {
            System.out.println("1. Booking Kamar ");
            System.out.println("2. Pesen makan");
            System.out.println("Masukkan Pilihan yang anda inginkan");
            int pili = input.nextInt();
            if (pili == 1) {
                resepsionis.booking();
                resepsionis.prosesBayar();
                bayar.pembayaran();
            } else if (pili == 2) {
                makanan.DataMakanan();
                tamu.order();
            }
            System.out.println("Apakah ada ingin yang ditambahkan lagi ? 1.yes/2.No");
            jawab = input.nextInt();
        } while (jawab == 1);

        System.out.println("=========================================");
        tamu.masuk();
    }
}