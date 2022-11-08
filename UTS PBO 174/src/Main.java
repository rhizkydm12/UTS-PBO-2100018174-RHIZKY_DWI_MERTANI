public class Main {
    public static void main(String[] args) throws Exception {
        Dosen dosen1 = new Dosen(1112, "Abdul Sumbul", "Ringroad, Jogja", "12 Februari 1999", "Laki-laki", 2015,
                "Informatika", 215017717);
        Dosen dosen2 = new Dosen(1115, "Budianto", "Jakal, Jogja", "22 Februari 1998", "Laki-laki", 2016,
                "Informatika", 216018118);
        Tendik tendik1 = new Tendik(1113, "Siti Mutmaenah", "Lipu, Baubau", "10 November 1992", "Perempuan", 2016);
        Tendik tendik2 = new Tendik(1114, "Santoso", "Denpasar, Bali", "13 Juli 1992", "Laki-Laki", 2016);


        System.out.println("====Data Dosen Dan Tendik Universitas X====\n\n");
        System.out.println("Data Tendik");
        tendik1.setLembur(20);
        tendik1.cetak();
        tendik1.getDetail();

        System.out.println("\n");
        tendik2.setLembur(0);
        tendik2.cetak();
        tendik2.getDetail();

        System.out.println("\n============================\n");
        System.out.println("Data Dosen");
        dosen1.setSksLebih(6);
        dosen1.cetak();
        dosen1.getDetail();

        System.out.println("\n");
        dosen2.setSksLebih(0);
        dosen2.cetak();
        dosen2.getDetail();
    }
}