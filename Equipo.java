/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrera_ciclistica;

import java.util.Scanner;
import java.util.Vector;


public class Equipo {
    private String nombre;//Nombre del equipo
    private static double totalTiempo;
    private String Pais;
    Vector listaCiclistas;
    
    public Equipo(String nombre,String pais){
        this.nombre=nombre;
        this.Pais=pais;
        totalTiempo=0;
        listaCiclistas=new Vector(); 
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getPais(){
        return Pais;
    }
    public void setPais(String pais){
        this.Pais=pais;
    }
    
    //Metodo que recibe valores de tipo ciclista
    public void añadirCiclista(Ciclista ciclista){
        listaCiclistas.add(ciclista);
    }
    
    /** Método que muestra en pantalla los nombres de los ciclistas que
    conforman un equipo*/
    public void listarEquipo(){
        for(int i=0;i<listaCiclistas.size();i++){
            Ciclista c=(Ciclista)listaCiclistas.elementAt(i);
            System.out.println(c.getNombre());
        }
    }
    
    public void buscarCiclista(){
        Scanner sc=new Scanner(System.in);
        
        String nombreCiclista=sc.next();
        for(int i=0;i<listaCiclistas.size();i++){
            
            Ciclista c=(Ciclista)listaCiclistas.elementAt(i);
            
            if(c.getNombre().equals(nombreCiclista)){
                System.out.print(c.getNombre());
            }
        }
    }
    public void calcularTiempo(){
        for(int i=0;i<listaCiclistas.size();i++){
            Ciclista c=(Ciclista)listaCiclistas.elementAt(i);
            totalTiempo+=c.getTiempoAcumulado();
        }
    }
    
    public void imprimir(){
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("Pais ="  + Pais);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
    }
    
}
