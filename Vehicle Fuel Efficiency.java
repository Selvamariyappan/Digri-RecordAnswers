import java.util.Scanner;
class Vehicle{
    void calculateFuelEfficiency(){
    }
}
class Car{
    void calculateFuelEfficiency(float km,float hr){
        System.out.println("Fuel efficiency for Car: "+(float)(km/hr));
    }
}
class Truck{
    void calculateFuelEfficiency(float km ,float hr){
        System.out.println("Fuel efficiency for Truck: "+(float)(km/hr));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Car c=new Car();
        Truck t=new Truck();
        float ckm=s.nextInt();
        float chr=s.nextInt();
        float tkm=s.nextInt();
        float thr=s.nextInt();
        c.calculateFuelEfficiency(ckm,chr);
        t.calculateFuelEfficiency(tkm,thr);   
    }
}