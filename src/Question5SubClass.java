/**
 * Created by rodneytressler on 10/13/16.
 */
public class Question5SubClass extends Question5 {
    String myName = "Travis";
    public void printName(String name) {
        name = myName;
        System.out.println(name);
    }
}
