class PembeliMember extends Pembeli {
    private String memberID;

    public PembeliMember(String nama, String email, String memberID) {
        super(nama, email);
        this.memberID = memberID;
    }

    @Override
    public void infoPembeli() {
        super.infoPembeli();
        System.out.println("Member ID: " + memberID);
    }
}
