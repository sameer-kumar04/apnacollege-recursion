
public class Subsequence {
    public static void main(String[] args) {
        String str = "abc";

        findsubsequence(str, 0, "");
    }

    public static void findsubsequence(String str, int index, String newString) {

        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);

        // want to be in [characters choice is that it wants to come or not ]
        findsubsequence(str, index + 1, newString + currChar);

        // not want to be in
        findsubsequence(str, index + 1, newString);
    }
}
