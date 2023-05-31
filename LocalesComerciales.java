/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class LocalesComerciales extends Locales {
     protected static int valorArea=3000000;
     protected String CentroComercial;
     
     public LocalesComerciales(int identifierInmobilario,int Aream2,String Direccion,
            tipo tipoLocal,String CentroComercial){
     
         super(identifierInmobilario,Aream2,Direccion,tipoLocal);
         this.CentroComercial=CentroComercial;
     }
     
    public void printComercial(){
        super.printLocales();
        System.out.println("Centro comercial = " + CentroComercial);
    }
}
