/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Inmueble {
    protected int  identifierInmobilario;
    protected int Aream2;
    protected String Direccion;
    protected double precioVenta;
    
    public Inmueble(int identifierInmobilario,int Aream2,String Direccion){
        this.identifierInmobilario=identifierInmobilario;
        this.Aream2=Aream2;
        this.Direccion=Direccion;
    }
    double calcularPrecioVenta(double valorArea){
        precioVenta=Aream2*valorArea;
        return precioVenta;
    }
    public void printInmueble(){
        System.out.println("Identificador inmobilario= "+
                identifierInmobilario);
        System.out.println("Area= "+ Aream2);
        System.out.println("Direccion= "+ Direccion);
        System.out.println("Precio de venta= $"+precioVenta);
    }
    
}