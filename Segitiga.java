/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacee;

/**
 *
 * @author user
 */
public class Segitiga extends BangunDatar {
    
    //atribut
    public int alas;
    public int tinggi;
    
    //methods
    
    @Override
    public double hitungLuas(){
        return this.alas * this.tinggi / 2.0;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("Lingkaran");
        System.out.println("--------");
        System.out.println("Luasnya : " + this.hitungLuas());
    }
}
