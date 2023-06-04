package personas;
import java.util.*;
public class ListaPersonas {
    public Vector listaPersonas;
    
    public ListaPersonas(){
        listaPersonas=new Vector();
    }
    public void AñadirPersona(Persona p){
        listaPersonas.add(p);
    }
    public void EliminarLista(int i){
        listaPersonas.removeElement(i);
    }
    public void BorrarLista(){
        listaPersonas.removeAllElements();
    } 
}
