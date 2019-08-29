/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_percabangan;

import java.util.Scanner;

/**
 *
 * @author Yeremia Rizky
 */
public class PembayaranTagihanListrik {
    public static void main(String[] args) {
            
            //deklarasi
            int kWh;
            int biaya;
            int biayatotal;
        
            
            //scanner
            Scanner pembaca = new Scanner(System.in);
            
            //input kWh~Program Pembayaran T
            System.out.println("=>Program Pembayaran Tagihan Listrik<=");
            System.out.print("Input jumlah kWh/bulan: ");
            kWh = pembaca.nextInt();
            
            //penggolongan
            System.out.println("\n~Penggolongan~");
            if(kWh <= 450) {
                System.out.println("Anda masuk golongan C (Pelajar)");
                biaya = 20000 + (1000 * kWh);
                System.out.println("Biaya " + "Rp." + biaya);
                
                biayatotal=(biaya + (biaya * 15/100));
                System.out.println("Total biaya yang harus anda bayar (ditambah pajak): " + "Rp." + biayatotal);
                
               
            //proses
            } else if(kWh <=900) { 
                System.out.println("Anda masuk golongan B (Normal)");
                biaya = 35000 + (2500 * kWh);
                System.out.println("Biaya " + "Rp." + biaya);
                
            } else if(kWh <1200) {
                System.out.println("Selamat anda masuk golongan A (kelas atas)");
                biaya = 50000 + (3000 * kWh);
                System.out.println("Biaya " + "Rp." + biaya);
                
            } else
                System.out.println("Mohom maaf jumlah kWh yang anda cari tidak ada, silahkan coba lagi...");
            
      
            
    
  }
}
