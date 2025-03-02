package pertemuan4.latihan;

public class StukturList {
    public Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addTail(int data) 
{
    Node posNode = null, curNode = null;

    Node newNode = new Node(data);
    if (isEmpty())
    {
        HEAD = newNode;
    }
    else
    {
        curNode = HEAD;
        while (curNode != null)
        {
            posNode = curNode;
            curNode = curNode.getNext();
        }
        posNode.setNext(newNode);
    }
}


public void addMid(int data, int position) {
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


public void displayElement(){
    Node curNode = HEAD;
    while ((curNode != null)) {
        System.out.println(curNode.getdata()+ " ");
        curNode = curNode.getNext();
        
    }

}
public void addHead(int data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
        HEAD = newNode;
    }
    else {
        newNode.setNext(HEAD);
        HEAD = newNode;
    }
}
}
