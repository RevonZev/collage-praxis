package ramadhana.sapta.senoaji;

import java.lang.constant.Constable;

public class Lagu {
    private String judul;
    private String penyani;

    public Lagu(String judul, String penyani) {
        this.judul = judul;
        this.penyani = penyani;
    }

    public String getJudul() {
        return this.judul;
    }

    @Override
    public String toString() {
        return judul + " by " + penyani;
    }
}
