package CTCI.LinkedList;


/**
 * Created by jtomjob on 7/17/2017.
 */
public class pallindrome {
    public boolean pallindrome(LinkedList list){
        boolean result = true;
        StringBuilder s = new StringBuilder();
        Node n = list.head;
        while (n != null){
            s.append(n.a);
            n = n.next;
        }
        int len = s.length();
        System.out.println(s);
        int counter = len-1;
        for (int i = 0; i <= len/2; i++) {
            if (s.charAt(i) != s.charAt(counter)){
                return false;
            }
            counter--;
        }
        return result;
    }
    public boolean pallindromeApproach2(LinkedList list){ //reverse linkedlist and compare
        boolean result = true;

        //reverse linked list. head is the head of reversed linked list
        Node head = null;
        Node n = list.head;
        while (n != null){
            Node nd = new Node(n.a);
            nd.next = head;
            head = nd;
            n = n.next;
        }

        //Now compare
        Node n1 = list.head;

        while (n1 != null){
            if(n1.a != head.a){
                return false;
            }
            n1 = n1.next;
            head = head.next;
        }

        return result;
    }


    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(1);
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

        pallindrome p = new pallindrome();
        System.out.println(p.pallindrome(list));
        System.out.println(p.pallindromeApproach2(list));
    }
}
