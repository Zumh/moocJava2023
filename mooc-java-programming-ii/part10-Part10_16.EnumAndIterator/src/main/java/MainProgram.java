
public class MainProgram {
 
    public static void part1(){
        Person anna = new Person("Anna", Education.PHD);
        System.out.println(anna);
    }
    
    public static void part2(){
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        university.print();
        
        
        university.fire(Education.HS);

        System.out.println("==");

        university.print();
    }
    
    public static void part3(){
        
        Employees t = new Employees(); 
        Person h = new Person("Arto", Education.PHD); 
        t.add(h); 
        t.print(Education.PHD); 
    }
    public static void main(String[] args) {
          

        // test your classes here
        //part1();
        //part2();
        part3();
    }
}
