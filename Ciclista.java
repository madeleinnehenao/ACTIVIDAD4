/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrera_ciclistica;


public abstract class Ciclista {
    private int identificador;
    private String nombreCiclista;
    private int tiempoAcumulado=0;
    
    /*Método abstracto que muestra en pantalla el tipo específico de un
     ciclista*/
    
    public Ciclista(int identificador,String nombre){
        this.identificador=identificador;
        this.nombreCiclista=nombre;
    }
    protected abstract String imprimirTipo();
    
    protected int getIdentificador(){
        return identificador;
    }
    protected void setIdentificador(int identificador){
        this.identificador=identificador;
    }
    protected String getNombre() {
        return nombreCiclista;
    }
    protected void setNombre(String nombreCiclista){
        this.nombreCiclista=nombreCiclista;
    }
    
    /*Método que devuelve el puesto que ocupa un ciclista en la
    posición general de la competencia*/
    protected int getPosiciónGeneral(int posicionGeneral) {
        return posicionGeneral;
    }
    protected void setPosiciónGeneral(int posicionGeneral) {
        posicionGeneral = posicionGeneral;
    }
    
    protected int getTiempoAcumulado(){
        return tiempoAcumulado;
    }
    protected void setTiempoAcumulado(int tiempoAcumulado){
        this.tiempoAcumulado=tiempoAcumulado;
    }
    protected void imprimir() {
        System.out.println("Identificador = "+ identificador);
        System.out.println("Nombre = " + nombreCiclista);
        System.out.println("Tiempo Acumulado ="+
            tiempoAcumulado);
    }
    
}
