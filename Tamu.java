import java.util.Scanner;

public class Tamu {

    Scanner in = new Scanner(System.in);
    public int id_tamu, no_hp;
    public String nama, alamat;

    public int getId_tamu() {
        return id_tamu;
    }

    public void setId_tamu(int id_tamu) {
        this.id_tamu = id_tamu;
    }

    public int getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void masuk(){
        System.out.println("nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Anda sudah melakukan registrasi Check in !");
    }

    public void keluar(){
        System.out.println("Maaf waktu regist anda sudah habis ");
        System.out.println("Terima kasidh sudah mengunjungi hotel kami");
    }

    public void order(){
        int pesan;
        System.out.println("ingin pesan apa ? ");
        pesan = in.nextInt();
        if(pesan==1){
            System.out.println("Anda memesan Nasi Goreng ");
            System.out.println("Pesanan akan segera kami antar");
        }else if(pesan==2){
            System.out.println("Anda memesan Pecel Lele");
            System.out.println("Pesanan akan segera kami antar");
        }else if(pesan==3){
            System.out.println("Anda memesan Ayam Bakar ");
            System.out.println("Pesanan akan segera kami antar");
        }else if(pesan==4){
            System.out.println("Anda memesan Nasi Padang ");
            System.out.println("Pesanan akan segera kami antar");
        }else if(pesan==5){
            System.out.println("Anda memesan Nasi Orak-Arik ");
            System.out.println("Pesanan akan segera kami antar");
        }else{
            System.out.println("menu tidak tersedia");
            System.out.println("Pesanan dibatalkan secara otomatis");
        }

    }

}

