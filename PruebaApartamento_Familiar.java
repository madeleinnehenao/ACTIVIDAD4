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
public class PruebaApartamento_Familiar {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Apartamento Familiar");
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
        ApartamentoFamiliar Prueba= new ApartamentoFamiliar(Identifier,area,
                direccion,Nhabitaciones,Nbaños,administracion);
        Prueba.calcularPrecioVenta(ApartamentoFamiliar.valorArea);
        System.out.println("");
        Prueba.PrintFamiliar();
    }
    
}
