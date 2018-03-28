/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author Galuh Farial R
 */
public class JamTanganAksi {
    public static void main(String[] args) {
        

        JamTangan ulun = new JamTangan();
        ulun.nama = "Jam Ulun";
        ulun.merk = "Daniel Wellington";
        ulun.ukuran = "38 mm";
        ulun.tahun = "2016";
        ulun.bahan = "leather/kulit";
        ulun.bentuk = "lingkaran";
        
        ulun.infoJamTangan();
       System.out.println();
       
        JamTangan pian = new JamTangan();
        pian.nama = "Jam Pian";
        pian.merk = "Casio";
        pian.ukuran = "48.1 x 43.7 x 13.7 mm";
        pian.tahun  = "2014";
        pian.bahan = "karet";
        pian.bentuk = "persegi panjang";
              
        pian.infoJamTangan();
        System.out.println();
        
        JamTangan inya = new JamTangan ();
        inya.nama ="Jam Inya";
        inya.merk = "Swiss Army";
        inya.ukuran = "5 cm";
        inya.tahun = "2012";
        inya.bahan = "kanvas";
        inya.bentuk = "persegi";
        
        inya.infoJamTangan();
        System.out.println();
        
       
                
    }
    
}
