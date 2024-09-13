public class Power {
//in this method for this question : Stack height is n
    public static void main(String[] args) {
        System.out.println(powerfun(2,5));
    }

    public static int powerfun(int x , int n) {
        if (n == 0 ) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        return x * powerfun(x,n-1);
    }
}
