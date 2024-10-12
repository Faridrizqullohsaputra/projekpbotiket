class Pembeli {
    private String nama;
    private String email;

    public Pembeli(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void infoPembeli() {
        System.out.println("Nama Pembeli: " + nama + ", Email: " + email);
    }
}
