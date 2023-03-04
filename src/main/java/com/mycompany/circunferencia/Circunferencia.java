/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circunferencia;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {
      int x;
      Scanner entrada = new Scanner(System.in);
      x = entrada.nextInt();
      float area = (float)(Math.PI * Math.pow(x,2));
      float longitud = (float)(2 * x * Math.PI); 
      System.out.println("el area es: " + area);
      System.out.println("la longitud de la circunferencia es: " + longitud);
    }
}
