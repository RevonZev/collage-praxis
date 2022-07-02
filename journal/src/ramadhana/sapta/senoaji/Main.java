package ramadhana.sapta.senoaji;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Map<String, Integer> dataMahasiswa = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.print("\n\n-------------------\n1. Masukkan\n2. Menghapus\n3. Menampilkan\nMasukkan nomor: ");
            switch (sc.next()) {
                case "1":
                    System.out.print("\nMasukkan NIM: ");
                    String NIM = sc.next();
                    System.out.print("Masukkan nilai: ");
                    Integer nilai = sc.nextInt();
                    dataMahasiswa.put(NIM, nilai);
                    break;
                case "2":
                    System.out.print("\nMasukkan NIM: ");
                    dataMahasiswa.remove(sc.next());
                    break;
                case "3":
                    System.out.println();
                    int avg = 0;

                    for (Map.Entry<String, Integer> i : dataMahasiswa.entrySet()) {
                        System.out.println("NIM: " + i.getKey() + ", nilai: " + i.getValue());
                        avg += i.getValue();
                    }

                    avg = avg / dataMahasiswa.size();
                    System.out.println("Nilai rata-rata: " + avg);
                    break;
            }
        }
    }

}
