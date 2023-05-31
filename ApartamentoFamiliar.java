/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class ApartamentoFamiliar extends Apartamento {
    protected static int valorArea=2000000;
    protected int valorAdministracion;
    
    public ApartamentoFamiliar(int identifierInmobilario,int Aream2,
            String Direccion,int Nhabitaciones,int Nbaños
            ,int valorAdministracion){
            super(identifierInmobilario,Aream2,Direccion,Nhabitaciones,Nbaños);
            this.valorAdministracion=valorAdministracion;
    }
    public void PrintFamiliar(){
        super.printApartamento();
        System.out.println("Valor de la administración = $" +
        valorAdministracion);
    }
}
