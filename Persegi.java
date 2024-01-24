/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacee;

/**
 *
 * @author user
 */
public class Persegi extends BangunDatar implements Keliling{
    
   public int sisi;

 
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
    @Override
    public void tampilHasil(){
        System.out.println("Persegi");
        System.out.println("--------");
        System.out.println("Luasnya : " + this.hitungLuas());
        System.out.println("Kelilingnya : " + this.hitungKeliling());
    }
    
}



