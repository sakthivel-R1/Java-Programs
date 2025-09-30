public class DCLL {
    Node head;

    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }
  // INSERT  BEGINNING
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node last = head.prev;
            newNode.next = head;
            newNode.prev = last;

            last.next = newNode;
            head.prev = newNode;

            head = newNode; 
        }
    }
    
 public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;

            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    // insert Position(1-based)
    public void insertAtPosition(int data, int pos) {
        if (pos <= 1 || head == null) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int count = 1;

        while (count < pos - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // DISPLAY FORWARD
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Forward: ");
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // DISPLAY BACKWARD
    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Backward: ");
        Node temp = head.prev;
        Node start = temp;
        do {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        } while (temp != start);
        System.out.println();
    }


  // DELETE BEGINNING
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == head) { 
            head = null;
            return;
        }
        Node tail = head.prev;
        head = head.next;
        head.prev = tail;
        tail.next = head;
    }

    // DELETE END
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == head) { 
            head = null;
            return;
        }
        Node tail = head.prev;
        Node newTail = tail.prev;

        newTail.next = head;
        head.prev = newTail;
    }

    // DELETE AT POSITION (1-based)
    public void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos <= 1) {
            deleteAtBeginning();
            return;
        }
        Node temp = head;
        int count = 1;

        while (count < pos && temp.next != head) {
            temp = temp.next;
            count++;
        }
        if (temp.next == head) {
            deleteAtEnd();
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }
}

public class  DoublyCircleLinkedList{
    public static void main(String[] args) {
        DCLL list = new DCLL();
        
        
        
        list.insertAtBeginning(10);
        
        list.insertAtEnd(20);
        list.displayForward();
        list.displayBackward();
        list.insertAtEnd(30);
        list.displayForward();
        list.displayBackward();
        list.insertAtEnd(50);
        list.displayForward();
        list.displayBackward();
        
        list.insertAtPosition(40,4);
        list.displayForward();
        list.displayBackward();
        
        list.deleteAtEnd();
        list.displayForward();
        list.displayBackward();
        
        list.deleteAtBeginning();
        list.displayForward();
        list.displayBackward();
        
        list.deleteAtPosition(2);
        list.displayForward();
        list.displayBackward();
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        