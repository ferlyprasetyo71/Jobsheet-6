public class Dosen extends Pegawai{
    public int sks;
    public int sksTarif;

    public int getGaji(){
        int gajiTotal = sks * sksTarif;
        System.out.println("Jumlah Gaji Dosen Diterima Rp. "+gajiTotal);
        return gajiTotal;
    }

    public Dosen(int sksTarif,String nip,String nama, String alamat){
        super(nip,nama,alamat);
        this.sksTarif = sksTarif;
    }

    public void setSKS(){
        sks = 20;
    }

}
