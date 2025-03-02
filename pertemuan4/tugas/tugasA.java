package pertemuan4.tugas;

public class tugasA {
    public static void main(String[] args) {
        StukturList list = new StukturList();

        list.addTail(2.1);
        list.addTail(3.4);
        list.addTail(4.5);

        System.out.print("Deret a: ");
        list.displayElement();
    }
}

