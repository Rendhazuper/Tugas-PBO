/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.gatau;

import java.util.Scanner;
import java.util.Scanner;

/**
 *
 * @author GAMES
 */
public class Hewan {
    Scanner input = new Scanner (System.in);
    
    int jenis_hewan;
    int jumlah;
    
    String hewan; 
    String makanan; 
    
    
    void input () {
        System.out.print("Masukan pilihan anda : ");
        jenis_hewan =input.nextInt();
      
        switch (jenis_hewan){
            case 1: 
                System.out.println("Pilihan Anda Hewan Karnivora :");
                System.out.println("Harimau");
                System.out.println("Singa");
                System.out.println("Komodo");
                System.out.println("Elang");
                break; 
            case 2:
                System.out.println("Pilihan Anda Hewan Herbivora :");
                System.out.println("Kambing");
                System.out.println("Sapi");
                System.out.println("Domba");
                System.out.println("Jerapah");
                break; 
            case 3: 
                System.out.println("Pilihan Anda Hewan Omnivora :");
                System.out.println("Tikus");
                System.out.println("Kura Kura");
                System.out.println("Ayam");
                System.out.println("Gagak");
                break; 
        }
    }
    void ulang(){
      
        Scanner key = new Scanner (System.in);
        System.out.print("Berapa banyak makanan yang kamu beri ?  ");
        jumlah = input.nextInt();
        
        System.out.println("Kamu ingin beri makanan apa ? ");
        makanan = key.nextLine();
        
        System.out.println("---------------------------------------------------------------");
        
        for (int a=0; a<jumlah;a++){
            System.out.println(makanan);
        
        
        
        
        
       
        }
        
        
    }
    
    
    
}
