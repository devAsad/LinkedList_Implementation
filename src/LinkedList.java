import org.w3c.dom.Node;

import java.util.Scanner;
import java.io.*;
public class LinkedList {
    Node head;//head of linked list.
    static class Node{
        int data;
        Node next;
        //Constructor.
        Node(int d) {
            data = d;
            next = null;
        }

        //Method to insert a new node.
        public static LinkedList insert(LinkedList list, int data) {
            Node new_node = new Node(data);
            new_node.next = null;
            if (list.head == null) {
                list.head = new_node;
            } else {
                Node last = list.head;
                while (last.next != null) {
                    last = last.next;
                }
                //insert new node at the last node.
                last.next = new_node;
            }
            //return list.
            return list;
        }
    }

    public static void main(String[] args) {

    }
}
