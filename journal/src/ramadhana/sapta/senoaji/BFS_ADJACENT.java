package ramadhana.sapta.senoaji;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_ADJACENT {
    private final Queue<NodeAdjacent> queue = new LinkedList<>(); //daftar Queue
    static ArrayList<NodeAdjacent> nodes = new ArrayList<>(); //daftar simpul

    /*
    Method ini digunakan untuk mencari daftar tetangga dari suatu simpul.
    Daftar tetangga didapatkan dari matrik adjacent.
    */
    public void setNodes(ArrayList<NodeAdjacent> inNodes) {
        nodes = inNodes;
    }

    public ArrayList<NodeAdjacent> listTetangga(int[][] matriks, NodeAdjacent x) {
        int idx = -1;
        ArrayList<NodeAdjacent> tetangga = new ArrayList<>();
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).getData() == x.getData()) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {
            for (int j = 0; j < matriks[idx].length; j++) {
                if (matriks[idx][j] == 1) {
                    tetangga.add(nodes.get(j));
                }
            }
        }

        return tetangga;
    }

    /*
    Algoritma utama dari BFS. Sesuai dengan Algoritma pada bagian 13.3.1.1
    Parameter
    a. matriks : daftar matriks adjacent
    b. node : simpul awal
    */
    public void bfs(int[][] matriks, NodeAdjacent node) {
        queue.add(node);
        node.setVisited(true);

        while (!queue.isEmpty()) {
            NodeAdjacent element = queue.remove();
            System.out.print(element.getData() + " ");
            ArrayList<NodeAdjacent> tetangga = listTetangga(matriks, element);
            for (NodeAdjacent n : tetangga) {
                if (n != null && !n.isVisited()) {
                    queue.add(n);
                    n.setVisited(true);
                }
            }
        }
    }
}