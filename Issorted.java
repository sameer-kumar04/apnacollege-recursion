public class Issorted {
    public static void main(String[] args) {
        int[] array = { 2, 4, 6, 8, 10 };
        System.out.println(issorted(array, 0));
    }

    public static boolean issorted(int[] arr, int index) {

        if (index == arr.length - 1) { // because here we are doing index + 1 so the base condition is contains
                                       // arr.length - 1
            return true;
        }

        return arr[index] < arr[index + 1] && issorted(arr, index + 1);
    }
}
