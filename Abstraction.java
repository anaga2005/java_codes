abstract class Plane{
    abstrcat void takeoff();
    abstrcat void fly();
    abstrcat void land();


}
class CargoPlane extends Plane{
    void takeoff(){
        System.out.println("Cargo plane is taking off");

    }
    void fly(){
        Sysytem.out.println("CargoPlane is flying at low heights");
    }
    void land(){
        System.out.println("CargoPlane is landing");
    }
}
class PassengerPlane extends Plane{
   void takeoff(){
        System.out.println("Passengerplane is taking off");

    }
    void fly(){
        Sysytem.out.println("PassengerPlane is flying at low heights");
    }
    void land(){
        System.out.println("PassengerPlane is landing");
    }
}
class Airport{
    Plane ref;
    ref.takeoff();
    ref.fly();
    ref.land();
}
public class Abstraction{
    public static void main(String[] args){

    }
}