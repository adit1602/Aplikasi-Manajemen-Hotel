public class Karyawan {
    protected String nama;
    private String alamat;
    protected int no_hp;


    public void gaji(Resepsionis resepsionis){
        System.out.println("Gaji resepsionis adalah Rp. 6.000.000");
    }

    public void gaji(Housekeep housekeep){
        System.out.println("Gaji housekeeping adalah Rp. 4.000.000");
    }
    public void tugas(){
        System.out.println("Karyawan Hotel");
    }

}
