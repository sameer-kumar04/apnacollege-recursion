
public class Subsequence {
    public static void main(String[] args) {
        String str = "abc";

        findsubsequence(str, "");
    }

    public static void findsubsequence(String str, String newString) {

        if (str.isEmpty()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(0);

        // want to be in [characters choice is that it wants to come or not ]
        findsubsequence(str.substring(1), newString + currChar);

        // not want to be in
        findsubsequence(str.substring(1), newString);
    }
}
