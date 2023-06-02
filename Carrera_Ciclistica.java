/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrera_ciclistica;

import java.util.*;


public class Carrera_Ciclistica {


    public static void main(String[] args) {
                Scanner input= new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del equipo:");
        String nombreEquipo=input.next();
        
        System.out.println("Ingrese el pais:");
        String pais=input.next();
        
        Equipo equipo1=new Equipo(nombreEquipo,pais);

        System.out.println("Ingrese el nombre del ciclista y el "
                + "identificador:");
        String nombrevelocista1=input.next();
        int identificadorV=input.nextInt();
        
        System.out.println("Potencia promedio= ");
        double Pt=input.nextDouble();
        System.out.println("Velocidad promedio=");
        double Vp=input.nextDouble();
        System.out.println("Tiempo acumulado=");
        int Vt=input.nextInt();
        
        Velocista velocista1= new Velocista(identificadorV,nombrevelocista1,
        Pt,Vp);
        System.out.println(" ");
        
        System.out.println("Ingrese el nombre del ciclista y el "
                + "identificador:");
        String nombreEscalador=input.next();
        int identificadorE=input.nextInt();
        System.out.println("Aceleracion promedio= ");
        double Ap=input.nextDouble();
        System.out.println("Grado Rampa=");
        double Gr=input.nextDouble();
        System.out.println("Tiempo acumulado=");
        int Et=input.nextInt();
        Escalador escalador1=new Escalador(identificadorE,nombreEscalador
                ,Ap,Gr);
        System.out.println(" ");
        System.out.println("Ingrese el nombre del ciclista y el" +
            "identificador:");
        String nombrerelojista=input.next();
        int identificadorR=input.nextInt();
        System.out.println("Velocidad maxima= ");
        int Vm=input.nextInt();
        System.out.println("Tiempo acumulado=");
        int Rt=input.nextInt();
        
        Contrarrelojista contrarrelojista1= new Contrarrelojista(
                identificadorR,nombrerelojista,Vm);
        
        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador1);
        equipo1.añadirCiclista(contrarrelojista1);
        velocista1.setTiempoAcumulado(Vt);
        escalador1.setTiempoAcumulado(Et);
        contrarrelojista1.setTiempoAcumulado(Rt);
        equipo1.calcularTiempo();
        equipo1.imprimir();
        equipo1.listarEquipo();
    }
    
}
