package pbo11_10116472_latihan5;

/**
 *
 * @author Adhitya kuncoro jatti
 */
  public class Segitiga implements BangunDatar{
    int luas,keliling;
    private final int sisiAb,sisiBc,sisiCa;
    private final int alas,tinggi;
    
    public Segitiga(int ab,int bc,int ca,int alas,int tinggi){
        this.sisiAb=ab;
        this.sisiBc=bc;
        this.sisiCa=ca;
        this.alas=alas;
        this.tinggi=tinggi;
    }

    @Override
    public void hitungLuas() {
        double luas=0.5*alas*tinggi;
        System.out.println("Luas Segitigas : "+(int) luas);
        
    }

    @Override
    public void hitungKeliling() {
        int keliling =sisiAb+sisiBc+sisiCa;
        System.out.println("Keliling Segitiga : "+keliling);
    }
}
