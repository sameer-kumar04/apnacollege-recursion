//in this method stack height (or depth) is logn

public class Powerstackheight {

    public static void main(String[] args) {
        System.out.println(powerfun1(2,5));
    }

    public static int powerfun1(int x , int n) {
        if (n == 0 ) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) { //if n is even
            return powerfun1(x,n/2) * powerfun1(x, n / 2);
        }

        else { //if n is odd
            return powerfun1(x,n/2) * powerfun1(x, n / 2) * x;
        }
    }
}
