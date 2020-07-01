import java.util.Objects;
import java.util.function.Predicate;

public class WorkWithPredicate {
    public static void main(String[] args) {
        Predicate<String> isNull = Objects::nonNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> jna = (String s)-> (s.charAt(0)=='J' || s.charAt(0)=='N') &&
                s.charAt(s.length()-1)=='A';
        String nullString = null;
        String nonNullString = "";
        String nonEmptyString = "da";

        String jnaString = "NATASHA";
        String nonJnaString = "Luba";
        System.out.println("is Null?");
        System.out.println(isNull.test(nullString));
        System.out.println(isNull.test(nonNullString));
        System.out.println("is Empty?");
        System.out.println(isEmpty.test(nonNullString));
        System.out.println(isEmpty.test(nonEmptyString));

        System.out.println("is Null and Empty?");
        System.out.println(isNull.and(isEmpty).test(nonEmptyString));

        System.out.println("Does the line begin with the letter “J” or “N” and end with “A”?");
        System.out.println(jna.test(jnaString));
        System.out.println(jna.test(nonJnaString));


    }
}
