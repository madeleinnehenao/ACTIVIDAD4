/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inmuebles;
import java.util.*;
/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class PruebaCasa_Conjunto_Cerrado {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Casa Conjunto Cerrado");
        System.out.println("");
        System.out.println("Ingrese el identificador inmobilario:");
        int Identifier=input.nextInt();
        System.out.println("Ingrese el area:");
        int area=input.nextInt();
        System.out.println("Ingrese la direccion:");
        String direccion=input.next();
        System.out.println("Ingrese el numero de habitaciones:");
        int Nhabitaciones=input.nextInt();
        System.out.println("Ingrese el numero de baños:");
        int Nbaños=input.nextInt();
        System.out.println("Ingrese el valor de la administracion:");
        int administracion=input.nextInt();
        System.out.println("Ingrese el numero de pisos:");
        int Npisos=input.nextInt();
        System.out.println("El conjunto tiene piscina? :");
        boolean piscina=input.nextBoolean();
        System.out.println("El conjunto tiene campos deportivos? :");
        boolean deportivos=input.nextBoolean();
        CasaConjuntoCerrado Prueba= new CasaConjuntoCerrado(Identifier,area,
                direccion,Nhabitaciones,Nbaños,Npisos,
                administracion,piscina,deportivos);
        Prueba.calcularPrecioVenta(CasaConjuntoCerrado.valorArea);
        System.out.println("");
        Prueba.printConjuntoCerrado();
    }
    
}
