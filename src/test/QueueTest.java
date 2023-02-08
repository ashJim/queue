package test;

import prog.Queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QueueTest {
    @Test
    public void newQueueShouldBeEmpty() {
        Queue<Integer> queue = new Queue<>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void pushShouldAddItemToEmptyQueue() {
        Queue<Integer> queue = new Queue<>();
        queue.push(5);
        assertFalse(queue.isEmpty());
        assertEquals(5, queue.peek().intValue());
    }

    @Test
    public void pushShouldAddItemToBackOfQueue() {
        Queue<Integer> queue = new Queue<>();
        queue.push(5);
        queue.push(10);
        assertEquals(5, queue.peek().intValue());
        queue.pop();
        assertEquals(10, queue.peek().intValue());
    }

    @Test
    public void popShouldRemoveItemFromFrontOfQueue() {
        Queue<Integer> queue = new Queue<>();
        queue.push(5);
        queue.push(10);
        assertEquals(5, queue.pop().intValue());
        assertEquals(10, queue.peek().intValue());
    }
}
