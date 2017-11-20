package CTCI.LinkedList;

/**
 * Created by jtomjob on 7/12/2017.
 */
class Node {
    int a;
    Node next;
    Node prev;

    public Node(int a) {
        this.a = a;
    }

}

public class LinkedList {

    Node head;
    Node tail;

    public void appendTail(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void appendFirst(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void printLinkedList() {
        Node n = head;


        while (n != null) {
            System.out.print(n.a);
            System.out.print('\t');
            n = n.next;
        }
        System.out.print('\n');
    }

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
        list.printLinkedList();
    }
}
