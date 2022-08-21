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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

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

    @FXML
    public void SelectFile(MouseEvent event) throws IOException {
        FileChooser fc = new FileChooser();
        File selectedFile = fc.showOpenDialog(null);
        List<String> FileAsList;
        // Insertar el Link

        FileAsList = TableBuilder.LoadFile(selectedFile);
        List = TableBuilder.InstanciateStudents(List, FileAsList);


        Table.refresh();

        }

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
        Table.setItems(List);
    }
}
