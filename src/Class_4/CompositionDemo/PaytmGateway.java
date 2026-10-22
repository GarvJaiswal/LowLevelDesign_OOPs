package Class_4.CompositionDemo;

public class PaytmGateway implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("Paytm: paid Rs " + amount);
    }

    @Override
    public String getGatewayName() {
        return "Paytm";
    }
}