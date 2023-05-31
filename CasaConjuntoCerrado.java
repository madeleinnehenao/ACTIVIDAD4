/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class CasaConjuntoCerrado extends CasaUrbana {
    protected static double valorArea=2500000;
    protected int valorAdministracion;
    protected boolean piscina;
    protected boolean camposDeportivos;
    
    public CasaConjuntoCerrado(int identifierInmobilario,int Aream2,
            String Direccion,int Nhabitaciones,int Nbaños,int Npisos,
            int valorAdministracion,boolean piscina,boolean camposDeportivos){
        super(identifierInmobilario,Aream2,Direccion,Nhabitaciones,
                Nbaños,Npisos);
        this.valorAdministracion=valorAdministracion;
        this.piscina=piscina;
        this.camposDeportivos=camposDeportivos;
    }
    public void printConjuntoCerrado(){
        super.printCasaUrbana();
        System.out.println("Valor de la administracion = " 
                + valorAdministracion);
        System.out.println("Tiene piscina? = "+ piscina);
        System.out.println("Tiene campos deportivos? = "+camposDeportivos);
    }
    
}
