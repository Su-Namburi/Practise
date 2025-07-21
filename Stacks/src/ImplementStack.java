public class ImplementStack {
    private int[] arr;
    private int top;
    private int capacity;

    public ImplementStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack overflow!");
            return;
        }
        arr[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        ImplementStack stack = new ImplementStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Popped element is " + stack.pop()); // Output: 3
        System.out.println("Top element is " + stack.peek());   // Output: 2
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: False
        System.out.println("Is stack full? " + stack.isFull());   // Output: False
    }
}