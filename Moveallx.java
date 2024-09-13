public class Moveallx {
    public static void main(String[] args) {
        movex("axbcxxxd", 0, 0, "");
    }

    public static void movex(String str, int index, int count, String newString) {

        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);

        if (currChar == 'x') {
            count++;
            movex(str, index + 1, count, newString);
        } else {
            newString += currChar;
            movex(str, index + 1, count, newString);
        }
    }
}
