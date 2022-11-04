import java.util.Scanner;

public class Resepsionis extends Karyawan{
    Scanner in = new Scanner(System.in);
    public int id, no_hp, bayar;
    public String nama, alamat;
    public String kamar, bookKamar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }

    public int getBayar() {
        int bayark = in.nextInt();
        System.out.println("1. MBANGKING");
        System.out.println("2. TUNAI");

        if(bayark==1){
            System.out.println("Anda memilih Metode Pembayaran MBangking");
            System.out.println("Silahkan bayar sesuai tagihan ke no rek 7909494030");
            System.out.println("===================================================");
        }else if(bayark==2){
            System.out.println("2. TUNAI");
            System.out.println("Anda Memilih Pembayaran Tunai");
            System.out.println("Kami akan memproses Pembayaran anda");
            System.out.println("=====================================");
        }else{
            System.out.println("Pembayaran dengan metode lain tidak tersedia");
        }
        return bayar;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
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

    public String getKamar() {
        return kamar;
    }

    public void setKamar(String kamar) {
        this.kamar = kamar;
    }

    public String getBookKamar() {
        return bookKamar;
    }

    public void setBookKamar(String bookKamar) {
        this.bookKamar = bookKamar;
    }

    public void cekKamar(){

        System.out.println("===========================");
        System.out.println("jumlah kamar yang tersedia "+kamar);

    }

    public void prosesBayar(){
        System.out.println("=====================================================");
        System.out.println("Silahkan pilih metode pembayaran yang anda inginkan ");
        System.out.println("1. MBANGKING");
        System.out.println("2. TUNAI");
        System.out.println("=====================================================");
        int bayark = in.nextInt();
        if(bayark==1){
            System.out.println("Anda memilih Metode Pembayaran MBangking");
            System.out.println("Silahkan bayar sesuai tagihan ke no rek 7909494030");
            System.out.println("===================================================");
        }else if(bayark==2){
            System.out.println("2. TUNAI");
            System.out.println("Anda Memilih Pembayaran Tunai");
            System.out.println("Kami akan memproses Pembayaran anda");
            System.out.println("=====================================");
        }else{
            System.out.println("Pembayaran dengan metode lain tidak tersedia");
        }
}
    public void booking(){
        System.out.println("=================================================");
        System.out.println("Apakah anda ingin membooking kamar ? 1.ya/2.tidak");
        int pilih = in.nextInt();
        if(pilih== 1){
            System.out.println("pilih jenis kamar");
            System.out.println("1. kamar premium -----Rp.700.000/malam");
            System.out.println("2. kamar menengah-----Rp.400.000/malam");
            System.out.println("3. kamar ekonomi -----Rp.300.000/malam");
            int pkamar = in.nextInt();
            if(pkamar==1){
                System.out.println("anda memilih jenis kamar premium dengan harga Rp.700.000/malam");
            }else if(pkamar==2){
                System.out.println("anda memilih jenis kamar menengah dengan harga Rp.400.000/malam");
            }else if(pkamar==3){
                System.out.println("anda memilih jenis kamar ekonomi dengan harga Rp.300.000/malam");
            }else{
                System.out.println("Pilihan kamar tidak tersedia");
            }
        } else if (pilih==2) {
            System.out.println("baik terimakasih atas kunjungan anda");
        } else {
            System.out.println("Pilihan tidak tersedia");
        }
    }

    @Override
    public String namak() {
        return null;
    }
    public String namak(String namak){
        return namak;
    }
}
