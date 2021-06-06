
public class queue {

    // Data fields
    int[] elements;
    int size;
    public static final int DEFAULT_CAPACITY = 8;

    /**
     * Construct a Queue object with default capacity
     */
    queue() {
        elements = new int[DEFAULT_CAPACITY];
    }

    /**
     * Adds v into the queue
     */
    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        for (int i = 0; i <= elements.length; i++) {
            if (elements[i] == 0) {
                System.out.print("empty");

            }
        }
        elements[size++] = v;

    }

    /**
     * Removes and returs the element from the queue
     */
    public int dequeue() {
        int v = elements[0];
        int[] temp = new int[elements.length];
        System.arraycopy(elements, 1, temp, 0, size);
        elements = temp;
        if (size == 0) {
            System.out.print("empty");
        } else if (size != 0) {
            size--;
        }
        return v;

    }

    /**
     * Return true if queue is empty
     */
    public boolean empty() {
        return size == 0;
    }

    /**
     * Return size
     */
    public int getSize() {
        return size;
    }
}
