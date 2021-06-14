import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    SortedMap<Integer, Integer> map = new TreeMap<>();
    ArrayList<Integer> arr = new ArrayList<>();
    
    int testCases = sc.nextInt();
    
    while (testCases-- > 0) {
          arr.add(sc.nextInt());
    }
    
    arr.forEach(id -> 
        map.put(id, 
                map.get(id) == null ? 
                    1 : map.get(id) + 1 ) 
    );

    map.entrySet().forEach(entry-> {
          System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());  
    });
    
    sc.close();
  }
}
