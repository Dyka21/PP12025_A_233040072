public class StukturList {
    private Node HEAD;

    // Tambah node di awal list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    // REMOVE HEAD
    public void removeHead() {
        if (HEAD != null) {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    // REMOVE TAIL
    public void removeTail() {
        if (HEAD != null) {
            if (HEAD.getNext() == null) {
                HEAD = null;
            } else {
                Node preNode = null;
                Node lastNode = HEAD;

                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }

                preNode.setNext(null);
                dispose(lastNode);
            }
        }
    }

    // Method bantu hapus node
    public void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }

    // Cetak isi list
    public void printList() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.getdata() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}