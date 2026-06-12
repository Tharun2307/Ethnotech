import java.util.HashMap;
import java.util.LinkedHashMap;

public class ExampleMap {
    public static void main(String[] args) {
        HashMap<String,String> map=new LinkedHashMap<String,String>();
        map.put("Tree","Oak");
        map.put("BIRD","parrot");
        map.put("Animal","Dog");
        System.out.println(map.get("Tree"));
        System.out.println(map.get("BIRD"));
        System.out.println(map.remove("Animal"));
        System.out.println(map.containsKey("Tree"));
        System.out.println(map.containsValue("parrot"));
    }
    
}
