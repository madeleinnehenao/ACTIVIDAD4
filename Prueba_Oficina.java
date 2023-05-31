/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inmuebles;

import java.util.Scanner;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Prueba_Oficina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Oficina");
        System.out.println("");
        System.out.println("Ingrese el identificador inmobilario:");
        int Identifier=input.nextInt();
        System.out.println("Ingrese el area:");
        int area=input.nextInt();
        System.out.println("Ingrese la direccion:");
        String direccion=input.next();
        System.out.println("Ingrese el tipo local (CALLE,INTERNO):");
        String tipoLocalString = input.next();
        Locales.tipo Type=Locales.tipo.valueOf(tipoLocalString);
        System.out.println("Perteneces al Gobierno? :");
        boolean siGobierno=input.nextBoolean();
        Oficina prueba=new Oficina(Identifier,
        area,direccion,Type,siGobierno);
        prueba.calcularPrecioVenta(LocalesComerciales.valorArea);
        System.out.println(" ");
        prueba.printOficina();
    }
    
}
