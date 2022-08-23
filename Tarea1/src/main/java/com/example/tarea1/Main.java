package com.example.tarea1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Funcion que ejecuta la ventana de JavaFX
 * @author JavaFX
 */
public class Main extends Application {
    /**
     * Funcion que genera la ventana y el lienzo
     * @param stage Conceptualizacion de la ventana
     * @author JavaFX
     */
    @Override
    public void start(Stage stage) throws IOException {
        // Aqui se hace la ejecucion de la Interfaz, este es un ejemplo de encapsulamiento ya que
        // Esconde los atributos y metodos del programa mediante lo que la interfaz permite
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);
        stage.setTitle("CSV loader");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Funcion que corre el programa
     * @param args El argumento de entrada
     */
    public static void main(String[] args) {launch();}
}