class DLL {
    Node head;

    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert at Middle (1-based position)
    public void insertAtMiddle(int data, int position) {
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            insertAtEnd(data);
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Delete at beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    // Delete at end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null; // unlink last node
    }

    // Delete at middle
    public void deleteAtMiddle(int position) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (position == 1) {
            deleteAtBeginning();
            return;
        }
        Node temp = head;
        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    // Display
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DLL list = new DLL();

        // Insertions
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display(); // 10 20 30

        list.insertAtBeginning(5);
        list.display(); // 5 10 20 30

        list.insertAtMiddle(15, 3);
        list.display(); // 5 10 15 20 30

        // Deletions
        list.deleteAtBeginning();
        list.display(); // 10 15 20 30

        list.deleteAtEnd();
        list.display(); // 10 15 20

        list.deleteAtMiddle(2);
        list.display(); // 10 20
    }
}
