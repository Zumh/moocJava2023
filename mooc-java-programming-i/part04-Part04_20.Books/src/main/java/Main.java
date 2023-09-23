import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // collect book
    /*
    public static void getBooks(ArrayList<Book> collectionOfBook){
        // ask the user for title, pages, and publication year
        Scanner scanner = new Scanner(System.in);
        
        String title = "";
        int pages = 0;
        int year = 0;
        
        while(true){
        
            System.out.print("Title: ");
            title = scanner.nextLine();
            if (title.equals("")){
                break;
            }
            System.out.print("Pages: ");        
            pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            year = Integer.valueOf(scanner.nextLine());
            
            collectionOfBook.add(new Book(title, pages, year));
        }
    }*/
    // display
    /*
    public static void printBooks(ArrayList<Book> collectionOfBook){
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("What information will be printed? ");
        String userInput = scanner.nextLine();
        
        for(Book book:collectionOfBook){
            if(userInput.equals("name")){
                System.out.println(book.getTitle());
            } else if(userInput.equals("everything")){
                System.out.println(book);
            }
        }
    }*/
    
    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Book> collectionOfBook = new ArrayList<>();
        
        //getBooks(collectionOfBook);
        //printBooks(collectionOfBook);
        
        
        String title = "";
        int pages = 0;
        int year = 0;
        
        while(true){
        
            System.out.print("Title: ");
            title = scanner.nextLine();
            if (title.equals("")){
                break;
            }
            System.out.print("Pages: ");        
            pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            year = Integer.valueOf(scanner.nextLine());
            
            collectionOfBook.add(new Book(title, pages, year));
        }
        
        String userInput = "";
        System.out.print("What information will be printed? ");
        userInput = scanner.nextLine();
        
        if (userInput.equals("name")){
            for(Book book:collectionOfBook){
                System.out.println(book.getTitle());

            }
        } else if (userInput.equals("everything")){
            for(Book book:collectionOfBook){
                System.out.println(book);

            }
        }
        
        
    }
}
