import java.util.Scanner;
class Payment{
    void processPayment(){
    }
}
class CreditCardPayment extends Payment{
    void processPayment(String id,double price){
        System.out.println("Processing credit card payment of $"+price+" using card number "+id);
    }
}
class PayPalPayment extends Payment{
    void processPayment(String id,double price){
        System.out.println("Processing PayPal payment of $"+price+" using email "+id);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            String method=s.next();
            if(method.equalsIgnoreCase("CreditCard")){
                CreditCardPayment c=new CreditCardPayment();
                String cardNumber=s.next();
                double pay=s.nextDouble();
                c.processPayment(cardNumber,pay);
            }
            else{
                PayPalPayment p=new PayPalPayment();
                String id=s.next();
                double pay=s.nextDouble();
                p.processPayment(id,pay);
            }
        }
    }
}