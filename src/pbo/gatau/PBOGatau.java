/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.gatau;

/**
 *
 * @author GAMES
 */
public class PBOGatau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Pilih jenis hewan berdasarkan jenis makanannya :");
        System.out.println("1.Karnivora 2.Herbivora 3.Omnivora");
        
        
        Hewan hewan = new Hewan();
        hewan.input();
        hewan.ulang();
        
        
        
    }
    
}
