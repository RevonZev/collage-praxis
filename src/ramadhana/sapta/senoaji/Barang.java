package ramadhana.sapta.senoaji;

import java.util.Objects;

public class Barang implements Comparable<Barang> {
    private char kodeTipe;
    private int kode;
    private String jenis;
    private String nama;
    private int stok;

    public Barang(String jenis, String nama, int stok) {
        this.jenis = jenis;
        this.nama = nama;
        this.stok = stok;
        setKodeTipe();
    }

    public String getFullKode() {
        return Character.toString(this.kodeTipe) + getStrKode();
    }

    public int getKode() {
        return this.kode;
    }

    public char getKodeTipe() {
        return this.kodeTipe;
    }

    public String getJenis() {
        return this.jenis;
    }

    public String getNama() {
        return this.nama;
    }

    public int getStok() {
        return stok;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
        setKodeTipe();
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getStrKode() {
        if (this.kode < 10) {
            return "00" + this.kode;
        } else if (this.kode < 100) {
            return "0" + this.kode;
        }
        return Integer.toString(this.kode);
    }

    private void setKodeTipe() {
        if (Objects.equals(this.jenis, "pulpen") || Objects.equals(this.jenis, "pensil") || Objects.equals(this.jenis, "spidol")) {
            this.kodeTipe = 'A';
            return;
        } else if (Objects.equals(this.jenis, "buku tulis") || Objects.equals(this.jenis, "kertas")) {
            this.kodeTipe = 'B';
            return;
        }
        this.kodeTipe = 'C';
    }

    @Override
    public int compareTo(Barang o) {
        return this.getFullKode().compareTo(o.getFullKode());
    }

    @Override
    public String toString() {
        return getFullKode() + " {" +
                "jenis='" + jenis + '\'' +
                ", nama='" + nama + '\'' +
                ", stok=" + stok +
                '}';
    }
}
