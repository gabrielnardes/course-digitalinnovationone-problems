import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            Set<String> set = new HashSet<>();
            
            while (sc.hasNext()) {
                char[] vogais = sc.nextLine().toCharArray();
                String frase = sc.nextLine();
                
                int count = 0;
                
                for (char v : vogais) {
                    count += frase.chars().filter(ch -> ch == v).count();
                }
                

                System.out.println(count);
            }
            
            sc.close();
      }
}
