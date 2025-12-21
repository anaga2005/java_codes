import java.util.HashMap;

public class ExampleForMap {
    public static void main(String[] args) {
        //Map m=new HashMap();
        HashMap<String,String> hm=new HashMap<String,String>();
        hm.put("Name","Navya");
        hm.put("Place","Nellore");
        System.out.println(hm);
        System.out.println("---------------------------------------------");
        System.out.println(hm.get("Name"));
        System.out.println("---------------------------------------------");
        for(Object i:hm.keySet())
        {
            System.out.println(i);
        }
        
    }
    
}