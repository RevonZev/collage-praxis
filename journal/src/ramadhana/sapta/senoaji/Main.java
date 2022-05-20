package ramadhana.sapta.senoaji;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
//    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        modulDemo();
        jurnal11();
    }

    private static void jurnal11() {
        Tree<Integer> tree = new Tree<>();
        char[] tobeInserted = {'F', 'E', 'H', 'D', 'G', 'C', 'B', 'H', 'K', 'J'};

        for (char insert:tobeInserted) {
            tree.insertNode((int) insert);
        }

        tree.searchBST((int) 'K');
        tree.searchBST((int) 'A');
    }

    private static void modulDemo() {
        Tree<Integer> tree = new Tree<>();
        SecureRandom randomNumber = new SecureRandom();

        System.out.println("Inserting the following values: ");
        // insert 10 random integers from 0-99 in tree
        for (int i = 1; i <= 10; i++) {
            int value = randomNumber.nextInt(100);
            System.out.printf("%d ", value);
            tree.insertNode(value);
        }

        System.out.printf("%n%nPreorder traversal%n");
        tree.preorderTraversal();
        System.out.printf("%n%nInorder traversal%n");
        tree.inorderTraversal();
        System.out.printf("%n%nPostorder traversal%n");
        tree.postorderTraversal();
        System.out.println();

        tree.searchBST(10);
    }
}
