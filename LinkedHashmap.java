import java.util.LinkedHashMap;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> m = new LinkedHashMap<>();
        m.put("name", "Anupama");
        m.put("age","20");
        System.out.println(m);
        System.out.println("---------------");
        System.out.println(m.get("name"));
        System.out.println("---------------");
        for(Object i : m.keySet()){
            System.out.println(i + " : " + m.get(i));
        }
    }
}