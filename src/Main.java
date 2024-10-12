public class Main {
    public static void main(String[] args) {
        // Membuat objek TiketReguler
        TiketReguler tiketReguler = new TiketReguler("Tiket Konser", 50000, "REG123");
        tiketReguler.infoTiket();

        // Membuat objek TiketVIP
        TiketVIP tiketVIP = new TiketVIP("Tiket Konser", 150000, "Akses Lounge");
        tiketVIP.infoTiket();

        // Membuat objek Pembeli
        Pembeli pembeli = new Pembeli("Budi", "budi@example.com");
        pembeli.infoPembeli();

        // Membuat objek PembeliMember
        PembeliMember pembeliMember = new PembeliMember("Siti", "siti@example.com", "MEM456");
        pembeliMember.infoPembeli();
    }
}

