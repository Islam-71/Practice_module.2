import java.sql.SQLOutput;
import java.util.*;

public class Zadacha2 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(6);
        a.add(8);
        Set<Integer> b = new HashSet<>();
        boolean flag = false;
        for (int i = 0; i < a.size(); i++){
          Integer d = a.get(i);
          boolean g = b.add(d);
          if (!g){
              flag = true;
              break;
          }
        }
        System.out.println(flag);

    }
}
