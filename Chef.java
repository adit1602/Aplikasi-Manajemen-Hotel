public class Chef {
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

    public void dataChef(){
        System.out.println("Nama chef : Indra Adityawarman");
        System.out.println("Alamat    : Yogyakarta");
        System.out.println("No Hp     : 082289039049"   );
        System.out.println("\n");
        System.out.println("Nama chef : Makise Kurisu");
        System.out.println("Alamat    : Yogyakarta");
        System.out.println("No Hp     : 082289098763"   );
        System.out.println("\n");
        System.out.println("Nama chef : Akeno Himejima");
        System.out.println("Alamat    : Yogyakarta");
        System.out.println("No Hp     : 082289484763"   );
    }
}
