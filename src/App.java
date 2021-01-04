import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        String str = "dad";
        System.out.println("String was: " + str);
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                System.out.println("Found existing key " + c + " in map, adding 1 to existing value of counter " + map.get(c));
                int counter = map.get(c);
                map.put(c, counter+1);
            }
            else {
                map.put(c, 1);
            }
        }
     
        for (Map.Entry<Character, Integer> entry : map.entrySet() ) {
            if (entry.getValue() > 1 )
            System.out.println(entry.getKey() + "\t repeats: " + entry.getValue());
            
        }
            
        
    }
}
