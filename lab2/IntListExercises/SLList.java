package IntListExercises;

public class SLList {
    private static class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /** First item if exists will be at sentinel.next */
    private IntNode sentinel;
    private int size;

    public SLList() {
        this.sentinel = new IntNode(63,null);
        this.size = 0;
    }
    public SLList(int x) {
        this.sentinel = new IntNode(63,null);
        this.sentinel.next = new IntNode(x, null);
        this.size = 1;
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        this.sentinel.next = new IntNode(x, this.sentinel);
        this.size++;
    }

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return this.sentinel.next.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        this.size++;

        IntNode p = this.sentinel;

        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
    }

//    /** Adds an item to the end of the list. recursively*/
//    public IntNode addLast(IntNode p, int x) {
//        if (p == null) {
//            return new IntNode(x, null);
//        }
//        else if (p.next == null) {
//            p.next = new IntNode(x, null);
//            return p;
//        } else {
//            p.next = addLast(p.next, x);
//            return p;
//        }
//

    public int getSize() {
        return this.size;
    }

    public static void main(String[] args) {

    }
}