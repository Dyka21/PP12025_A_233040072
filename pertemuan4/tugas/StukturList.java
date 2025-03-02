package pertemuan4.tugas;

public class StukturList {
    public class Node {
        private double data;
        private Node next;

        public Node(double data) {
            this.data = data;
            this.next = null;
        }

        public void setNilai(double data) {
            this.data = data;
        }

        public double getData() {
            return data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }
    }

    public Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addTail(double data) {
        Node posNode = null, curNode = null;
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public void addMid(double data, int position) {
        Node newNode = new Node(data);
        if (position <= 1 || HEAD == null) { // Jika posisi di awal atau list kosong
            newNode.setNext(HEAD);
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            int i = 1;
            while (curNode.getNext() != null && i < position - 1) {
                curNode = curNode.getNext();
                i++;
            }
            newNode.setNext(curNode.getNext());
            curNode.setNext(newNode);
        }
    }

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }

    public void addHead(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
}