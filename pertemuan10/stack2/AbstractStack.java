package pertemuan10.stack2;

public class AbstractStack {
    protected int[] array; // Ubah dari private ke protected
    protected int capacity;
    protected int TOP;
    public final int MIN = -1;

    public AbstractStack(int capacity) {
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
            System.out.println(data + " masuk ke stack");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak bisa pop.");
            return MIN;
        } else {
            int data = array[TOP];
            TOP--;
            System.out.println("pop " + data);
            return data;
        }
    }

    public int size() {
        return TOP + 1;
    }

    public int top() {
        if (!isEmpty()) {
            return array[TOP];
        } else {
            return MIN;
        }
    }

    public boolean isEmpty() {
        return (TOP == MIN);
    }

    public boolean isFull() {
        return (TOP == capacity - 1);
    }

    public void printStack() {
        System.out.print("Elemen from TOP: ");
        for (int i = TOP; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
