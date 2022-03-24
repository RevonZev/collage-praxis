package ramadhana.sapta.senoaji;

import java.util.Scanner;

import static ramadhana.sapta.senoaji.InfixToPostFixEvaluation.convertToPostfix;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // ✔ Infix to postfix
        System.out.print("Infix to postfix: ");
        System.out.println(convertToPostfix(sc.nextLine()));
    }
}