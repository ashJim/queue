package prog;

public class Queue<T> {
    private class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        private QueueNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private QueueNode<T> front;
    private QueueNode<T> back;

    public Queue() {
        front = null;
        back = null;
    }

    public void push(T data) {
        // Queue is empty...
        if (isEmpty()) {
            front = new QueueNode(data);
            back = front;
        }
        // Queue is not empty...
        else {
            QueueNode<T> oldBack = back;
            back = new QueueNode(data);
            oldBack.next = back;
        }
    }

    public T pop() {
        QueueNode<T> oldFront = front;
        front = front.next;
        return oldFront.data;
    }

    public T peek() {
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}