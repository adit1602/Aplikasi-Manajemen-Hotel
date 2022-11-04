public class Kamar {
    public int no_kamar;
    public String lokasi;

    public int getNo_kamar() {
        return no_kamar;
    }

    public void setNo_kamar(int no_kamar) {
        this.no_kamar = no_kamar;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    public void DataKamar(){
        System.out.println("1. kamar premium -----Rp.700.000/malam");
        System.out.println("2. kamar menengah-----Rp.400.000/malam");
        System.out.println("3. kamar ekonomi -----Rp.300.000/malam");
    }
}
