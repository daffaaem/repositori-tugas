public class HasilPendapatan {
    public static void main(String[] args){
        System.out.println("Nama \t\t: Daffa Ammar Mahendra");
        System.out.println("NPM \t\t: 22081010189");
        System.out.println("Mata Kuliah \t: OOP F081\n");

        nomor3 Gaji = new nomor3();

        Gaji.setGolongan3a("Golongan III A");
        Gaji.setGs3a(2700000);
        Gaji.setGp3a(Gaji.getGs3a());
        Gaji.setTunjangan3a(Gaji.getGs3a());
        Gaji.setThr3a(Gaji.getGs3a());
        Gaji.setGt3a(Gaji.getGs3a());
        Gaji.setBonus3a(Gaji.getGs3a());
        Gaji.setPajak3a(Gaji.getGs3a(), Gaji.getGt3a(), Gaji.getTunjangan3a(), Gaji.getThr3a(), Gaji.getBonus3a());
        Gaji.setTp3a(Gaji.getGs3a(), Gaji.getGt3a(), Gaji.getTunjangan3a(), Gaji.getThr3a(), Gaji.getBonus3a());

        System.out.println("Gaji yang diterima dalam 1 tahun kerja : \n");
        System.out.println("Jenis Golongan \t: " + Gaji.getGolongan3a());
        System.out.println("Gaji Per-Bulan \t: " + Gaji.getGs3a());
        System.out.println("Gaji Pokok 1thn\t: " + Gaji.getGp3a());
        System.out.println("Jumlah Tunjangan: " + Gaji.getTunjangan3a());
        System.out.println("Jumlah THR \t: " + Gaji.getThr3a());
        System.out.println("Gaji ke-13 \t: " + Gaji.getGt3a());
        System.out.println("Jumlah Bonus \t: " + Gaji.getBonus3a());
        System.out.println("Pajak  \t\t: " + Gaji.getPajak3a());
        System.out.println("Gaji Total \t: " + Gaji.getTp3a());
        System.out.println("Gaji Bersih Pegawai : " + (Gaji.getTp3a() - Gaji.getPajak3a()));

        System.out.println();

        Gaji.setGolongan3b("Golongan III B");
        Gaji.setGs3b(2800000);
        Gaji.setGp3b(Gaji.getGs3b());
        Gaji.setTunjangan3b(Gaji.getGs3b());
        Gaji.setThr3b(Gaji.getGs3b());
        Gaji.setGt3b(Gaji.getGs3b());
        Gaji.setBonus3b(Gaji.getGs3b());
        Gaji.setPajak3b(Gaji.getGs3b(), Gaji.getGt3b(), Gaji.getTunjangan3b(), Gaji.getThr3b(), Gaji.getBonus3b());
        Gaji.setTp3b(Gaji.getGs3b(), Gaji.getGt3b(), Gaji.getTunjangan3b(), Gaji.getThr3b(), Gaji.getBonus3b());

        System.out.println("Jenis Golongan \t: " + Gaji.getGolongan3b());
        System.out.println("Gaji Per-Bulan \t: " + Gaji.getGs3b());
        System.out.println("Gaji Pokok 1thn\t: " + Gaji.getGp3b());
        System.out.println("Jumlah Tunjangan: " + Gaji.getTunjangan3b());
        System.out.println("Jumlah THR \t: " + Gaji.getThr3b());
        System.out.println("Gaji ke-13 \t: " + Gaji.getGt3b());
        System.out.println("Jumlah Bonus \t: " + Gaji.getBonus3b());
        System.out.println("Pajak  \t\t: " + Gaji.getPajak3b());
        System.out.println("Gaji Total \t: " + Gaji.getTp3b());
        System.out.println("Gaji Bersih Pegawai : " + (Gaji.getTp3b() - Gaji.getPajak3b()));

        System.out.println();

        Gaji.setGolongan3c("Golongan III C");
        Gaji.setGs3c(2950000);
        Gaji.setGp3c(Gaji.getGs3c());
        Gaji.setTunjangan3c(Gaji.getGs3c());
        Gaji.setThr3c(Gaji.getGs3c());
        Gaji.setGt3c(Gaji.getGs3c());
        Gaji.setBonus3c(Gaji.getGs3c());
        Gaji.setPajak3c(Gaji.getGs3c(), Gaji.getGt3c(), Gaji.getTunjangan3c(), Gaji.getThr3c(), Gaji.getBonus3c());
        Gaji.setTp3c(Gaji.getGs3c(), Gaji.getGt3c(), Gaji.getTunjangan3c(), Gaji.getThr3c(), Gaji.getBonus3c());

        System.out.println("Jenis Golongan \t: " + Gaji.getGolongan3c());
        System.out.println("Gaji Per-Bulan \t: " + Gaji.getGs3c());
        System.out.println("Gaji Pokok 1thn\t: " + Gaji.getGp3c());
        System.out.println("Jumlah Tunjangan: " + Gaji.getTunjangan3c());
        System.out.println("Jumlah THR \t: " + Gaji.getThr3c());
        System.out.println("Gaji ke-13 \t: " + Gaji.getGt3c());
        System.out.println("Jumlah Bonus \t: " + Gaji.getBonus3c());
        System.out.println("Pajak  \t\t: " + Gaji.getPajak3c());
        System.out.println("Gaji Total \t: " + Gaji.getTp3c());
        System.out.println("Gaji Bersih Pegawai : " + (Gaji.getTp3c() - Gaji.getPajak3c()));

        System.out.println();

        Gaji.setGolongan3d("Golongan III D");
        Gaji.setGs3d(3200000);
        Gaji.setGp3d(Gaji.getGs3d());
        Gaji.setTunjangan3d(Gaji.getGs3d());
        Gaji.setThr3d(Gaji.getGs3d());
        Gaji.setGt3d(Gaji.getGs3d());
        Gaji.setBonus3d(Gaji.getGs3d());
        Gaji.setPajak3d(Gaji.getGs3d(), Gaji.getGt3d(), Gaji.getTunjangan3d(), Gaji.getThr3d(), Gaji.getBonus3d());
        Gaji.setTp3d(Gaji.getGs3d(), Gaji.getGt3d(), Gaji.getTunjangan3d(), Gaji.getThr3d(), Gaji.getBonus3d());

        System.out.println("Jenis Golongan \t: " + Gaji.getGolongan3d());
        System.out.println("Gaji Per-Bulan \t: " + Gaji.getGs3d());
        System.out.println("Gaji Pokok 1thn\t: " + Gaji.getGp3d());
        System.out.println("Jumlah Tunjangan: " + Gaji.getTunjangan3d());
        System.out.println("Jumlah THR \t: " + Gaji.getThr3d());
        System.out.println("Gaji ke-13 \t: " + Gaji.getGt3d());
        System.out.println("Jumlah Bonus \t: " + Gaji.getBonus3d());
        System.out.println("Pajak  \t\t: " + Gaji.getPajak3d());
        System.out.println("Gaji Total \t: " + Gaji.getTp3d());
        System.out.println("Gaji Bersih Pegawai : " + (Gaji.getTp3d() - Gaji.getPajak3d()));

        System.out.println();

        Gaji.setGolongan4a("Golongan IV A");
        Gaji.setGs4a(3500000);
        Gaji.setGp4a(Gaji.getGs4a());
        Gaji.setTunjangan4a(Gaji.getGs4a());
        Gaji.setThr4a(Gaji.getGs4a());
        Gaji.setGt4a(Gaji.getGs4a());
        Gaji.setBonus4a(Gaji.getGs4a());
        Gaji.setPajak4a(Gaji.getGs4a(), Gaji.getGt4a(), Gaji.getTunjangan4a(), Gaji.getThr4a(), Gaji.getBonus4a());
        Gaji.setTp4a(Gaji.getGs4a(), Gaji.getGt4a(), Gaji.getTunjangan4a(), Gaji.getThr4a(), Gaji.getBonus4a());

        System.out.println("Jenis Golongan \t: " + Gaji.getGolongan4a());
        System.out.println("Gaji Per-Bulan \t: " + Gaji.getGs4a());
        System.out.println("Gaji Pokok 1thn\t: " + Gaji.getGp4a());
        System.out.println("Jumlah Tunjangan: " + Gaji.getTunjangan4a());
        System.out.println("Jumlah THR \t: " + Gaji.getThr4a());
        System.out.println("Gaji ke-13 \t: " + Gaji.getGt4a());
        System.out.println("Jumlah Bonus \t: " + Gaji.getBonus4a());
        System.out.println("Pajak  \t\t: " + Gaji.getPajak4a());
        System.out.println("Gaji Total \t: " + Gaji.getTp4a());
        System.out.println("Gaji Bersih Pegawai : " + (Gaji.getTp4a() - Gaji.getPajak4a()));

        System.out.println();

        Gaji.setGolongan4b("Golongan IV B");
        Gaji.setGs4b(4000000);
        Gaji.setGp4b(Gaji.getGs4b());
        Gaji.setTunjangan4b(Gaji.getGs4b());
        Gaji.setThr4b(Gaji.getGs4b());
        Gaji.setGt4b(Gaji.getGs4b());
        Gaji.setBonus4b(Gaji.getGs4b());
        Gaji.setPajak4b(Gaji.getGs4b(), Gaji.getGt4b(), Gaji.getTunjangan4b(), Gaji.getThr4b(), Gaji.getBonus4b());
        Gaji.setTp4b(Gaji.getGs4b(), Gaji.getGt4b(), Gaji.getTunjangan4b(), Gaji.getThr4b(), Gaji.getBonus4b());

        System.out.println("Jenis Golongan \t: " + Gaji.getGolongan4b());
        System.out.println("Gaji Per-Bulan \t: " + Gaji.getGs4b());
        System.out.println("Gaji Pokok 1thn\t: " + Gaji.getGp4b());
        System.out.println("Jumlah Tunjangan: " + Gaji.getTunjangan4b());
        System.out.println("Jumlah THR \t: " + Gaji.getThr4b());
        System.out.println("Gaji ke-13 \t: " + Gaji.getGt4b());
        System.out.println("Jumlah Bonus \t: " + Gaji.getBonus4b());
        System.out.println("Pajak  \t\t: " + Gaji.getPajak4b());
        System.out.println("Gaji Total \t: " + Gaji.getTp4b());
        System.out.println("Gaji Bersih Pegawai : " + (Gaji.getTp4b() - Gaji.getPajak4b()));

        System.out.println();

        Gaji.setGolongan4c("Golongan IV B");
        Gaji.setGs4c(5000000);
        Gaji.setGp4c(Gaji.getGs4c());
        Gaji.setTunjangan4c(Gaji.getGs4c());
        Gaji.setThr4c(Gaji.getGs4c());
        Gaji.setGt4c(Gaji.getGs4c());
        Gaji.setBonus4c(Gaji.getGs4c());
        Gaji.setPajak4c(Gaji.getGs4c(), Gaji.getGt4c(), Gaji.getTunjangan4c(), Gaji.getThr4c(), Gaji.getBonus4c());
        Gaji.setTp4c(Gaji.getGs4c(), Gaji.getGt4c(), Gaji.getTunjangan4c(), Gaji.getThr4c(), Gaji.getBonus4c());

        System.out.println("Jenis Golongan \t: " + Gaji.getGolongan4c());
        System.out.println("Gaji Per-Bulan \t: " + Gaji.getGs4c());
        System.out.println("Gaji Pokok 1thn\t: " + Gaji.getGp4c());
        System.out.println("Jumlah Tunjangan: " + Gaji.getTunjangan4c());
        System.out.println("Jumlah THR \t: " + Gaji.getThr4c());
        System.out.println("Gaji ke-13 \t: " + Gaji.getGt4c());
        System.out.println("Jumlah Bonus \t: " + Gaji.getBonus4c());
        System.out.println("Pajak  \t\t: " + Gaji.getPajak4c());
        System.out.println("Gaji Total \t: " + Gaji.getTp4c());
        System.out.println("Gaji Bersih Pegawai : " + (Gaji.getTp4c() - Gaji.getPajak4c()));

        System.out.println();

        Gaji.setGolongan4d("Golongan IV B");
        Gaji.setGs4d(6000000);
        Gaji.setGp4d(Gaji.getGs4d());
        Gaji.setTunjangan4d(Gaji.getGs4d());
        Gaji.setThr4d(Gaji.getGs4d());
        Gaji.setGt4d(Gaji.getGs4d());
        Gaji.setBonus4d(Gaji.getGs4d());
        Gaji.setPajak4d(Gaji.getGs4d(), Gaji.getGt4d(), Gaji.getTunjangan4d(), Gaji.getThr4d(), Gaji.getBonus4d());
        Gaji.setTp4d(Gaji.getGs4d(), Gaji.getGt4d(), Gaji.getTunjangan4d(), Gaji.getThr4d(), Gaji.getBonus4d());

        System.out.println("Jenis Golongan \t: " + Gaji.getGolongan4d());
        System.out.println("Gaji Per-Bulan \t: " + Gaji.getGs4d());
        System.out.println("Gaji Pokok 1thn\t: " + Gaji.getGp4d());
        System.out.println("Jumlah Tunjangan: " + Gaji.getTunjangan4d());
        System.out.println("Jumlah THR \t: " + Gaji.getThr4d());
        System.out.println("Gaji ke-13 \t: " + Gaji.getGt4d());
        System.out.println("Jumlah Bonus \t: " + Gaji.getBonus4d());
        System.out.println("Pajak  \t\t: " + Gaji.getPajak4d());
        System.out.println("Gaji Total \t: " + Gaji.getTp4d());
        System.out.println("Gaji Bersih Pegawai : " + (Gaji.getTp4d() - Gaji.getPajak4d()));
    }
}
