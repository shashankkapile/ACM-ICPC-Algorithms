/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

/**
 *
 * @author ShawShank
 */
public class QueuesByLinkedList {

    Node head, tail;

    public QueuesByLinkedList() {
        head = null;
    }

    private class Node {

        String item;
        Node next;
    }

    void insertItem(String item) {

        if (head == null) { //for first node
            Node temp = new Node();
            temp.item = item;
            temp.next = null;
            head = temp;
            tail = temp;
        } else {
            Node temp = new Node();
            temp.item = item;
            temp.next = null;
            tail.next = temp;
            tail = temp;
        }
    }

    String removeItem() {

        if (isEmpty()) {
            return "List is empty";

        } else {

            String removedItem = head.item;
            head = head.next;
            return removedItem;
        }
    }
//

    boolean isEmpty() {
        return (head == null);
    }

    void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node tempHead = head;
            while (tempHead != null) {
                System.out.println(tempHead.item);
                tempHead = tempHead.next;
            }
        }

    }

    public static void main(String... a) {

        QueuesByLinkedList qBLL = new QueuesByLinkedList();
        qBLL.insertItem("One");
        qBLL.insertItem("Two");
        qBLL.insertItem("Three");
        qBLL.insertItem("Four");
        qBLL.insertItem("Five");
        System.out.println("Remove Operation: " + qBLL.removeItem());
        System.out.println("Remove Operation: " + qBLL.removeItem());

        qBLL.display();
    }
}
