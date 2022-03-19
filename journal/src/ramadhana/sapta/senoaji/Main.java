package ramadhana.sapta.senoaji;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static SinglyLinkedList<Pegawai> linkedList = new SinglyLinkedList<>();

    public static void main(String[] args) {
        linkedList.insertAtFront(new Pegawai("6706123456", "Yulia", "D3IF 45-01"));
        linkedList.insertAtBack(new Pegawai("6706789013", "Riki", "D3IF 45-02"));
        linkedList.insertAtFront(new Pegawai("6706123458", "Tina", "D3IF 45-03"));

        while (true) {
            switch (mainMenu()) {
                case 1:
                    inputMenu();
                    continue;
                case 2:
                    eraseMenu();
                    continue;
                case 3:
                    displayMenu();
                    continue;
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
    }

    private static void inputMenu() {
    }

    private static int mainMenu() {
        System.out.print("1. Input data\n2. Hapus data\n3. Display Data\n4. Keluar\nMasukkan angka: ");
        return sc.nextInt();
    }
}
