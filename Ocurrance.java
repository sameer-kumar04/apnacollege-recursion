public class Ocurrance {

    public static int first = -1;
    public static int last = -1;

    public static void main(String[] args) {
        String str = "abaacdarffaah";
        firsttime(str, 'f', 0);
    }

    public static void firsttime(String str, char target, int index) {
        if (index == str.length()) {
            System.out.println("First occurance : " + first + "," + "Last Occurance : " + last);
            return;
        }

        if (str.charAt(index) == target) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }

        firsttime(str, target, index + 1);

    }
}