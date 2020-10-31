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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



/**
 *
 * @author Alexara
 */
public class main extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    
        @Override
        public void start(Stage stage) throws Exception {
        HBox h=new HBox(10);
        TextField buscar=new TextField();
        Label lb=new Label();
        
        ArrayList<Contacto> lista_contactos=AccesoBD.leerContactos();
        
        //Que me aparezca sin necesidad de darle al boton, es decir, nada mas abrirlo
        String imprimir="";
                
                for(Contacto x : lista_contactos){
                    imprimir+=x.toString();
                }
                lb.setText(imprimir);
        
        
        
        //Le pongo el listener del texto para que escuche
        
        buscar.textProperty().addListener((observable, oldvalue, newValue) -> {
            String s="";
            for(Contacto x : lista_contactos){
                if(x.getNombre().toLowerCase().contains(newValue.toLowerCase()) || x.getApellido().toLowerCase().contains(newValue.toLowerCase()) || x.getColor().toLowerCase().contains(newValue.toLowerCase())){
                    s+=x.toString()+"\n";
                }
            }
            lb.setText(s);
        });
        
        Scene escena=new Scene(h,300,300);
        h.getChildren().addAll(buscar,lb);
        stage.setScene(escena);
        stage.show();
    }
}