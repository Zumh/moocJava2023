
public class Main {
    public static void dog(){
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();
    }
    
    public static void cat(){
        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();
    }
    
    public static void finaltest(){
        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();
    }
    public static void main(String[] args) {
        // you can test how your classes work here
        dog();
        cat();
        finaltest();
    }

}
