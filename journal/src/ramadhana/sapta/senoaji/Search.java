package ramadhana.sapta.senoaji;

import java.util.LinkedList;

public class Search {
    public static int linear(Integer toSearch, LinkedList<Integer> listToSearch) {
        for (int i = 0; i < listToSearch.size(); i++) {
            if (toSearch.equals(listToSearch.get(i))) {
                return i;
            }
        }
        return -1;
    }
}
