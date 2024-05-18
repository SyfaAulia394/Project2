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

public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;
    
    public Balok(){
    }
    public Balok(int panjang){
        this.panjang=panjang;
    }
    public  Balok(int panjang,int lebar,int tinggi){
        this.panjang=panjang;
        this.lebar=lebar;
        this.tinggi=tinggi;
    }
    public int getpanjang(){
        return panjang;
    }
    public int getlebar(){
        return lebar;
    }
    public int gettinggi(){
        return tinggi;
    }
    public void setpanjang(int panjang){
        this.panjang=panjang;
    }
    public void setlebar(int lebar){
        this.lebar=lebar;
    }
    public void settinggi(int tinggi){
        this.tinggi=tinggi;
    }
    public int hitungluasalas(){
        return panjang*lebar;
    }
    public int hitungluaspermukaan(){
        int lp;
        lp=(2*panjang*lebar)+(2*panjang*tinggi)+(2*lebar*tinggi);
        return lp;
    }
    public int hitungvolume(){
        return panjang*lebar*tinggi;
    }
    public int hitungvolume(int la){
        return la*tinggi;
    }
    public void printBalok(){
        System.out.println("panjang =" + panjang);
        System.out.println("lebar =" + lebar);
        System.out.println("tinggi =" + tinggi);
    }
    public void printBalok(int la,int lp,int vol){
        System.out.println("luas alas =" + la);
        System.out.println("luas permukaan =" + lp);
        System.out.println("volume =" + vol);
    }
   
   
}
