import java.io.Console;
import java.util.Scanner;

public class TugasModul3 {

    public static void main(String[] args) {
        System.out.println("\n--- Soal 1 ---");
        soal1();
        System.out.println("\n--- Soal 2 ---");
        soal2();
        System.out.println("\n--- Soal 3 ---");
        soal3();
    }

    public static void soal1() {
        Integer[] passangers = { 2, 4, 3, 1, 2, 4, 3 };
        Integer total = 0;
        for (Integer passenger : passangers) {
            total += passenger;
        }
        System.out.println(total);
    }

    public static void soal2() {
        Integer[] moneys = { 100000, 85000, 101000, 120000, 50000, 75000 };
        Integer total = 2500000;
        for (Integer money : moneys) {
            total -= money;
        }
        System.out.println(total);
    }

    public static void soal3() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Angka 1:");
            Float angka1 = in.nextFloat();
            System.out.print("Angka 2:");
            Float angka2 = in.nextFloat();

            System.out.println("Penjumlahan: " + (angka1 + angka2));
            System.out.println("Pengurangan: " + (angka1 - angka2));
            System.out.println("Perkalian: " + (angka1 * angka2));
            System.out.println("Pembagian: " + (angka1 / angka2));
            System.out.println("Modulus: " + (angka1 % angka2));

            System.out.print("\nBoolean 1:");
            Boolean boolean1 = in.nextBoolean();
            System.out.print("Boolean 2:");
            Boolean boolean2 = in.nextBoolean();

            System.out.println("And: " + (boolean1 & boolean2));
            System.out.println("Or: " + (boolean1 | boolean2));
            System.out.println("Not: " + !boolean1);
            System.out.println("Xor: " + (boolean1 ^ boolean2));
        }
    }

    // public static void expandable() {
    // ArrayList<String> usrInputs = new ArrayList<String>();

    // System.out.println("--------------- Input Expandable ---------------------");
    // try (Scanner in = new Scanner(System.in)) {
    // String[] whats = { "NIM: ", "Nama: ", "Kelas: " }; // Expandable!
    // for (String what : whats) {
    // System.out.print(what);
    // usrInputs.add(what + in.nextLine());
    // }
    // }

    // System.out.println("--------------- Output Expandable
    // ---------------------");
    // usrInputs.forEach(usrInput -> {
    // System.out.println(usrInput);
    // });
    // }
}
