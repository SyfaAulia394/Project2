/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2April2024;

/**
 *
 * @author AULIA SYFA
 */
import java.util.Scanner;
public class ExampleBalok {
     public static void main(String[] args) {
        int pj,lbr,tg,la;
        Scanner in = new Scanner(System.in);
        ///buat balok bl--->konstruktor 1
        System.out.println("===Balok===");
        Balok bl =  new Balok();
        System.out.print("panjang = "); pj=in.nextInt();
        bl.setpanjang(pj);
        System.out.print("lebar = ");lbr=in.nextInt();
        bl.setlebar(lbr);
        System.out.print("tiggi = ");tg=in.nextInt();
        bl.settinggi(tg);
        la=bl.hitungluasalas();
        bl.printBalok(la,bl.hitungluaspermukaan(),bl.hitungvolume());
        
        //buat balok b2
        System.out.println("===Balok 2===");
        Balok b2= new Balok(10);
        b2.setlebar(4);
        b2.settinggi(5);
        b2.printBalok();
        b2.printBalok(b2.hitungluasalas(),b2.hitungluaspermukaan(),b2.hitungvolume(b2.hitungluasalas()));
        
        //buat balok b2--->kontruktor 2
        System.out.println("===Balok 3====");
        System.out.print("panjang = ");pj=in.nextInt();
        System.out.print("lebar = ");lbr=in.nextInt();
        System.out.print("tiggi = ");tg=in.nextInt();
        Balok b3 = new Balok(pj,lbr,tg);
        la=b3.hitungluasalas();
        b3.printBalok(la,b3.hitungluaspermukaan(),b3.hitungvolume());
         
    }
    
}
