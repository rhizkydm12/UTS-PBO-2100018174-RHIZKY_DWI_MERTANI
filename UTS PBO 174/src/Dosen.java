public class Dosen extends Karyawan {
    private String jurusan;
    private int nidn;
    private int sksLebih;

    public Dosen() {
    }
    public Dosen(int NIP, String nama, String alamat, String tanggalLahir, String jenisKelamin, int tahunMasuk,
                 String jurusan, int nidn) {
        super(NIP, nama, alamat, tanggalLahir, jenisKelamin, tahunMasuk);
        this.jurusan = jurusan;
        this.nidn = nidn;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getNidn() {
        return nidn;
    }

    public void setNidn(int nidn) {
        this.nidn = nidn;
    }

    public int getSksLebih() {
        return sksLebih;
    }

    public void setSksLebih(int sksLebih) {
        this.sksLebih = sksLebih;
    }

    public void getDetail(){
            System.out.println(" " + NIP + " bekerja di Universitas X");
    }

    public int hitungBonus(int sksLebih) {
        int bonus = 0;
        if ( sksLebih > 4) {
            for (int a = 3; a < sksLebih; a++) {
                bonus += 100000;
            }
        }else if ( sksLebih <= 4) {
                bonus = 0;
        }
        return bonus;
    }

    public void hitungGaji(int sksLebih) {
        super.hitungGaji();
        System.out.println("Bonus Kelebihan SKS     : " + hitungBonus(sksLebih));
        System.out.println("Total                   : " + (getGaji() + hitungBonus(sksLebih)) + "\n");
    }

    public void cetak() {
        super.cetak();
        System.out.println("Jurusan                 : " + getJurusan());
        System.out.println("NIDN                    : " + getNidn());
        System.out.println("SKS Lebih               : " + getSksLebih());
        hitungGaji(getSksLebih());
    }

}