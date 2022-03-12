package ramadhana.sapta.senoaji;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Barang> barangA = new ArrayList<>();
    static ArrayList<Barang> barangB = new ArrayList<>();
    static ArrayList<Barang> barangC = new ArrayList<>();

    public static void main(String[] args) {
//        Toko ABC (ATK)
//
//        Data dalam ArrayList, kelas generic
//
//        Kode barang:
//        - AXXX: pulpen, pensil, spidol
//        - BXXX: buku tulis, kertas
//        - CXXX: tempat pensil, tas, dll.
//
//        Data: kode barang, jenis barang, nama barang,
//                current stok
//
//        Penampilan data sorted berdasarkan kode barang
//
//        Data dapat dirubah dan dihapus

        while (true) {
            System.out.print("\n1. Menambahkan\n2. Memodifikasi\n3. Menghapus\n4. Menampilkan\nMasukkan nomor: ");
            int in = sc.nextInt(); sc.nextLine();
            if (in == 1) {
                addBarang();
            } else if (in == 2) {
                modifyBarang();
            } else if (in == 3) {
                removeBarang();
            } else if (in == 4) {
                displayBarang();
            }
        }
    }

    private static void displayBarang() {
        System.out.println();
        for (Barang barang:barangA) {
            System.out.println(barang.toString());
        }
        for (Barang barang:barangB) {
            System.out.println(barang.toString());
        }
        for (Barang barang:barangC) {
            System.out.println(barang.toString());
        }
    }

    private static void removeBarang() {
        System.out.print("\nKode barang yang ingin dihapus: ");
        String in = sc.nextLine();

        // Can be more efficient
        if (in.charAt(0) == 'A') {
            for (int i = 0; i < barangA.size(); i++) {
                if (in.equals(barangA.get(i).getFullKode())) {
                    barangA.remove(i);
                    return;
                }
            }
        } else if (in.charAt(0) == 'B') {
            for (int i = 0; i < barangB.size(); i++) {
                if (in.equals(barangB.get(i).getFullKode())) {
                    barangB.remove(i);
                    return;
                }
            }
        } else if (in.charAt(0) == 'C') {
            for (int i = 0; i < barangC.size(); i++) {
                if (in.equals(barangC.get(i).getFullKode())) {
                    barangC.remove(i);
                    return;
                }
            }
        }
    }

    private static void modifyBarang() {
        System.out.print("\nKode barang yang ingin dimodifikasi: ");
        String editKode = sc.nextLine();
        System.out.print("1. Modifikasi nama barang\n2. Modifikasi stok barang\nMasukkan nomor: ");
        int in = sc.nextInt(); sc.nextLine();
        System.out.print("Modifikasi menjadi: ");
        String editTo = sc.nextLine().toLowerCase();

        // Can be more efficient
        if (editKode.charAt(0) == 'A') {
            for (Barang barang : barangA) {
                if (editKode.equals(barang.getFullKode())) {
                    if (in == 1) {
                        barang.setNama(editTo);
                    } else if (in == 2) {
                        barang.setStok(Integer.parseInt(editTo));
                    }
                    return;
                }
            }
        } else if (editKode.charAt(0) == 'B') {
            for (Barang barang : barangB) {
                if (editKode.equals(barang.getFullKode())) {
                    if (in == 1) {
                        barang.setNama(editTo);
                    } else if (in == 2) {
                        barang.setStok(Integer.parseInt(editTo));
                    }
                    return;
                }
            }
        } else if (editKode.charAt(0) == 'C') {
            for (Barang barang : barangC) {
                if (editKode.equals(barang.getFullKode())) {
                    if (in == 1) {
                        barang.setNama(editTo);
                    } else if (in == 2) {
                        barang.setStok(Integer.parseInt(editTo));
                    }
                    return;
                }
            }
        }
    }

    private static void addBarang() {
        System.out.print("\nJenis barang: ");
        String jenis = sc.nextLine().toLowerCase();
        System.out.print("Nama barang: ");
        String nama = sc.nextLine().toLowerCase();
        System.out.print("Stok barang: ");
        int stok = sc.nextInt();

        Barang barang = new Barang(jenis, nama, stok);

        // Can be more efficient
        // Fix? barang limit of 999, new barang fullKode doesn't take empty fullKode, this takes the last barang's fullKode + 1
        // E.g.: removed C016, then add barang; the new barang doesn't take C016, but C032 + 1.
        if (barang.getKodeTipe() == 'A') {
            if (barangA.size() != 0) {
                barang.setKode(barangA.get(barangA.size() - 1).getKode() + 1);
            } else {
                barang.setKode(0);
            }
            barangA.add(barang);
        } else if (barang.getKodeTipe() == 'B') {
            if (barangB.size() != 0) {
                barang.setKode(barangB.get(barangB.size() - 1).getKode() + 1);
            } else {
                barang.setKode(0);
            }
            barangB.add(barang);
        } else {
            if (barangC.size() != 0) {
                barang.setKode(barangC.get(barangC.size() - 1).getKode() + 1);
            } else {
                barang.setKode(0);
            }
            barangC.add(barang);
        }
    }
}
