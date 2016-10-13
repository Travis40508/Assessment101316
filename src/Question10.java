import java.util.Scanner;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question10 {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next().toLowerCase().substring(0, 1);

        System.out.print(s + " is" + (isVowel(s) ? " " : " not ") + "a vowel");
    }

    public static boolean isVowel(String s) {
        // fill this in.
        // this should check if the string, 1 character, given is a vowel.
        if(s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
            return true;
        }
        return false;
    }
}


