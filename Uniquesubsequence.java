import java.util.*;

public class Uniquesubsequence {
    public static void main(String[] args) {
        String str = "aaa"; // for aaa which have same characters
        HashSet<String> set = new HashSet<>(); // beacuse set contains only unique values (not repitions allowed in set
                                               // )
        finduniquesubsequence(str, 0, "", set);
    }

    public static void finduniquesubsequence(String str, int index, String newString, Set<String> set) {

        if (index == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(index);

        // want to be in [characters choice is that it wants to come or not ]
        finduniquesubsequence(str, index + 1, newString + currChar, set);

        // not want to be in
        finduniquesubsequence(str, index + 1, newString, set);
    }
}
