package pertemuan4.tugas;

public class tugasB {
    public static void main(String[] args) {
        StukturList list = new StukturList();

        list.addHead(2.1);
        list.addHead(3.4);
        list.addMid(1.1, 3);
        list.addTail(4.5);
        list.addTail(5.5);

        System.out.print("Deret b: ");
        list.displayElement();
    }
}

