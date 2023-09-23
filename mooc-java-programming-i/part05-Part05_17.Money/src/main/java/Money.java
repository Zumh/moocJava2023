
// immutable 
// we can't change money we must create a new object to change money
public class Money {
    // The result of this word is that the values of these object variables cannot be modified after they have been set in the constructor
    // final meaning
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
   
   public Money minus(Money decreaser){
       int thisTotalCents = this.euros * 100 + this.cents;
       int otherTotalCents = decreaser.euros * 100 + decreaser.cents;
       int euroDifference =  thisTotalCents - otherTotalCents;
       
       if (euroDifference < 0){
           return new Money(0,0);
       } 
       
      
       return new Money(euroDifference / 100, euroDifference % 100);
   }
   
   public boolean lessThan(Money compared){
       // converting euros to cents helps compare a lot better
       return (this.euros * 100 + this.cents) < (compared.euros * 100 + compared.cents);
   }
   
   public Money plus(Money addition){
       Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
       
       return newMoney;
   }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
