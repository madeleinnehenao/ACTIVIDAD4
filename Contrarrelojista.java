/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrera_ciclistica;


public class Contrarrelojista extends Ciclista {
    private int velocidadMaxima;
    
    public Contrarrelojista(int identificador,String nombre,
            int velocidadMaxima){
        super(identificador,nombre);
        this.velocidadMaxima=velocidadMaxima;
    }
    protected double getVelocidadMaxima(){
        return velocidadMaxima;
    }
    protected void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }
    protected void imprimirContrareloj() {
            super.imprimir(); // Invoca el método imprimir de la clase padre
            System.out.println("Aceleración promedio = " +
                velocidadMaxima);
    }
    protected String imprimirTipo(){
        return "Es un Contrarrelojista";
    }
}
