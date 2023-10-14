/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class percabangan {
    public static void main(String[] args){
        System.out.println("Silahkan anda memilih toping dibawah: ");
        System.out.println("Kacang\nOreo Crumble\nSpringkel");
        
        int pilihan = 3;
        
        switch (pilihan){
            case 1:
                System.out.println("\n Anda memilih toping Kacang");
                break;
            case 2:
                System.out.println("\n Anda memilih toping Oreo Crumble");
                break;
            case 3:
                System.out.println("\n Anda memilih toping Springkel");
                break;
                
            default:
                System.out.println("Toping tidak tersedia");
                
        }
        
    }
    
}
