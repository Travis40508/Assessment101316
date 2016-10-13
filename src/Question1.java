/**
 * Created by lrterry on 10/13/16.
 */
import java.util.ArrayList;
public class Question1 {
    // Create an array list with numbers 1 - 10
    // Print out size of array list
    public static ArrayList<Integer> ints = new ArrayList<>();
    public static  void main(String[] args) {
        for(int i = 1; i < 11; ++i) {
            ints.add(i);
        }
        System.out.println(ints.size());
    }
}
