package ramadhana.sapta.senoaji;

public class Lagu {
    private String judul;
    private String penyani;

    public Lagu(String nip, String nama, String devisi) {
        this.judul = judul;
        this.penyani = penyani;
    }

    @Override
    public String toString() {
        return judul + " by " + penyani;
    }
}
