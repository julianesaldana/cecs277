package labs.lab14;

public class PaypalStrategy implements PaymentStrategy{
    String emailid;
    String password;

    public PaypalStrategy(String emailid, String password){
        this.emailid = emailid;
        this.password = password;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount + " paid using Paypal");
    }

}
