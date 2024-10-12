class TiketVIP extends Tiket {
    private String fasilitasVIP;

    public TiketVIP(String jenisTiket, double harga, String fasilitasVIP) {
        super(jenisTiket, harga);
        this.fasilitasVIP = fasilitasVIP;
    }

    @Override
    public void infoTiket() {
        super.infoTiket();
        System.out.println("Fasilitas VIP: " + fasilitasVIP);
    }
}
