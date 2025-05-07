package pertemuan8;

public class StrukturList {
  public Node HEAD;

  public boolean isEmpty() {
    return HEAD == null;
  }

  // ADD TAIL
  public void addTail(Matakuliah data) {
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

  // display
  public void displayElement() {
    if (isEmpty()) {
      System.out.println("List Kosong");
    } else {
      Node curNode = HEAD;
      while (curNode != null) {
        System.out.println(
            "Matakuliah :" + curNode.getData().getKode() + " " + curNode.getData().getNama() + ","
                + curNode.getData().getSks());
        curNode = curNode.getNext();
      }
    }
  }

  // ADD HEAD
  public void addHead(Matakuliah data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
      HEAD = newNode;
    } else {
      newNode.setNext(HEAD);
      HEAD = newNode;
    }
  }

  // ADD MID
  public void addMid(Matakuliah data, int position) {
    Node posNode = null, curNode = null;
    Node newNode = new Node(data);
    if ( position <= 1 || HEAD == null) {
      HEAD = newNode;
      return;
    } else {
      curNode = HEAD;
      if (position == 1) {
        newNode.setNext(HEAD);
        HEAD = newNode;

      } else {
        int i = 1;
        while (curNode != null && i < position) {
          posNode = curNode;
          curNode = curNode.getNext();
          i++;
        }
      }
      posNode.setNext(newNode);
      newNode.setNext(curNode);
    }
}

}