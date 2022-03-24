package ramadhana.sapta.senoaji;

import java.util.Scanner;

import static ramadhana.sapta.senoaji.InfixToPostFixEvaluation.convertToPostfix;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static QueueLL task = new QueueLL<>();

    public static void main(String[] args) {
        System.out.print("1. Soal 01: infix ke postfix\n2. Soal 02: todo manager\nMasukkan angka: ");
        if (sc.nextInt() == 1) {
            soal01();
        } else {
            soal02();
        }
    }

    private static void soal01() {
        // ✔ Infix to postfix
        System.out.print("\nInfix to postfix: ");
        System.out.println(convertToPostfix(sc.next()));
    }

    private static void soal02() {
        // ✔ Add task
        // ✔ Display task (Show task that are inputted first)
        // ✔ Erase completed task
        // ✔ Display all task
        while (true) {
            System.out.print("\n1. Add task\n2. Display task\n3. Delete task\n4. Exit\nMasukkan angka: ");
            switch (sc.nextInt()) {
                case 1:
                    addTask();
                    break;
                case 2:
                    displayTask();
                    break;
                case 3:
                    deleteTask();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    private static void deleteTask() {
        task.dequeue();
    }

    private static void displayTask() {
        System.out.println();
        task.printQueue();
    }

    private static void addTask() {
        System.out.print("\nTask: ");
        task.enqueue(sc.next());
    }
}