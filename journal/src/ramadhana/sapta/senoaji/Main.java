// Nama: Senoaji Sapta Ramadhana
// Kelas: D3IF-45-02
// NIM: 6706213109
// Link video penjelasan: https://youtu.be/GXr-dG5PDy4

package ramadhana.sapta.senoaji;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Queue<Antrian> antrian = new LinkedList<Antrian>();
    static int noAntrian = 0;

    public static void main(String[] args) {
        contoh();
        masukkan();
    }

    private static void masukkan() {
        while (true) {
            System.out.print("1. Tambahkan antrian\n2. Kurangkan antrian\n3. Hilangkan antrian\n4. Keluar\nMasukkan nomor: ");
            int pilihan = sc.nextInt(); sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Nama roti: ");
                String nama = sc.next(); sc.nextLine();
                System.out.print("Tipe roti: ");
                String tipe = sc.next(); sc.nextLine();
                System.out.print("Jumlah roti: ");
                int jumlah = sc.nextInt(); sc.nextLine();
                System.out.println();

                addAntrian(nama, tipe, jumlah);
            } else if (pilihan == 2) {
                System.out.println();
                removeAntrian();
            } else if (pilihan == 3) {
                System.out.println();
                antrian.clear();
            } else {
                System.exit(0);
            }
        }
    }

    private static void contoh() {
        addAntrian("Roti Upin", "Roti manis", 10);
        addAntrian("Roti Ipin", "Roti manis", 5);
        addAntrian("Roti Ismail", "Roti manis", 4);
        removeAntrian();
        addAntrian("Roti Santi", "Roti manis", 2);
    }

    private static void addAntrian(String nama, String tipe, int jumlah) {
        noAntrian += 1;
        antrian.add(new Antrian(noAntrian, nama, tipe, jumlah));

        System.out.println("Nomor antrian anda: " + noAntrian);
        System.out.println("Anda menunggu " + (antrian.size() - 1) + " orang lagi");

        System.out.println();
    }

    private static void addAntrianManual(int no, String nama, String tipe, int jumlah) {
        antrian.add(new Antrian(no, nama, tipe, jumlah));

        System.out.println("Nomor antrian anda: " + noAntrian);
        System.out.println("Anda menunggu " + (antrian.size() - 1) + " orang lagi");

        System.out.println();
    }

    private static void removeAntrian() {
        if (antrian.size() != 0) {
            System.out.println(antrian.peek() + "\n");
            antrian.remove();
        } else {
            System.out.println("Tidak ada antrian\n");
        }
    }
}