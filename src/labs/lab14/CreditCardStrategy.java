package labs.lab14;

public class CreditCardStrategy implements PaymentStrategy{
    String name;
    String cardNumber;
    String cvv;
    String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv,String dateOfExpiry){
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;

    }

    @Override
    public void pay(int amount){
        System.out.println(amount * 1.03 + " paid using creditcard");
    }
}
