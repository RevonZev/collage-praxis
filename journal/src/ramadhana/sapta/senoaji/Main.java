package ramadhana.sapta.senoaji;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        heapDemo();
        heapSortDemo(); // input: 23 43 12 50 5 17 8 60 11 3 -
    }

    private static void heapSortDemo() {
        MinHeap q = new MinHeap();
        int in = sc.nextInt();

        do {
            q.add(new WorkOrder(in, ""));
            in = sc.nextInt();
        } while (sc.hasNextInt());

        while (q.size() > 0) {
            System.out.println(q.remove());
        }
    }

    private static void heapDemo() {
        MinHeap q = new MinHeap();
        q.add(new WorkOrder(3, "Shampoo carpets"));
        q.add(new WorkOrder(7, "Empty trash"));
        q.add(new WorkOrder(8, "Water plants"));
        q.add(new WorkOrder(10, "Remove pencil sharpener shavings"));
        q.add(new WorkOrder(6, "Replace light bulb"));
        q.add(new WorkOrder(1, "Fix broken sink"));
        q.add(new WorkOrder(9, "Clean coffee maker"));
        q.add(new WorkOrder(2, "Order cleaning supplies"));
        while (q.size() > 0) {
            System.out.println(q.remove());
        }
    }

}
