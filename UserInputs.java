import java.util.ArrayList;
import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        // I like Python more than Java.
        // easy();
        expandable();
    }

    public static void easy() {
        // Ez. Ctrl+C, Ctrl+V.
        System.out.println("--------------- Input Easy ---------------------");
        Scanner in = new Scanner(System.in);
        System.out.print("NIM: ");
        String nim = in.nextLine();
        System.out.print("Nama: ");
        String nama = in.nextLine();
        System.out.print("Kelas: ");
        String ipk = in.nextLine();
        in.close();
        System.out.println("--------------- Output Easy ---------------------");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + ipk);
    }

    public static void expandable() {
        ArrayList<String> usrInputs = new ArrayList<String>();

        System.out.println("--------------- Input Expandable ---------------------");
        try (Scanner in = new Scanner(System.in)) {
            String[] whats = { "NIM: ", "Nama: ", "Kelas: " }; // Expandable!
            for (String what : whats) {
                System.out.print(what);
                usrInputs.add(what + in.nextLine());
            }
        }

        System.out.println("--------------- Output Expandable ---------------------");
        usrInputs.forEach(usrInput -> {
            System.out.println(usrInput);
        });
    }
}