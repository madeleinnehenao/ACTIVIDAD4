/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Oficina extends Locales {
    protected static int valorArea=3500000;
    protected boolean Gobierno;
    
    public Oficina(int identifierInmobilario,int Aream2,String Direccion,
            tipo tipoLocal,boolean Gobierno){
        super(identifierInmobilario,Aream2,Direccion,tipoLocal);
        this.Gobierno=Gobierno;
    }
    
    public void printOficina(){
        super.printLocales();
        System.out.println("Es oficina gubernamental = " + Gobierno);
    }
    
}
