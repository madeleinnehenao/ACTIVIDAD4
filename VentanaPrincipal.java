package personas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements
        ActionListener {
    private ListaPersonas lista;
    private JTextArea areaTexto;
    private Container contenedor;
    private JLabel nombre,apellidos,telefono,direccion;
    private JTextField campoNombre, campoApellidos,campoTelefono
            ,campoDireccion;
    private JButton añadir,eliminar,borrarLista;
    private JScrollPane scrollLista;
    private JComboBox<String> listaNombres;
    private DefaultComboBoxModel<String> modelo;
    
    public VentanaPrincipal(){
        lista=new ListaPersonas();
        setTitle("Personas");
        setSize(270,350);
        setLocationRelativeTo(null);//se centra la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);//no cambiar tamño de la ventana
        
        inicio();
        setVisible(true);
    }
    
    private void inicio(){
        contenedor=getContentPane();
        contenedor.setLayout(null);
        
        //Etiqueta
        nombre=new JLabel();
        nombre.setText("Nombre");
        nombre.setBounds(20,20,135,23);
        //Caja de texto
        campoNombre=new JTextField();
        campoNombre.setBounds(105,20,135,23);
        //Etiqueta
        apellidos = new JLabel();
        apellidos.setText("Apellidos:");
        apellidos.setBounds(20, 50, 135, 23);
        //Etiqueta
        campoApellidos = new JTextField();
        campoApellidos.setBounds(105, 50, 135, 23);
        
        telefono = new JLabel();
        telefono.setText("Telefono:");
        telefono.setBounds(20, 80, 135, 23);
        
        campoTelefono = new JTextField();
        campoTelefono.setBounds(105, 80, 135, 23);
        
        direccion = new JLabel();
        direccion.setText("Direccion:");
        direccion.setBounds(20, 110, 135, 23);
        
        campoDireccion = new JTextField();
        campoDireccion.setBounds(105, 110, 135, 23);
        
        //Botones
        añadir=new JButton();
        añadir.setText("Añadir");
        añadir.setBounds(105,150,80,23);
        
        añadir.addActionListener(this);//Gestion de eventos
        
        eliminar= new JButton();
        eliminar.setText("Eliminar");
        eliminar.setBounds(20, 280, 80, 23);
        
        eliminar.addActionListener(this);
        
        borrarLista= new JButton();
        borrarLista.setText("Borrar Lista");
        borrarLista.setBounds(120, 280, 120, 23);
        
        borrarLista.addActionListener(this);
        
        modelo = new DefaultComboBoxModel<>();
        listaNombres=new JComboBox(modelo);
        listaNombres.setBounds(20,180,220,23);
        
        
        scrollLista=new JScrollPane();
        scrollLista.setViewportView(listaNombres);
        
        areaTexto=new JTextArea();
        scrollLista=new JScrollPane(areaTexto);
        scrollLista.setBounds(20,180,220,80);
        contenedor.add(scrollLista);
        
        // Se añade cada componente gráfico al contenedor de la ventana
        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(apellidos);
        contenedor.add(campoApellidos);
        contenedor.add(telefono);
        contenedor.add(campoTelefono);
        contenedor.add(direccion);
        contenedor.add(campoDireccion);
        contenedor.add(añadir);
        contenedor.add(eliminar);
        contenedor.add(borrarLista);
        contenedor.add(scrollLista);
    
    }
    @Override
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource()==añadir){
            añadirPersona();
        }
        if (evento.getSource()==eliminar){
            eliminarNombre(listaNombres.getSelectedIndex());
        }
        if (evento.getSource()==borrarLista){
            borrarLista();
        }
    }

    private void añadirPersona() {
        Persona p=new Persona(campoNombre.getText(),
           campoApellidos.getText(),
           campoTelefono.getText(),
           campoDireccion.getText());
        lista.AñadirPersona(p);
        String elemento=campoNombre.getText()+"-"+campoApellidos.getText()+
                "-"+campoTelefono.getText()+"-"+campoDireccion.getText();
        areaTexto.append(elemento);
        modelo.addElement(elemento);
        
        campoNombre.setText("");
        campoApellidos.setText("");
        campoTelefono.setText("");
        campoDireccion.setText("");
    }
    private void eliminarNombre(int indice){
        if(indice>=0){
            modelo.removeElementAt(indice);
            lista.EliminarLista(indice);
            areaTexto.setText("");
            for(int i=0;i<modelo.getSize();i++){
                String elemento=(String)modelo.getElementAt(i);
                areaTexto.append(elemento+"\n");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar un elemento",
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void borrarLista(){
        lista.BorrarLista();
        
        areaTexto.setText("");
    }
}
