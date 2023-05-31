/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class ApartaEstudio extends Apartamento {
    protected static double valorArea = 1500000;
    
    public ApartaEstudio(int identifierInmobilario,int Aream2,
            String Direccion,int Nhabitaciones,int Nbaños){
    
        super(identifierInmobilario,Aream2,Direccion,1,1);
    }
    public void imprimirApartaestudio(){
        super.printApartamento();
    }
    
}
