package CTCI.LinkedList;

import java.util.HashSet;

/**
 * Created by jtomjob on 7/17/2017.
 */
public class LoopDetection {
    public int loopdetection(LinkedList linkedlist){
        HashSet<Node> hs = new HashSet<>();
        Node n = linkedlist.head;
        while (n != null){
            if(hs.contains(n)){
                return n.a;
            }
            hs.add(n);
            n = n.next;
        }
        return -1;
    }

    public int loopDetectionbetter(LinkedList list){
        Node slow = list.head;
        Node fast = list.head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow.a;
            }
        }

        slow = list.head;

        //lot to do

        return -1;
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
        list.appendFirst(g);
        list.appendFirst(h);
        list.appendFirst(i);
        a.next = d;
        LoopDetection ld = new LoopDetection();
        System.out.println(ld.loopdetection(list));
        System.out.println(ld.loopDetectionbetter(list));




        //list.printLinkedList();


    }
}
