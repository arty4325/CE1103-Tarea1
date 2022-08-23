package com.example.tarea1;
import java.io.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.*;

/**
 * Esta clase controla lo que ocurre con los items que aparecen en la pantalla de JavaFX, tanto con la Tabla como con el Boton
 * @author Oscar Arturo Acuna Duran 2022049304
 */
public class Controller implements Initializable {
    // En los siguientes atributos se puede ver el concepto de encapsulacion, ya que estos estan protegidos por la clase
    @FXML
    private Button btn1;

    @FXML
    private AnchorPane table;

    @FXML
    private TableView<Student> Table;

    @FXML
    private TableColumn<Student, String> Carne;

    @FXML
    private TableColumn<Student, String> Correo;

    @FXML
    private TableColumn<Student, String> Nikname;

    @FXML
    private TableColumn<Student, String> Nombre;

    @FXML
    private TableColumn<Student, String> NotaFinal;

    @FXML
    private TableColumn<Student, String> PromedioExQT;

    @FXML
    private TableColumn<Student, String> PromedioExamenes;

    @FXML
    private TableColumn<Student, String> PromedioProyectos;

    @FXML
    private TableColumn<Student, String> PromedioQuices;

    @FXML
    private TableColumn<Student, String> PromedioTareas;

    @FXML
    private TableColumn<Student, String> Proyecto1;

    @FXML
    private TableColumn<Student, String> Proyecto2;

    @FXML
    private TableColumn<Student, String> Proyecto3;

    @FXML
    private TableColumn<Student, String> Telefono;

    @FXML
    private TableColumn<Student, String> Tipo;

    ObservableList<Student> List = FXCollections.observableArrayList();

    /**
     * Esta clase es lo que se ejecuta cuando se presiona el boton
     * Lo que hace es cargar el buscador de archivos, crear una lista de string y poner los elementos del CSV en ella.
     * Y por ultimo instanciar la clase Student para despues colocarla en un Observable list que se despliega en la Tabla
     * @param event El evento de estripar el boton
     * @author Oscar Arturo Acuna Duran 2022049304
     */
    @FXML
    public void SelectFile(MouseEvent event) throws IOException {
        // Esto ejecuta la Interfaz
        // Es un claro ejemplo de Encapsulacion, ya que se le esconde al usuario el acceso a los metodos y los atributos mediante
        // Esta interfaz grafica
        FileChooser fc = new FileChooser();
        File selectedFile = fc.showOpenDialog(null);
        List<String> FileAsList;
        FileAsList = TableBuilder.LoadFile(selectedFile);
        List = TableBuilder.InstanciateStudents(List, FileAsList, 12);
        Table.refresh(); // Se tiene que refrescar toda La tabla
        }


    /**
     * La presente clase es la inicializacion de lo que aparece en el Tablero, primero carga manualmente cada uno de los titulos, y despues
     * Coloca los elementos que se instanciaron en List en la Tabla, eso en la linea de codigo Table.setItems(List);
     * @author Oscar Arturo Acuna Duran 2022049304
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        Carne.setCellValueFactory(new PropertyValueFactory<Student, String>("Carne"));
        Nombre.setCellValueFactory(new PropertyValueFactory<Student, String>("Nombre"));
        Correo.setCellValueFactory(new PropertyValueFactory<Student, String>("Correo"));
        Telefono.setCellValueFactory(new PropertyValueFactory<Student, String>("Telefono"));
        Nikname.setCellValueFactory(new PropertyValueFactory<Student, String>("Nikname"));
        Tipo.setCellValueFactory(new PropertyValueFactory<Student, String>("Tipo"));
        PromedioExamenes.setCellValueFactory(new PropertyValueFactory<Student, String>("PromedioExamenes"));
        PromedioQuices.setCellValueFactory(new PropertyValueFactory<Student, String>("PromedioQuices"));
        PromedioTareas.setCellValueFactory(new PropertyValueFactory<Student, String>("PromedioTareas"));
        Proyecto1.setCellValueFactory(new PropertyValueFactory<Student, String>("Proyecto1"));
        Proyecto2.setCellValueFactory(new PropertyValueFactory<Student, String>("Proyecto2"));
        Proyecto3.setCellValueFactory(new PropertyValueFactory<Student, String>("Proyecto3"));
        PromedioProyectos.setCellValueFactory(new PropertyValueFactory<Student, String>("PromedioProyectos"));
        PromedioExQT.setCellValueFactory(new PropertyValueFactory<Student, String>("PromedioExQT"));
        NotaFinal.setCellValueFactory(new PropertyValueFactory<Student, String>("NotaFinal"));
        Table.setItems(List); // Esto lo que hace es colocar los elementos que estan en List en el Table
    }
}
