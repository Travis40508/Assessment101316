/**
 * Created by lrterry on 10/13/16.
 */
import java.util.Scanner;
public class Question2 {
    //Ask a user to add in a number, save it to a variable and print out that variable.
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        System.out.println(answer);
    }
}
