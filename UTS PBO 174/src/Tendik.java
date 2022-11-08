public class Tendik extends Karyawan {
    private int Lembur;

    public Tendik() {
    }

    public Tendik(int NIP, String nama, String alamat, String tanggalLahir, String jenisKelamin, int tahunMasuk) {
        super(NIP, nama, alamat, tanggalLahir, jenisKelamin, tahunMasuk);
    }

    public int getLembur() {
        return Lembur;
    }

    public void setLembur(int Lembur) {
        this.Lembur = Lembur;
    }

    public void getDetail(){
            System.out.println(" " + NIP + " bekerja di Universitas X");
    }

    public int hitungBonus(int Lembur) {
        int bonus = 0;

        for (int a = 0; a < Lembur; a++) {
            bonus += 50000;
        }
        return bonus;
    }

    public void hitungGaji(int Lembur) {
        super.hitungGaji();
        System.out.println("Bonus Lembur            : " + hitungBonus(Lembur));
        System.out.println("Total                   : " + (getGaji() + hitungBonus(Lembur)) + "\n");
    }

    public void cetak() {
        super.cetak();
        System.out.println("Jam Lembur              : " + getLembur());
        hitungGaji(getLembur());
    }

}