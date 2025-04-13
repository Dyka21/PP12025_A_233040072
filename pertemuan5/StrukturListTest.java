public class StrukturListTest {
    public static void main(String[] args) {
        StukturList list = new StukturList();

        System.out.println("==== Latihan 2 ====");

        list.addFirst(2);
        list.addFirst(9);
        list.addFirst(7); // List: 7 9 2
        System.out.print("Sebelum removeHead(): ");
        list.printList(); // 7 9 2

        list.removeHead();
        System.out.print("Setelah 1x removeHead(): ");
        list.printList(); // 9 2

        list.removeHead();
        list.removeHead();
        System.out.print("Setelah 3x removeHead(): ");
        list.printList(); // kosong

        System.out.println("\n==== Latihan 4 ====");

        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(2); // List: 2 6 3 5 1
        System.out.print("(Isi Awal): ");
        list.printList(); // 2 6 3 5 1

        list.removeTail();
        System.out.print("(Hapus Tail): ");
        list.printList(); // 2 6 3 5

        list.removeHead();
        System.out.print("(Hapus Head): ");
        list.printList(); // 6 3 5

        list.removeTail();
        System.out.print("(Hapus Tail lagi): ");
        list.printList(); // 6 3
    }
}
