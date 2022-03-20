package ramadhana.sapta.senoaji;

import java.util.Scanner;

public class Main {
//      Store:
//      ✔ Judul Lagu
//      ✔ Nama Penyani
//
//      ✔ Dianggap diputar saat didisplaykan semua
//
//      Ada:
//      ✔ Input lagu (di akhir)
//      ✔ Hapus lagu (✔ terakhir masuk & ✔ sesuai judul)
//      ✔ Memainkan lagu (display semua, awal > akhir > awal)
            static Scanner sc = new Scanner(System.in);
    static DoublyLinkedList<Lagu> linkedList = new DoublyLinkedList<>();

    public static void main(String[] args) {
        while (true) {
            switch (mainMenu()) {
                case 1:
                    inputMenu();
                    break;
                case 2:
                    eraseMenu();
                    break;
                case 3:
                    displayMenu();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    private static void displayMenu() {
        linkedList.print();
    }

    private static void eraseMenu() {

        System.out.print("1. Hapus lagu di akhir list\n2. Hapus lagu dengan judul\nMasukkan angka: ");
        int usrIn = sc.nextInt();
        if (usrIn == 1) {
            linkedList.removeFromBack();
        } else {
            System.out.print("Judul: ");
            String judul = sc.nextLine(); sc.next();
            linkedList.removeByJudul(judul);
        }
        System.out.println();
    }

    private static void inputMenu() {
        System.out.print("Judul: ");
        String judul = sc.next();
        System.out.print("Penyanyi: ");
        String penyanyi = sc.next();

        linkedList.insertAtBack(new Lagu(judul, penyanyi));

        System.out.println();
    }

    private static int mainMenu() {
        System.out.print("1. Input lagu\n2. Hapus lagu\n3. Mainkan lagu\n4. Keluar\nMasukkan angka: ");
        int usrIn = sc.nextInt();
        System.out.println();
        return usrIn;
    }
}
