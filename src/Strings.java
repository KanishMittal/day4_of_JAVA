import java.util.*;

public class Strings {
    public static void main(String[] args) {
        //String declaration
        String firstName = "Kanish";
        String lastName = "Mittal";
        Scanner sc = new Scanner(System.in);
        System.out.println("My name is: " + firstName + " " + lastName);
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);

        String sentence = "The name is xyz";
        //substring(beginning index, last index);
        String naam = sentence.substring(12, sentence.length());
        System.out.println(naam);
    }
}

/*

**Strings are immutable**
Some other String functions
concatenation
.length;
charAt(i);
.compareTo();
if string1 > string2, it will return a positive value
if string1 == string2, it will return zero
if string1 < string2, it will return a negative value
*/