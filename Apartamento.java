/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Apartamento extends InmuebleVivienda{
    
    public Apartamento(int identifierInmobilario,int Aream2,
            String Direccion,int Nhabitaciones,int Nbaños){
            
        super(identifierInmobilario,Aream2,Direccion,Nhabitaciones,Nbaños);
    }
    
    public void printApartamento(){
        super.printInmuebleVivienda();
    }
}
