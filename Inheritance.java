import java.util.*;
class Plane{
    void takeoff(){
        System.out.println("plane is takingoff");
    }
    void fly(){
        System.out.println("plane is flying");
    }
    void land(){
        System.out.println("plane is landed");
    }
}
class Cargo extends Plane{
    void fly(){
        System.out.println("cargo is flying at low high");
    }
    void specialCargo(){
        System.out.println("it is special");
    }
}
class Passanger extends Cargo{
    void land(){
        System.out.println("cargo landed safely");
    }
    void gone(){
        System.out.println("cargo was gone");
    }
}
class Flighter extends Passanger{
    void takeoff(){
        System.out.println("takeoff safely");
    }
    void clash(){
        System.out.println("flight was crashed");
    }

}
public class Inheritance {
    public static void main(String[] args) {
        Flighter c=new Flighter();
        c.takeoff();
        c.fly();
        c.land();
        c.specialCargo();
        c.gone();
        c.clash();
    }
}