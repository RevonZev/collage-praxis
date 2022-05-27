package ramadhana.sapta.senoaji;

import java.util.Scanner;

public class Main {
//    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        adjacencyMatrixDemo();
//        adjacencyListDemo();
        soalAdjacencyMatrix();
    }

    private static void soalAdjacencyMatrix() {
        AdjacencyMatrix myMatrix = new AdjacencyMatrix(9);

//        A-DEB 0-341
//        B-E   1-4
//        C-B   2-1
//        D-G   3-6
//        E-FH  4-57
//        F-CH  5-27
//        G-H   6-7
//        H-I   7-8
//        I-F   8-5

        // A
        myMatrix.addEdge(0,3);
        myMatrix.addEdge(0,4);
        myMatrix.addEdge(0,1);
        // B
        myMatrix.addEdge(1,4);
        // C
        myMatrix.addEdge(2,1);
        // D
        myMatrix.addEdge(3,6);
        // E
        myMatrix.addEdge(4,5);
        myMatrix.addEdge(4,7);
        // F
        myMatrix.addEdge(5,2);
        myMatrix.addEdge(5,7);
        // G
        myMatrix.addEdge(6,7);
        // H
        myMatrix.addEdge(7,8);
        // I
        myMatrix.addEdge(8,5);

        myMatrix.printMatrix();
    }

    private static void adjacencyMatrixDemo() {
        AdjacencyMatrix myMatrix = new AdjacencyMatrix(4);

        myMatrix.addEdge(0,1);
        myMatrix.addEdge(1,0);
        myMatrix.addEdge(1,2);
        myMatrix.addEdge(1,3);
        myMatrix.addEdge(2,3);

        myMatrix.printMatrix();
        System.out.println(myMatrix.inEdges(3));
        System.out.println(myMatrix.outEdges(3));
    }

    private static void adjacencyListDemo() {
        AdjacencyList myList = new AdjacencyList(4);

        myList.addEdge(0,1);
        myList.addEdge(0,3);
        myList.addEdge(1,2);
        myList.addEdge(1,3);

        myList.printGraph();
    }
}
