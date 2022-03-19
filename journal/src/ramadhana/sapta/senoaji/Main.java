package ramadhana.sapta.senoaji;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static SinglyLinkedList<Pegawai> linkedList = new SinglyLinkedList<>();

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
        System.out.println();
        linkedList.print();
    }

    private static void eraseMenu() {
        System.out.println();
        System.out.print("Hilangkan data diawal (1) atau akhir (2) list: ");
        switch (sc.nextInt()) {
            case 1:
                linkedList.removeFromFront();
                break;
            case 2:
                linkedList.removeFromBack();
                break;
        }
        System.out.println();
    }

    private static void inputMenu() {
        System.out.println();
        System.out.print("NIP: ");
        String nip = sc.next();
        System.out.print("Nama: ");
        String nama = sc.next();
        System.out.print("Devisi: ");
        String devisi = sc.next();

        System.out.print("Tambahkan data diawal (1) atau akhir (2) list: ");
        switch (sc.nextInt()) {
            case 1:
                linkedList.insertAtFront(new Pegawai(nip, nama, devisi));
                break;
            case 2:
                linkedList.insertAtBack(new Pegawai(nip, nama, devisi));
                break;
        }
        System.out.println();
    }

    private static int mainMenu() {
        System.out.print("1. Input data\n2. Hapus data\n3. Display Data\n4. Keluar\nMasukkan angka: ");
        return sc.nextInt();
    }
}
