public class Karyawan {
    protected String nama,alamat,tanggalLahir,jenisKelamin;
    protected int NIP,tahunMasuk;
    protected int gaji = 2000000;

    public Karyawan() {
    }

    public Karyawan(int NIP, String nama, String alamat, String tanggalLahir, String jenisKelamin, int tahunMasuk) {
        this.NIP = NIP;
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.tahunMasuk = tahunMasuk;
    }

    public void getDetail(){
    }

    protected int getNIP() {
        return NIP;
    }

    protected void setNIP(int NIP) {
        this.NIP = NIP;
    }

    protected String getNama() {
        return nama;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected String getAlamat() {
        return alamat;
    }

    protected void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    protected String getTanggalLahir() {
        return tanggalLahir;
    }

    protected void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    protected String getJenisKelamin() {
        return jenisKelamin;
    }

    protected void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    protected int getTahunMasuk() {
        return tahunMasuk;
    }

    protected void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    protected int getGaji() {
        return gaji;
    }

    protected void setGaji(int gaji) {
        this.gaji = gaji;
    }

    protected void hitungGaji() {
        System.out.println("Gaji                    : " + getGaji());
    }

    public int hitungBonus() {
        int bonus = 0;
        return bonus;
    }

    protected void cetak() {
        System.out.println("NIP                     : " + getNIP());
        System.out.println("Nama                    : " + getNama());
        System.out.println("Alamat                  : " + getAlamat());
        System.out.println("Tanggal Lahir           : " + getTanggalLahir());
        System.out.println("Jenis Kelamin           : " + getJenisKelamin());
        System.out.println("Tahun masuk             : " + getTahunMasuk());
    }
}