package ramadhana.sapta.senoaji;

public class Antrian {
    int noPanggilan;
    String nama;
    String tipe;
    int jumlah;

    public Antrian(int noPanggilan, String nama, String tipe, int jumlah) {
        this.noPanggilan = noPanggilan;
        this.nama = nama;
        this.tipe = tipe;
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return "No. " + noPanggilan
                + ": pembelian " + nama
                + ", " + tipe
                + ", sebanyak " + jumlah
                + " sudah siap";
    }
}