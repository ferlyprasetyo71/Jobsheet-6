public class DaftarGaji {
    public Pegawai orangPegawai[];
    public int Pegawaijumlah;
    
    DaftarGaji(int jumlah){
        orangPegawai = new Pegawai[jumlah];
    }

    public void addPegawai(Pegawai pgw){
        orangPegawai[Pegawaijumlah] = pgw;
        Pegawaijumlah++;
    }

    public void printSemuaGaji(){
        for(int i = 0;i < Pegawaijumlah; i++){
            System.out.println("Nama\t\t : "+orangPegawai[i].getNama());
            System.out.println("NIP\t\t : "+orangPegawai[i].nip);
            System.out.println("Alamat\t\t : "+orangPegawai[i].alamat);
            System.out.println("Total Gaji\t: "+orangPegawai[i].getGaji());
        }
    }
}
