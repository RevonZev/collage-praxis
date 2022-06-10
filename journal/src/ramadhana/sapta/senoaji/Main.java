package ramadhana.sapta.senoaji;

import java.util.ArrayList;

public class Main {
    static ArrayList<NodeAdjacent> nodes = new ArrayList<>();

    public static void main(String[] args) {
        BFSDemo();
//        DFSDemo();
    }

    private static void BFSDemo() {
        NodeAdjacent node1 = new NodeAdjacent(1);
        NodeAdjacent node2 = new NodeAdjacent(2);
        NodeAdjacent node3 = new NodeAdjacent(3);
        NodeAdjacent node4 = new NodeAdjacent(4);
        NodeAdjacent node5 = new NodeAdjacent(5);
        NodeAdjacent node6 = new NodeAdjacent(6);
        NodeAdjacent node7 = new NodeAdjacent(7);
        NodeAdjacent node8 = new NodeAdjacent(8);
        NodeAdjacent node9 = new NodeAdjacent(9);
        NodeAdjacent node10 = new NodeAdjacent(10);

        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);
        nodes.add(node5);
        nodes.add(node6);
        nodes.add(node7);
        nodes.add(node8);
        nodes.add(node9);
        nodes.add(node10);

        int[][] matriks = {
                // Simpul 1 2 3 4 5 6 7 8 9 10
                {0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, // Simpul 1 : value 1
                {1, 0, 1, 0, 1, 0, 0, 0, 0, 0}, // Simpul 2 : value 2
                {1, 1, 0, 0, 1, 1, 0, 0, 0, 0}, // Simpul 3 : value 3
                {0, 0, 0, 0, 1, 0, 1, 0, 0, 0}, // Simpul 4 : value 4
                {0, 1, 1, 1, 0, 1, 0, 1, 0, 0}, // Simpul 5 : value 5
                {0, 0, 0, 0, 1, 0, 0, 1, 0, 0}, // Simpul 6 : value 6
                {0, 0, 0, 1, 0, 0, 0, 0, 1, 0}, // Simpul 7 : value 7
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 1}, // Simpul 8 : value 8
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 1}, // Simpul 9 : value 9
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0}, // Simpul 10: value 10
        };

        System.out.print("Traversal Graph : ");
        BFS_ADJACENT bfs_adjacent = new BFS_ADJACENT();
        bfs_adjacent.setNodes(nodes);
        bfs_adjacent.bfs(matriks, node10);
        System.out.println();
    }

    private static void DFSDemo() {
        NodeAdjacent node1 = new NodeAdjacent(1);
        NodeAdjacent node2 = new NodeAdjacent(2);
        NodeAdjacent node3 = new NodeAdjacent(3);
        NodeAdjacent node4 = new NodeAdjacent(4);
        NodeAdjacent node5 = new NodeAdjacent(5);
        NodeAdjacent node6 = new NodeAdjacent(6);
        NodeAdjacent node7 = new NodeAdjacent(7);
        NodeAdjacent node8 = new NodeAdjacent(8);
        NodeAdjacent node9 = new NodeAdjacent(9);
        NodeAdjacent node10 = new NodeAdjacent(10);

        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);
        nodes.add(node5);
        nodes.add(node6);
        nodes.add(node7);
        nodes.add(node8);
        nodes.add(node9);
        nodes.add(node10);

        int[][] matriks = {
        // Simpul 1 2 3 4 5 6 7 8 9 10
            {0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, // Simpul 1 : value 1
            {1, 0, 1, 0, 1, 0, 0, 0, 0, 0}, // Simpul 2 : value 2
            {1, 1, 0, 0, 1, 1, 0, 0, 0, 0}, // Simpul 3 : value 3
            {0, 0, 0, 0, 1, 0, 1, 0, 0, 0}, // Simpul 4 : value 4
            {0, 1, 1, 1, 0, 1, 0, 1, 0, 0}, // Simpul 5 : value 5
            {0, 0, 0, 0, 1, 0, 0, 1, 0, 0}, // Simpul 6 : value 6
            {0, 0, 0, 1, 0, 0, 0, 0, 1, 0}, // Simpul 7 : value 7
            {0, 0, 0, 0, 1, 1, 0, 0, 0, 1}, // Simpul 8 : value 8
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 1}, // Simpul 9 : value 9
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0}, // Simpul 10: value 10
        };

        DFS_ADJACENT dfsExample = new DFS_ADJACENT();
        System.out.print("Traversal Graph : ");
        dfsExample.setNodes(nodes);
        dfsExample.dfsUsingStack(matriks, node1);
        System.out.println();
    }
}