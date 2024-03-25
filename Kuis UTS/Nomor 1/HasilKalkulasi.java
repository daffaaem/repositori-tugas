public class HasilKalkulasi {
    public static void main(String[] args){
        System.out.println("Nama \t\t: Daffa Ammar Mahendra");
        System.out.println("NPM \t\t: 22081010189");
        System.out.println("Mata Kuliah \t: OOP F081\n");

        System.out.println("Soal : ");
        System.out.println("Seorang penjual alat tulis menjual 10 bolpoint, 10 pensil dan 10 penghapus. \n1 biji bolpoint harganya Rp. 2000, 1 biji pensil harganya Rp. 1.000 dan 1 penghapus harganya Rp. 500. \nGunakanlah objek untuk menyelesaikan soal dibawah ini!\n");

        nomor1 ATK = new nomor1();

        System.out.println("Jawaban : ");
        ATK.setNbolpoint("Bolpoint");
        ATK.setSbolpoint(10);
        ATK.setBolpoint(2000);
        ATK.setHbolpoint(ATK.getBolpoint());

        System.out.println("Nama Alat Tulis : " + ATK.getNbolpoint());
        System.out.println("Stok Alat Tulis : " + ATK.getSbolpoint());
        System.out.println("Harga Satuan Bolpoint : " + ATK.getBolpoint());
        System.out.println("Harga Bolpoint : " + ATK.getHbolpoint());

        System.out.println();

        ATK.setNpensil("Pensil");
        ATK.setSpensil(10);
        ATK.setPensil(1000);
        ATK.setHpensil(ATK.getPensil());

        System.out.println("Nama Alat Tulis : " + ATK.getNpensil());
        System.out.println("Stok Alat Tulis : " + ATK.getSpensil());
        System.out.println("Harga Satuan Pensil : " + ATK.getPensil());
        System.out.println("Harga Pensil : " + ATK.getHpensil());

        System.out.println();

        ATK.setNpenghapus("Penghapus");
        ATK.setSpenghapus(1);
        ATK.setPenghapus(500);
        ATK.setHpenghapus(ATK.getPenghapus());

        System.out.println("Nama Alat Tulis : " + ATK.getNpenghapus());
        System.out.println("Stok Alat Tulis : " + ATK.getSpenghapus());
        System.out.println("Harga Satuan Bolpoint : " + ATK.getPenghapus());
        System.out.println("Harga Bolpoint : " + ATK.getHpenghapus());

        System.out.println();
        
        ATK.setTotal(ATK.getHbolpoint(), ATK.getHpensil(), ATK.getHpenghapus());
        System.out.println("Harga Total : " + ATK.getTotal());
        System.out.println("Terimakasih Selamat Berbelanja Kembali :)");
    }
}