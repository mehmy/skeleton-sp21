package IntListExercises;

import jh61b.junit.In;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (rest == null){
            return 1;
        }
        else {
            return 1 + this.rest.size();
        }
    }

    /** Return the size of the list using no recursion! */
    public int iterativeSize() {
        return 0;
    }

    /** Returns the ith value in this list.*/
    public int get(int i) {
        if (i == 0) {
            return this.first;
        } else {
            return this.rest.get(i - 1);
        }
    }

    /** Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        IntList Q = null;
        if (L.rest == null) {
            return Q = new IntList(L.first * x, null);
        } else {
            return Q = new IntList(L.first * x, incrList(L.rest, x));
        }
    }

    /** Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        L.first *= x;
        if (L.rest != null) {
            dincrList(L.rest, x);
        }
        return L;
    }

    public static void printList(IntList L) {
        while (L != null) {
            System.out.print(L.first + " ");
            L = L.rest;
        }
        System.out.println();
    }

    public void addFirst(int x) {
        IntList copy = new IntList(this.first, this.rest);
        this.first = x;
        this.rest = copy;
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
        L = new IntList(5, L);


        System.out.println(L.size());
        System.out.println(L.get(3));

//        printList(incrList(L, 3));  // Should print: 2 4 6
//        printList(dincrList(L, 3));  // Should print: 2 4 6
        L.addFirst(6);
        System.out.println(L.get(0));


    }
}