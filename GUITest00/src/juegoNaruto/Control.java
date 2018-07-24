package juegoNaruto;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Control {
        //fos, (FileOutputStream)
        //oos, (ObjectOutputStream)
        //ois, (ObjectInputStream)
        //fis, (FileInputStream)
    
    public void crearArchivo(String nombreFichero){

        System.out.println("Creando...");
        try{
            
        FileOutputStream fos = new FileOutputStream(nombreFichero);
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.close();//el ".close" sirve para cerrar el flujo de información de un archivo...
         
        }catch(FileNotFoundException ex){
            String mensaje = ex.getMessage();
            JOptionPane.showMessageDialog(null, mensaje); //null no tiene un componeten padre,
                                                          //por eso va centrado con respecto a el componente de ese momento.

        }catch(IOException ex){
            String mensaje = ex.getMessage();
            JOptionPane.showMessageDialog(null, mensaje);
        }
        
    }
       
      public void escribirObjeto(String nombreFichero, ArrayList <Object> elementos){ //Object es una clase generica, no puedo mandar solo materias,
                                                                                      //sino también puedo mandar otros objetos, profesores, estudiantes... para efectos de abstraccion los llamaremos "elementos"
        System.out.println("Escribiendo...");
        try{
            FileOutputStream fos = new FileOutputStream(nombreFichero);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for(int i = 0; i < elementos.size() ; i++){ //De la lista de elementos
                Object elemento = new Object(); //Instanciamos un nuevo objeto (cualuquiera que sea)
                elemento = elementos.get(i);   //Y objetenmos los elementos que haya en ese arreglo de objetos 
                                             //¿Pero y como sabremos que elemento toma si están todos ahí?...Casting..
                oos.writeObject(elemento); //Escibir objeto "elemento" (Que podría ser materia, profesor, etc..)
                System.out.println(elemento.toString()); //Esto imprimirá el elemento que se está escribiendo a manera de texto
            }
            oos.close(); //el ".close" sirve para cerrar el flujo de información de un archivo...
            
        }catch(IOException ex){
            String mensaje = ex.getMessage();
            JOptionPane.showMessageDialog(null, mensaje);
            
        }
    
    }
        
        
      public ArrayList<Object> cargarObjetos(String nombreFichero){
        System.out.println("Cargando...");
        ArrayList<Object> elementos = new ArrayList<>();
        
        try{
            FileInputStream fis = new FileInputStream(nombreFichero);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Object aux = ois.readObject(); //Declaro una variable auxlilar de tipo Objeto, cuyo comportamiento es leer el objeto objenido del archivo cargado
            while(aux!= null){ //Mientras ese auxiliar no tenga un elemento nulo
                elementos.add(aux); //a mi arreglo de elementos, añadele la siguiente variable (que lee el objeto del archivo)
                aux = ois.readObject(); //Y sigue leyendo...
            }
            ois.close(); //Detiene el flujo de información
        
        }catch(FileNotFoundException ex){
            System.out.println("El fichero no existe, lo voy a crear.");
            crearArchivo(nombreFichero);
        }catch (EOFException e1)
        {
            //System.out.println ("Fin de fichero");
        }catch(IOException ex){
            
            String mensaje = ex.getMessage();
            JOptionPane.showMessageDialog(null, mensaje);
            
        }catch(ClassNotFoundException ex){
            String mensaje = ex.getMessage();
            JOptionPane.showMessageDialog(null, mensaje);
        }
        
        
        return elementos; //Terminado este proceso, retorname todos esos elementos...
    }
        
                
        
}










