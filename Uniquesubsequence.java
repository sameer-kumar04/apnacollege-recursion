import java.util.*;

public class Uniquesubsequence {
    public static void main(String[] args) {
        String str = "aaa"; // for aaa which have same characters
        HashSet<String> set = new HashSet<>(); // beacuse set contains only unique values (not repitions allowed in set
                                               // )
        finduniquesubsequence(str, "", set);
    }

    public static void finduniquesubsequence(String str, String newString, Set<String> set) {

        if (str.isEmpty()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(0);

        // want to be in [characters choice is that it wants to come or not ]
        finduniquesubsequence(str.substring(1), newString + currChar, set);

        // not want to be in
        finduniquesubsequence(str.substring(1), newString, set);
    }
}
