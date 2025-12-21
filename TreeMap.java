public class TreeMap{
    public static void main(String[] args){
        TreeMap tm=new TreeMap();
        tm.put("Name","Anupama");
        tm.put("Age",20);
        tm.put("Email","anu@gmail.com");
        System.out.println(tm);
        System.out.println("----------------------");
        for(Object obj:tm.keySet()){
            System.out.println(obj);
        }
        for(Object obj:tm.entrySet()){
            System.out.println(obj);
        }
    }
}