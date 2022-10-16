public class TugasMain {
    public static void main(String[] args) throws Exception {
        Dosen dosen = new Dosen(30000,"2131710081","Muhammad Sumbul","Australia");
        dosen.setSKS();
        Pegawai pegawai = new Pegawai("2141762081","Dita leni Ravia","Finlandia");
        DaftarGaji daftarGaji = new DaftarGaji(10);
        daftarGaji.addPegawai(pegawai);
        daftarGaji.addPegawai(dosen);
        daftarGaji.printSemuaGaji();
    }
}

