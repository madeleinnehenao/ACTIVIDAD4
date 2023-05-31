/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Casa extends InmuebleVivienda {
    protected int Npisos;
    
    public Casa(int identifierInmobilario,int Aream2,
            String Direccion,int Nhabitaciones,int Nbaños,int Npisos){
        super(identifierInmobilario,Aream2,Direccion,Nhabitaciones,Nbaños);
        this.Npisos=Npisos;
    }
    public void printCasa(){
        super.printInmuebleVivienda();
        System.out.println("El numero de pisos es= "+ Npisos);
    }
    
}
