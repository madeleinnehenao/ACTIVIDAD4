/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Locales extends Inmueble {
    enum tipo{INTERNO,CALLE;}
    protected tipo tipoLocal;
    
    public Locales(int identifierInmobilario,int Aream2,String Direccion,
            tipo tipoLocal){
        super(identifierInmobilario,Aream2,Direccion);
        
        this.tipoLocal=tipoLocal;
    }
    
    public void printLocales(){
        super.printInmueble();
        System.out.println("Tipo de local = " + tipoLocal);
    }
}
