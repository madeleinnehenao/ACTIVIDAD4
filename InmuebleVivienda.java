/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class InmuebleVivienda extends Inmueble {
    protected int Nhabitaciones;
    protected int Nbaños;
    
    public InmuebleVivienda(int identifierInmobilario,int Aream2,
            String Direccion,int Nhabitaciones,int Nbaños){
        
        super(identifierInmobilario,Aream2,Direccion);
        this.Nhabitaciones=Nhabitaciones;
        this.Nbaños=Nbaños;    
    }
    
    public void printInmuebleVivienda(){
        super.printInmueble();
        System.out.println("Numero de habitaciones= "+Nhabitaciones);
        System.out.println("Numero de baños= "+Nbaños);
    }
}
