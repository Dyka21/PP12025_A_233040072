package pertemuan8;

public class Node {
  private Matakuliah data;
  private Node next;

  // Inisialisasi atribut node

  public Node(Matakuliah data) {
    this.data = data;
    this.next = null;
  }

  // Setter & Getter
  public void setData(Matakuliah data) {
    this.data = data;
  }

  public Matakuliah getData() {
    return data;
  }

  // Setter & Getter untuk Next
  public void setNext(Node next) {
    this.next = next;
  }

  public Node getNext() {
    return next;
}
}
