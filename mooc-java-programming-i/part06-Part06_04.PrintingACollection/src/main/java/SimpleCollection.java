
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String message = "";
        if (this.elements.size() == 0){
            message = "The collection "+this.name+" is empty.";
        } else {
            if (this.elements.size() > 1){
                message = "The collection "+this.name+" has "+ this.elements.size()+" elements:";
            } else {
                message = "The collection "+this.name+" has 1 element:";
            }
            
            for(String element: elements){
                message += "\n" + element;
            }
        }
        
        
        return message;
    }
}
