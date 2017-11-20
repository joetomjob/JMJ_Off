package datastructures;

import javax.annotation.processing.SupportedSourceVersion;

/**
 * Created by jtomjob on 11/15/2017.
 */
class Node {
    int val;
    Node next;

    Node(int a) {
        val = a;
    }
}

public class testLinkedList {
    Node head;
    Node tail;
    int size;

    public void addElement(int a) {
        Node x = new Node(a);
        if (head == null) {
            head = x;
            tail = x;
            size++;
        } else {
            tail.next = x;
            tail = x;
            size++;
        }
    }

    public void deleteelement(int a) {
        Node x = head;
        if (x.val == a) {
            head = x.next;
            size--;
        } else {
            Node prev = head;
            while (x != null) {
                if (x.val == a) {
                    prev.next = x.next;
                    size--;
                    break;
                }
                prev = x;
                x = x.next;
            }
        }
    }

    public void deleteelementPos(int a) {
        Node x = head;
        Node prev = head;
        int count = 1;
        if (a <= size) {
            while (count < a) {
                prev = x;
                x = x.next;
                count++;
            }
            prev.next = x.next;
            size--;
        }
    }

    public void printelement() {
        Node x = head;
        while (x != null) {
            System.out.println(x.val);
            x = x.next;
        }
    }

    public int getSize(){
        return getsizeRecursive(head);
    }

    public int getsizeRecursive(Node temp){
        if(temp == null){
            return 0;
        }
        else{
            return 1+getsizeRecursive(temp.next);
        }
    }

    public static void main(String[] args) {
        testLinkedList t = new testLinkedList();
        t.addElement(1);
        t.addElement(2);
        t.addElement(3);
        t.addElement(4);
        t.addElement(5);
        t.addElement(6);
        t.addElement(7);
        t.printelement();
        System.out.println("The size is : " + t.size);
        t.deleteelement(3);
        t.printelement();
        System.out.println("The size is : " + t.size);
        t.deleteelementPos(4);
        t.printelement();
        System.out.println("The size is : " + t.size);
        System.out.println("The size is (recursive): " + t.getSize());
    }
}
