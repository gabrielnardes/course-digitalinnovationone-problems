import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    for (String line = br.readLine(); line != null; line = br.readLine()) {
      char[] lineChar = line.toCharArray();
      String remove = "";
      
      for (int i = 0; i < lineChar.length; i++) {
        for (int j = i + 1; j < lineChar.length; j++) {
          if (lineChar[i] == lineChar[j]) {
            if (lineChar[i] != lineChar[i+1]) {
              remove += lineChar[i]; 
            }
          }
        }
      }
      
      line = line.replaceFirst(remove,"");
      System.out.println(line);
    }
    
    br.close();
  }
}