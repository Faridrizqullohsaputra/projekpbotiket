class TiketReguler extends Tiket {
    private String kodeReguler;

    public TiketReguler(String jenisTiket, double harga, String kodeReguler) {
        super(jenisTiket, harga);
        this.kodeReguler = kodeReguler;
    }

    @Override
    public void infoTiket() {
        super.infoTiket();
        System.out.println("Kode Reguler: " + kodeReguler);
    }
}

