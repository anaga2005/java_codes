class Demo{
    String name;
    String color;
    int milage;
    public void setData(String x,String y,int a){
        
        name=x;
        color=y;
        milage=a;
        
    }
    
    public String getname(){
        return name;
    }
    public String getcolor(){
        return color;
    }
    public int getmilage(){
        return milage;
    }
    


}
public class Car{
    public static void main(String[] args){
        Demo d=new Demo();
        d.setData("BMW","blue",100);
        
         System.out.println("The car  name is: "+d.getname());
          System.out.println("The Car color is: "+d.getcolor());
           System.out.println("The Car  milage is: "+d.getmilage());


        
    }
}