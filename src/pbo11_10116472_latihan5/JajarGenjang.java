/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11_10116472_latihan5;

/**
 *
 * @author Adhitya kuncoro jatti
 */
public class JajarGenjang implements BangunDatar{
    private int luas, keliling;
    private final int sisiAb, sisiBc, sisiCd, sisiDa; 
    private final int alas, tinggi;

    public JajarGenjang(int sisiab, int sisibc, int sisicd, int sisida, int alas, int tinggi) {
        this.sisiAb   = sisiab;
        this.sisiBc   = sisibc;
        this.sisiCd   = sisicd;
        this.sisiDa   = sisida;
        this.alas     = alas;
        this.tinggi   = tinggi;
    } 

    @Override
     public void hitungLuas(){
         System.out.println(" Luas Jajargenjang : " +(alas*tinggi));
     }
     
     public  void hitungKeliling(){
         int keliling = sisiAb+sisiBc+sisiCd+sisiDa;
         System.out.println(" Keliling Jajargenjang : " + keliling);
     }
   
   
    
}
