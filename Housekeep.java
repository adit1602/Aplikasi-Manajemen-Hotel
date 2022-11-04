public class Housekeep extends Karyawan {
    public String nama, alamat;
    public int no_hp;

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

    public int getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }

    public void dataHousekeep(){
        System.out.println("Nama       : Houhouin Kyouma");
        System.out.println("Alamat     : Tokyo");
        System.out.println("No Hp      : 093839303002");
        System.out.println("\n");
        System.out.println("Nama       : Kirisaki Hotaru");
        System.out.println("Alamat     : Tokyo");
        System.out.println("No Hp      : 0938398733002");
        System.out.println("\n");
        System.out.println("Nama       : Wakabe Hanabata");
        System.out.println("Alamat     : Tokyo");
        System.out.println("No Hp      : 0938398773302");
    }

    @Override
    public String namak() {
        return null;
    }
}
