package ramadhana.sapta.senoaji;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        binarySearch();
        sorting();
//        studiKasus();
    }

    private static int binarySearch(int[] data, int key) {
        int low = 0;
        int high = data.length - 1;
        int middle = (low + high + 1) / 2;
        int location = -1;
        do {
            System.out.print(remainingElements(data, low, middle, high));

            if (key == data[middle]) {
                return middle;
            }
            else if (key < data[middle]) { // middle element is too high
                high = middle - 1;
            }
            else { // middle element is too low
                low = middle + 1;
            }

            middle = (low + high + 1) / 2;
        } while ((low <= high) && (location == -1));
        return - 1;
    }

    // method to output certain values in array for binary search
    private static String remainingElements(int[] data, int low, int middle, int high) {
        StringBuilder temporary = new StringBuilder();
        // append elements left in array
        for (int i = low; i <= high; i++) {
            if (i == middle) {
                temporary.append("-" + data[i] + "- ");
            } else {
                temporary.append(data[i] + " ");
            }
        }
        return String.format("%s\n", temporary);
    }

    private static void studiKasus() {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

        listMahasiswa.add(new Mahasiswa("123", "Nina", "D3IF 43-03"));
        listMahasiswa.add(new Mahasiswa("111", "Ria", "D3IF 43-02"));
        listMahasiswa.add(new Mahasiswa("100", "Siti", "D3IF 43-01"));
        listMahasiswa.add(new Mahasiswa("124", "Nina", "D3IF 43-04"));

        cetakList(listMahasiswa);
        System.out.println("Masukkan NIM mahasiswa yang dicari: ");
        String keyNim = input.nextLine();
        Mahasiswa mhsResult = cariMahasiswa(listMahasiswa,keyNim);
        System.out.print("Mahasiswa dengan NIM "+ keyNim);
        System.out.println(" adalah: \n" + mhsResult);
    }

    private static void cetakList(ArrayList<Mahasiswa> arrayList){
        for (Mahasiswa mhs:arrayList) {
            System.out.println(mhs);
        }
        System.out.println();
    }

    private static Mahasiswa cariMahasiswa(ArrayList<Mahasiswa> list, String nim){
        Mahasiswa result;
        Collections.sort(list);
        int index = Collections.binarySearch(list,new Mahasiswa(nim,null,null));
        result = list.get(index);
        return result;
    }

    private static void sorting() {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(8.1,"How to Train Your Dragon",2010));
        list.add(new Movie(8.3,"Avengers: Endgame",2019));
        list.add(new Movie(8.3,"Your Name",2016));
        list.add(new Movie(8.2,"Toy Story 3",2010));
        list.add(new Movie(8.4,"Avengers: Infinity War",2018));
        System.out.println("Movies before sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + "-" +
                    movie.getRating() + "-" +
                    movie.getYear());
        }
        Collections.sort(list);
        System.out.println("\nMovies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + "-" +
                    movie.getRating() + "-" +
                    movie.getYear());
        }
    }

    private static void binarySearch() {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();
        // create array of 15 random integers in sorted order
        int[] data = generator.ints(15, 10, 91).sorted().toArray();
        System.out.printf("%s\n\n", Arrays.toString(data));

        System.out.print("Please enter an integer value (-1 to quit): ");
        int searchInt = input.nextInt();

        while (searchInt != -1) {
            int location = binarySearch(data, searchInt);

            if (location == -1) {
                System.out.printf("%d was not found\n\n", searchInt);
            }
            else {
                System.out.printf("%d was found in position %d\n\n",
                        searchInt, location);
            }

            System.out.print("Please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();
        }
    }
}
