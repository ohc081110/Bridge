/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge2;

/**
 *
 * @author OMAR HC
 */
public class Circulo extends Figura {
    public Circulo (Color Color){
        super(Color);
        

    }
 public void Dibujar()   {
 Color.pintar();
 }

    @Override
    public void dibujar() {
    System.out.println("Dibujando Circulo ..." );
    Color.pintar();
    }
}
