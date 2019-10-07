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
        //Method to print the Linked list.
        public static void PrintList(LinkedList list) {
            Node currNode = list.head;
            System.out.print("Linked List: ");
            //Traverse through a linked list.
            while (currNode != null) {
                System.out.print(currNode.data + " ");
                //go to the next node.
                currNode = currNode.next;
            }
        }

        public static void main(String[] args) {
            LinkedList linkedList = new LinkedList();
            //insert the values in the list.
            linkedList = insert(linkedList, 1);
            linkedList = insert(linkedList, 2);
            linkedList = insert(linkedList, 3);
            linkedList = insert(linkedList, 4);
            linkedList = insert(linkedList, 5);
            linkedList = insert(linkedList, 6);
            linkedList = insert(linkedList, 7);
            linkedList = insert(linkedList, 8);
            linkedList = insert(linkedList, 9);
            linkedList = insert(linkedList, 10);
            //call the print() method to print the list.
            PrintList(linkedList);
        }
    }
}
