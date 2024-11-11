import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zadacha1 {
    public static void main(String[]args){
    List<Integer> a = new ArrayList<>();
    a.add(3);
    a.add(8);
    a.add(15);
    a.add(17);
    int r = 23;
    Set<Integer> index = new HashSet<>();
    for( int i = 0; i < a.size(); i++){
        for ( int j = 0; j < a.size(); j++){
            if (i!=j){
                int sum = a.get(i) + a.get(j);
                if(sum == r){
                    boolean addI = index.add(i);
                    boolean addJ = index.add(j);
                    if (addI && addJ) {
                        System.out.println(i + " " + j);
                    }
            }
            }
        }
    }
    }
}
