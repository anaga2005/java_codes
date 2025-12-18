class Student{
    String rollNo;
    String name;
    String email;
    int age;
    public void setData(String x,String y,String z,int a){
        rollNo=x;
        name=y;
        email=z;
        age=a;
    }
    public String getrollNo(){
        return rollNo;
    }
    public String getname(){
        return name;
    }
    public String getemail(){
        return email;
    }
    public int getage(){
        return age;
    }
    


}
public class Encapsulation{
    public static void main(String[] args){
        Student s=new Student();
        s.setData("A02","Anupama","anu@gamil.com",20);
        System.out.println("The student  rollno is: "+s.getrollNo());
         System.out.println("The student  name is: "+s.getname());
          System.out.println("The student  email is: "+s.getemail());
           System.out.println("The student  age is: "+s.getage());


        
    }
}