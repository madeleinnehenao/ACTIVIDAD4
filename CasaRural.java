/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class CasaRural extends Casa {
    protected static double valorArea=1500000;
    protected int distCabecera;
    protected int altitud;
    
    public CasaRural(int identifierInmobilario,int Aream2,
            String Direccion,int Nhabitaciones,int Nbaños,int Npisos,
            int distCabecera,int altitud){
        
        super(identifierInmobilario,Aream2,Direccion,Nhabitaciones,
                Nbaños,Npisos);
        this.distCabecera=distCabecera;
        this.altitud=altitud;
    }
    
    public void printCasaRural(){
        super.printCasa();
        System.out.println("Distancia la cabecera municipal = " 
                +distCabecera +"Km.");   
        System.out.println("Altitud sobre el nivel del mar= "+altitud);
    }
}
