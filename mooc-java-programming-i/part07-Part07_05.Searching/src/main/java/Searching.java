
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        int foundBookIndex = -1;
        for(int indexBook = 0; indexBook < books.size(); indexBook++){
            if(books.get(indexBook).getId() == searchedId){
                foundBookIndex = indexBook;
                break;
            }
        }
        return foundBookIndex;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int foundBookIndex = -1;
        // make sure the book is sorted base on book's id
        int begin = 0;
        int end = books.size() - 1;
        int mid = 0;
        
        while(begin <= end){
            // split the books size into half
            // repeat if right is smaller than left

            mid = (end + begin)/2;

            // check if the current book = middle book have the searchedId
            // return true if that is the searchId
            if(books.get(mid).getId() == searchedId){
                foundBookIndex = mid;
                begin = end+1;
            } else if (books.get(mid).getId() < searchedId){
                // update the left index to current mid+1 index if the current book's id is smaller than searchedId
                begin = mid + 1;
                
            } else if (books.get(mid).getId() > searchedId){ 
                // update the right index to current mid-1 index if the current book's id is greater than searchedId
                end = mid - 1;
            }
        }
        return foundBookIndex;
    }
}

