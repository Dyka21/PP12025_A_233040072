package pertemuan8;
public class Matakuliah {
    private String kode;
    private String nama;
    private int sks;

    public Matakuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    // Getter (opsional, kalau mau akses per atribut)
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    // Method untuk menampilkan data (dipakai di list)
    public void tampil() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", SKS: " + sks);
    }
    
}