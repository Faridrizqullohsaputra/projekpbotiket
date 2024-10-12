class Tiket {
    private String jenisTiket;
    private double harga;

    public Tiket(String jenisTiket, double harga) {
        this.jenisTiket = jenisTiket;
        this.harga = harga;
    }

    public String getJenisTiket() {
        return jenisTiket;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void infoTiket() {
        System.out.println("Jenis Tiket: " + jenisTiket + ", Harga: " + harga);
    }
}
