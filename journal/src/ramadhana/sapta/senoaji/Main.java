package ramadhana.sapta.senoaji;

import java.util.LinkedList;
import java.util.List;
import ramadhana.sapta.senoaji.Search;

public class Main {
    public static void main(String[] args) {
        int result;

        // Soal Linear Search
        LinkedList<Integer> soalLinearSearch = new LinkedList<Integer>();
        soalLinearSearch.addAll(List.of(new Integer[]{30, 4, 7, 10, 8, 100, 33}));
        result = Search.linear(9, soalLinearSearch);
        System.out.println((result == -1) ? "Not Found" : "Found" );
    }

}
