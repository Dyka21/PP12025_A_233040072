package pertemuan8;

public class ListMkTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // === Latihan 4 ===
        System.out.println("=== Latihan 4 ===");
        list.addHead(new Matakuliah("IF1001", "Dasar Pemrograman", 4));
        list.addHead(new Matakuliah("IF1002", "Pemrograman Web", 3));
        list.displayElement();

        // === Tes-1 ===
        System.out.println("\n=== Tes-1 ===");
        list.addTail(new Matakuliah("IF003", "Struktur Diskrit", 3));
        list.addTail(new Matakuliah("IF002", "Pemrograman Web", 3));
        list.addMid(new Matakuliah("IF001", "Dasar Pemrograman", 4), 4);
        list.addHead(new Matakuliah("IF004", "Kontruksi PL Berorientasi Objek", 3));
        list.displayElement();

        // === Tes-4 ===
        System.out.println("\n=== Tes-4 ===");
        list.addTail(new Matakuliah("IF004", "Kontruksi PL Berorientasi Objek", 3));
        list.addTail(new Matakuliah("IF003", "Struktur Diskrit", 3));
        list.addTail(new Matakuliah("IF002", "Pemrograman Web", 3));
        list.addMid(new Matakuliah("IF001", "Dasar Pemrograman", 4), 4);
        list.displayElement();
    }
}
