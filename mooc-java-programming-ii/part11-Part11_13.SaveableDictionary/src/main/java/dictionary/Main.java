package dictionary;

public class Main {
    public static void part1(){
        SaveableDictionary dictionary = new SaveableDictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("apina", "apfe");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("monkey"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("banana"));
    }
    
    public static void part2(){
        SaveableDictionary dictionary = new SaveableDictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("ohjelmointi", "programming");
        dictionary.delete("apina");
        dictionary.delete("banana");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("monkey"));
        System.out.println(dictionary.translate("banana"));
        System.out.println(dictionary.translate("banaani"));
        System.out.println(dictionary.translate("ohjelmointi"));
    }
    
    public static void part3(){
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
    }
    
    public static void part4(){
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        dictionary.load();

        // use the dictionary

        boolean status = dictionary.save();
        if(status){
            System.out.println("saved");
        }
    }
    public static void part5(){
        SaveableDictionary s = new SaveableDictionary();
        s.add("apina", "monkey");
        s.add("tietokone", "computer");
        s.add("apina", "apfe");
        s.translate("apina");
    }
    public static void main(String[] args) {
        // You can test your dictionary here
        //part1();
        //part2();
        //part3();
        //part4();
        part5();
    }
}
