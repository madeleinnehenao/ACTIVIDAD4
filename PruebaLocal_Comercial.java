/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inmuebles;

import inmuebles.Locales.tipo;

import java.util.*;
/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class PruebaLocal_Comercial {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Local comercial");
        System.out.println("");
        System.out.println("Ingrese el identificador inmobilario:");
        int Identifier=input.nextInt();
        System.out.println("Ingrese el area:");
        int area=input.nextInt();
        System.out.println("Ingrese la direccion:");
        String direccion=input.next();
        System.out.println("Ingrese el tipo local:");
        String tipoLocalString = input.next();
        tipo Type=tipo.valueOf(tipoLocalString);
        System.out.println("Ingrese el nombre del centro comercial:");
        String Ccomercial=input.next();
        LocalesComerciales prueba=new LocalesComerciales(Identifier,
        area,direccion,Type,Ccomercial);
        prueba.calcularPrecioVenta(LocalesComerciales.valorArea);
        System.out.println(" ");
        prueba.printComercial();
        
 
    }
    
}
