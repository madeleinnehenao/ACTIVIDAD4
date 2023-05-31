/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class CasaIndependiente extends CasaUrbana{
    protected static double valorArea = 3000000;
    
    public CasaIndependiente(int identifierInmobilario,int Aream2,
            String Direccion,int Nhabitaciones,int Nbaños,int Npisos){
        
        super(identifierInmobilario,Aream2,Direccion,Nhabitaciones,
                Nbaños,Npisos);
    }
    
    public void printIndependiente(){
        super.printCasaUrbana();
    }
    
}
