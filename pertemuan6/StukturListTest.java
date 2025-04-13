package pertemuan6;

public class StukturListTest {
    public static void main(String[] args) {
        StukturList list = new StukturList();

        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(2); // List: 2 6 3 5 1

        System.out.print("Sebelum removeMid(): ");
        list.printList(); // 2 6 3 5 1

        list.removeMid(3);
        System.out.print("Setelah removeMid(3): ");
        list.printList(); // 2 6 5 1

        list.removeMid(6);
        list.removeMid(5);
        System.out.print("Setelah removeMid(6) & (5): ");
        list.printList(); // 2 1
    }
}
