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
public class QueuesByArray {

    String itemArray[];
    int head = -1, tail = -1;

    public QueuesByArray() {
        itemArray = new String[99];
    }

    void insertItem(String item) {
        if (head == -1 && tail == -1) {
            head++;
            tail++;
            itemArray[head] = item;
        } else {
            tail++;
            itemArray[tail] = item;
            System.out.println("HEad: " + head);
            System.out.println("tail: " + tail);

        }
    }

    String removeItem() {
        if (isEmpty()) {
            head = -1;
            tail = -1;
            return "No Items in Queue";
        } else {
            String removedItem = itemArray[head++];
            System.out.println("Head: " + head);
            return removedItem;
        }
    }

    boolean isEmpty() {
        return (head > tail);
    }

    void display() {
        for (int i = head; i <= tail; i++) {
            System.out.println(itemArray[i]);
        }
    }

    public static void main(String... a) {

        QueuesByArray qBA = new QueuesByArray();
        qBA.insertItem("One");
        qBA.insertItem("Two");
//        qBA.insertItem("Three");
//        qBA.insertItem("Four");
//        qBA.insertItem("Five");

        System.out.println("Remove Operation: " + qBA.removeItem());
        System.out.println("Remove Operation: " + qBA.removeItem());

                qBA.insertItem("Three");

        
        qBA.display();
    }
}
