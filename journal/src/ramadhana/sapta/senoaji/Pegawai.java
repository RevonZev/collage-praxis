package ramadhana.sapta.senoaji;

public class Pegawai {
    private String nip;
    private String nama;
    private String devisi;

    public Pegawai(String nip, String nama, String devisi) {
        this.nip = nip;
        this.nama = nama;
        this.devisi = devisi;
    }

    public String getNip() {
        return this.nip;
    }

    public String getNama() {
        return this.nama;
    }

    public String getDevisi() {
        return this.devisi;
    }

    @Override
    public String toString() {
        return nip + " {" +
                "nama='" + nama + '\'' +
                ", devisi='" + devisi + '\'' +
                '}';
    }
}
