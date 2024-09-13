public class Reversestring {
    public static void main(String[] args) {
        String str = "abcd";

        reverse(str, str.length() - 1);

    }

    public static void reverse(String str, int index) {

        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }

        // if (index < 0) { you can use this base condition too
        // return;
        // }

        System.out.print(str.charAt(index));
        reverse(str, index - 1);
    }
}
