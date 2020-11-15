/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latiahn41;

/**
 *
  @author Muhammad Alvin Rizqi Ramadhan
 * Kelas : IF10-K
 * NIM :10119913 
 */
public class PBO10119913Latiahn41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sisi, massa, volume;
        Kubus kb1 = new Kubus();
        kb1.setSisi(5);
        kb1.setMassa(250);
        sisi = kb1.getSisi();
        massa = kb1.getMassa();
        volume = kb1.hitungVolume(sisi);

        System.out.println("=====Massa Jenis Kubus=====");
        System.out.println("Sisi : "+ sisi);
        System.out.println("Massa : "+ massa);
        System.out.println();
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Volume : "+volume);
        System.out.println("Massa Jenis : "+kb1.hitungMassaJenis(massa,volume));
    }
}
