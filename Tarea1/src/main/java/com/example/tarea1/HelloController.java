package com.example.tarea1;
import java.io.*;

import javafx.beans.Observable;
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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.nio.Buffer;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button btn1;

    @FXML
    private AnchorPane table;

    @FXML
    private TableView<Student> Table; // Lo que se le dice a la tabla es que contenga estudiantes

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

    @FXML
    public void SelectFile(MouseEvent event) throws IOException {
        FileChooser fc = new FileChooser();
        File selectedFile = fc.showOpenDialog(null);

        if (selectedFile != null) {
            //System.out.println(selectedFile.getAbsoluteFile());
            String path = selectedFile.getAbsolutePath();
            String line = "";

            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                System.out.println(values[0]);
            }
        }
    }

    ObservableList<Student> list = FXCollections.observableArrayList(
            new Student("2022049304", "oacuna@estudiantec.cr", "arty4325", "Oscar Arturo", "77", "69","90", "80", "80", "90", " 80", "90", "80", "70769040", "A")
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        Carne.setCellValueFactory(new PropertyValueFactory<Student, String>("Carne"));
        Correo.setCellValueFactory(new PropertyValueFactory<Student, String>("Correo"));
        Nikname.setCellValueFactory(new PropertyValueFactory<Student, String>("Nikname"));
        Nombre.setCellValueFactory(new PropertyValueFactory<Student, String>("Nombre"));
        NotaFinal.setCellValueFactory(new PropertyValueFactory<Student, String>("NotaFinal"));
        PromedioExQT.setCellValueFactory(new PropertyValueFactory<Student, String>("PromedioExQT"));
        PromedioExamenes.setCellValueFactory(new PropertyValueFactory<Student, String>("PromedioExamenes"));
        PromedioProyectos.setCellValueFactory(new PropertyValueFactory<Student, String>("PromedioProyectos"));
        PromedioQuices.setCellValueFactory(new PropertyValueFactory<Student, String>("PromedioQuices"));
        PromedioTareas.setCellValueFactory(new PropertyValueFactory<Student, String>("PromedioTareas"));
        Proyecto1.setCellValueFactory(new PropertyValueFactory<Student, String>("Proyecto1"));
        Proyecto2.setCellValueFactory(new PropertyValueFactory<Student, String>("Proyecto2"));
        Proyecto3.setCellValueFactory(new PropertyValueFactory<Student, String>("Proyecto3"));
        PromedioProyectos.setCellValueFactory(new PropertyValueFactory<Student, String>("PromedioProyectos"));
        Telefono.setCellValueFactory(new PropertyValueFactory<Student, String>("Telefono"));
        Tipo.setCellValueFactory(new PropertyValueFactory<Student, String>("Tipo"));


        Table.setItems(list);




    }
}
