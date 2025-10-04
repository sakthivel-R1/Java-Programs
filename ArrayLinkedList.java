class  ArrayLinkedList1{
    int top = -1;
    int[] stack = new int[5];

    public void push(int val) {
        if (top == 4) {
            System.out.println("Stack is Full");
        } else {
            top++;
            stack[top] = val;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Popped: " + stack[top]);
            top--;
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Peek: " + stack[top]);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
        System.out.println();
            
        }
    }
}

public class ArrayLinkedList {
    public static void main(String[] args) {
        ArrayLinkedList1 obj = new ArrayLinkedList1();

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.display();

        obj.pop();
        obj.display();

        obj.peek();
        obj.display();
    }
}


