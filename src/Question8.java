/**
 * Created by lrterry on 10/13/16.
 */
import java.util.ArrayList;
public class Question8 {
    // Copy the array list from the previous question to this one.
    // Iterate over the ArrayList and print out each element.
    public static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
