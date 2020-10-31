/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadorcontactos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexara
 */
public class AccesoBD {

    public static ArrayList<Contacto>  leerContactos() {
        ArrayList<Contacto> lista=new ArrayList<>();
        String ruta="G:\\ClasesOnline\\Netbeans\\Google\\saragoogle\\sara.txt";
        String linea="";
        try {
            FileReader fr=new FileReader(ruta);
            BufferedReader br=new BufferedReader(fr);
            while((linea=br.readLine()) != null){
                String[] valores = linea.split(",");
                Contacto c=new Contacto(valores[0],valores[1],valores[2]);
                lista.add(c);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    
}
