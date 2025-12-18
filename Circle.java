class Demo{
    int area(int r){
        return 3.14*r*r;
    }
    double area(double r){
        return 3.14f*r*r;
    }
    
}
public class Circle{
    public static void main(String[] args){
        Demo d=new Demo();
        System.out.println(d.area(5));
        System.out.println(d.area(6));
    }
}