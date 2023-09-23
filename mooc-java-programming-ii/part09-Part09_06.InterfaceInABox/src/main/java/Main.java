
public class Main {
    public static void part1(){
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
    }
    
    public static void part2(){
        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
    }
    
      public static void part3(){
        Box box1 = new Box(5);

        box1.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box1.add(new Book("Robert Martin", "Clean Code", 1));
        
        Box box2 = new Box(5);
        box2.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box2.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
 
        Box oneBigBox = new Box(20);
        oneBigBox.add(box1);
        oneBigBox.add(box2);

        System.out.println(oneBigBox);
    }
    
     
    
    public static void main(String[] args) {
        // test your classes here
        //part1();
        //part2();
        part3();
    }

}
