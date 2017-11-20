package CTCI.LinkedList;

/**
 * Created by jtomjob on 7/28/2017.
 */
public class Intersection {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        LinkedList list = new LinkedList();
        list.appendFirst(a);
        list.appendFirst(b);
        list.appendFirst(c);
        list.appendFirst(d);
        list.appendFirst(e);
        list.appendFirst(f);
        list.appendFirst(g);
        list.appendFirst(h);
        list.appendFirst(i);
        a.next = d;
        Intersection ld = new Intersection();
        
        //list.printLinkedList();


    }
}
