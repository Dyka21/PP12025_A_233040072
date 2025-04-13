package pertemuan6;

public class StukturList {
    private Node HEAD;

    // Tambah elemen di awal
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    // Hapus elemen berdasarkan nilai (remove mid)
    public void removeMid(int x) {
        if (HEAD != null) {
            Node delNode = HEAD;
            Node preNode = null;

            // Jika elemen pertama adalah yang dicari
            if (delNode.getdata() == x) {
                HEAD = delNode.getNext();
                dispose(delNode);
            } else {
                boolean ketemu = false;

                while (delNode != null && !ketemu) {
                    if (delNode.getdata() == x) {
                        ketemu = true;
                    } else {
                        preNode = delNode;
                        delNode = delNode.getNext();
                    }
                }

                if (ketemu && preNode != null && delNode != null) {
                    preNode.setNext(delNode.getNext());
                    dispose(delNode);
                }
            }
        }
    }

    // Buat ngehapus node
    public void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }

    // Tampilkan isi list
    public void printList() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.getdata() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
