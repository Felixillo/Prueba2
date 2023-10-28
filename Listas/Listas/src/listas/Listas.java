package listas;
import java.util.ArrayList;

public class Listas {
    
    public static void main(String[] args) {
        //Creación de la lista
        ArrayList paises = new ArrayList();
        Listas obj= new Listas();
        paises.add("Costa Rica");
        paises.add("Nicaragua");
        paises.add("El Salvador");
        paises.add("Guatemala");
        
        //Tamaño de la lista   
        System.out.println ("Tamaño de la lista: " + paises.size());
        
        //Impresión de la lista         
        System.out.println ("Impresión de la lista.");
        for(int i=0; i<paises.size(); i++)
            System.out.println (paises.get(i));
        
        //Agregar dato a la lista en la posición 2   
        paises.add(2, "Guatemala");
        
        //Otra impresión de la lista 
        System.out.println("Nueva impresión");      
        for(int i=0; i<paises.size(); i++)
            System.out.println (paises.get(i));
        
        //Eliminar el dato que está en la posición 0
        paises.remove(0);
        
       //Busca si en la lista se encuentra el pasatiempo "Correr"
        if(paises.contains("Nicaragua"))
            System.out.println("Sí está");
        else
            System.out.println("No está");
        
        //Elimina los datos de la lista
        paises.clear();                 
    }    
}
