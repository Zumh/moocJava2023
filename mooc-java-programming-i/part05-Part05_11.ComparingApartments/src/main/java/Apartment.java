
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    private int totalArea(Apartment apartMent){
        return apartMent.rooms * apartMent.squares;
    }
    public boolean largerThan(Apartment compared){
        boolean isLarger = false;
        int givenTotalArea = totalArea(compared);
        int thisTotalArea = totalArea(this);
        
        if (thisTotalArea > givenTotalArea){
            isLarger = true;
        }
        return isLarger;
    }
    
    private int calculatePrice(Apartment apartMent){
        return apartMent.squares * apartMent.pricePerSquare;
    }
    
    public int priceDifference(Apartment compared){
        int price = this.calculatePrice(this) - this.calculatePrice(compared);
        
        if (price < 0 ){
            price *= -1;
        }
        return price;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        return this.calculatePrice(this) > this.calculatePrice(compared);
    }

}
