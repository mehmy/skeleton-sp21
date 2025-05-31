package lab1;

/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /**
     * if n is an even number, the number will get divided by 2
     * if n is an uneven number, the number will be multiplied by 3 and added by 1
     * */
    public static int nextNumber(int n) {
        if (n % 2 == 0){
            return n / 2;
        } else {
            return n * 3 + 1;
        }

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

