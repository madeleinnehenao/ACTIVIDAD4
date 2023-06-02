/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrera_ciclistica;


public class Velocista extends Ciclista{
    private double potenciaPromedio;
    private double velocidadPromedio;
    
    public Velocista(int identificador,String nombre,
            double potenciaPromedio,double velocidadPromedio){
        super(identificador,nombre);
        this.potenciaPromedio=potenciaPromedio;
        this.velocidadPromedio=velocidadPromedio;
    }
    
    protected double getPotenciaPromedio(){
        return potenciaPromedio;
    }
    protected void setPotenciaaPromedio(double potenciaPromedio){
        this.potenciaPromedio=potenciaPromedio;
    }
    protected double velocidadPromedio(){
        return velocidadPromedio;
    }
    protected void setvelocidadPromedio(double velocidadPromedio){
        this.velocidadPromedio=velocidadPromedio;
    }
    protected void imprimirVelocista(){
        super.imprimir();
        System.out.println("Potencia promedio = " + potenciaPromedio);
        System.out.println("Velocidad promedio = " +velocidadPromedio);
    }
    protected String imprimirTipo(){
        return "Es un velocista";
    }
    
}
