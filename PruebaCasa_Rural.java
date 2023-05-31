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
public class PruebaCasa_Rural {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("CASA RURAL");
        System.out.println("");
        System.out.println("Ingrese el identificador inmobilario:");
        int Identifier=input.nextInt();
        System.out.println("Ingrese el area:");
        int area=input.nextInt();
        System.out.println("Ingrese la direccion:");
        String direccion=input.next();
        System.out.println("Ingrese el numero de habitaciones:");
        int Nhabitaciones=input.nextInt();
        System.out.println("Ingrese el numero de banos:");
        int Nbaños=input.nextInt();
        System.out.println("Ingrese el numero de pisos:");
        int Npisos=input.nextInt();
        System.out.println("Ingrese distancia a la cabecera municipal:");
        int distancia=input.nextInt();
        System.out.println("Ingrese la altitud sobre el nivel del mar:");
        int altitud=input.nextInt();
        CasaRural Prueba= new CasaRural(Identifier,area,direccion,Nhabitaciones,
        Nbaños,Npisos,distancia,altitud);
        
        Prueba.calcularPrecioVenta(CasaRural.valorArea);
        System.out.println("");
        Prueba.printCasaRural();
    }
    
}
