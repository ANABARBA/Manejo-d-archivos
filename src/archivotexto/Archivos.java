/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivotexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author PATITO
 */
public class Archivos {
    
    public void Grabar(String cadena){
        try{
        FileWriter archivo = new FileWriter("datos.txt", true);
       try(BufferedWriter almacen = new BufferedWriter(archivo)){
           almacen.write(cadena + "\n");
           almacen.close();
       }
       
       archivo.close();
        }catch(Exception ex){}
    }
     
    public ArrayList<String> Leer(){
        ArrayList<String> datos = new ArrayList<>();
        try{
            FileReader archivo = new FileReader("datos.txt");
            BufferedReader lectura = new BufferedReader(archivo);
            String cadena;
            
            while ((cadena = lectura.readLine())!= null){
                datos.add(cadena);
                
            }
        }catch(Exception ex){}
        return datos;
    }
    
}
