import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Exampleset {
    public static void main(String[] args) {
        Queue<String> s1=new LinkedList<String>() ;
            
        
        s1.add("Ram");
        s1.add("Shyam");
        s1.add("Hari");
        s1.add("Sita");             
        s1.add("Gita");
        s1.add("Laxman");
        s1.add("Shyam");
        s1.add("Hari");
        System.out.println(s1);
        LinkedHashSet<String> s2=new LinkedHashSet<String>(s1);
        System.out.println(s2);
        s2.remove("Hari");
        s2.contains("Shyam");
        s2.isEmpty();
        s2.removeFirst();
    }
}
