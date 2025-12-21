
import java.util.LinkedHashSet;

public class ExOfLinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        System.out.println(lhs);
        for(Object i:lhs)
        {
            System.out.println(i);
        }


    }
    
}