package CTCI.LinkedList;

/**
 * Created by jtomjob on 7/17/2017.
 */
public class SumList {
    public void sumList(LinkedList l1, LinkedList l2){
        Node n1 = l1.head;
        Node n2 = l2.head;
        int sum1=0,sum2=0,counter=0,result =0;
        LinkedList l3 = new LinkedList();

        while (n1 != null){
            sum1 += Math.pow(10,counter) * n1.a;
            counter++;
            n1 = n1.next;
        }
        counter =0;
        while (n2 != null){
            sum2 += Math.pow(10,counter) * n2.a;
            counter++;
            n2 = n2.next;
        }
        result = sum1+sum2;
        while (result > 0){
            int rem = result%10;
            result = result/10;
            Node n3 = new Node(rem);
            l3.appendTail(n3);
        }
        l3.printLinkedList();
    }

    public void sumListrev(LinkedList l1, LinkedList l2){
        Node n1 = l1.head;
        Node n2 = l2.head;
        int sum1=0,sum2=0,counter=0,result =0;
        LinkedList l3 = new LinkedList();
        int size1 = size(l1)-1;
        int size2 = size(l2)-1;

        while (n1 != null){
            sum1 += Math.pow(10,size1) * n1.a;
            size1--;
            n1 = n1.next;
        }
        counter =0;
        while (n2 != null){
            sum2 += Math.pow(10,size2) * n2.a;
            size2--;
            n2 = n2.next;
        }
        result = sum1+sum2;
        while (result > 0){
            int rem = result%10;
            result = result/10;
            Node n3 = new Node(rem);
            n3.next = l3.head;
            l3.head = n3;
        }
        l3.printLinkedList();
    }

    public int size(LinkedList l){
        Node n = l.head;
        int counter=0;
        while(n != null){
            counter++;
            n = n.next;
        }
        return counter;
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

        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();
        list1.appendFirst(a);
        list1.appendFirst(b);
        list1.appendFirst(c);
        list2.appendFirst(d);
        list2.appendFirst(e);
        list2.appendFirst(f);
        list3.appendFirst(g);
        list3.appendFirst(h);
        list3.appendFirst(i);
        list1.printLinkedList();
        list2.printLinkedList();
        list3.printLinkedList();

        SumList s = new SumList();
        s.sumList(list1,list2);
        s.sumListrev(list1,list3);
    }
}
