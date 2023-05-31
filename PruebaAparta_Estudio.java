/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inmuebles;
import java.util.Scanner;



public class PruebaAparta_Estudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Casa en conjunto cerrado");
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
        ApartaEstudio prueba=new ApartaEstudio(Identifier,area,direccion
        ,Nhabitaciones,Nbaños);
        prueba.calcularPrecioVenta(ApartaEstudio.valorArea);
        System.out.println("");
        prueba.imprimirApartaestudio();
    }
    
}
