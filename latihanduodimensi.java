/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanduodimensi;

import java.util.Scanner;

/**
 *
 * @author alfinauzikri
 */
public class LatihanDuoDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner kbd = new Scanner(System.in);
        
       System.out.println("Selamat datang!!");       
       System.out.println("Di aplikasi penyimpan kontak");   
       System.out.println(" "); 
       System.out.println("Berapa kontak yang Anda ingin simpan?");
       System.out.print("Jawab : ");
      int y = kbd.nextInt();
              kbd.nextLine();
        String[][] datasku = new String[y][2];    
        
       
        for(int x=0;x<datasku.length;x++){
            System.out.println("Data Kontak "+(x+1));
            System.out.print("Nama : ");
            datasku[x][0] = kbd.nextLine();
            System.out.print("Nomor : ");
            datasku[x][1] = kbd.nextLine();
        }
        
        System.out.println("========================");
        System.out.println("Sistem berhasil menyimpan data :)");
        System.out.println("========================");
        
        for(int x=0;x<datasku.length;x++){
            System.out.println("Data Kontak "+(x+1));
            System.out.println("Nama : "+datasku[x][0]);
            System.out.println("Nomor : "+datasku[x][1]);
            System.out.println("========================");
        }
        

    }
    
}
