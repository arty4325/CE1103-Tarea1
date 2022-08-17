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


    ObservableList<Student> List = FXCollections.observableArrayList();

    @FXML
    public void SelectFile(MouseEvent event) throws IOException {
        FileChooser fc = new FileChooser();
        File selectedFile = fc.showOpenDialog(null);
        List<String> CSV = new ArrayList<String>();

        if (selectedFile != null) {
            //System.out.println(selectedFile.getAbsoluteFile());
            String path = selectedFile.getAbsolutePath();
            String line = "";

            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null) {
                String[] values = line.split(",");

                //list.add(values[0]); // list contiene los valores de el archivo csv
                //System.out.println(values[0]);
                for(int i = 0; i < 12; i++){
                    CSV.add(values[i]);
                }
            }
            System.out.println(CSV);
            System.out.println(CSV.get(12));
            int ListSize = CSV.size();
            System.out.println(ListSize/12);

            //List.add(new Student("2022049304", "oacuna@estudiantec.cr", "arty4325", "Oscar Arturo", "77", "69","90", "80", "80", "90", " 80", "90", "80", "70769040", "A"));
            for(int i = 1; i < ListSize/12; i++){
                System.out.println(CSV.get(12*i + 5));
                if(Objects.equals(CSV.get(12 * i + 5), "A")) {
                    List.add(new StudentA(
                            CSV.get(12 * i),
                            CSV.get(12 * i + 1),
                            CSV.get(12 * i + 2),
                            CSV.get(12 * i + 3),
                            CSV.get(12 * i + 4),
                            CSV.get(12 * i + 5), // tipo
                            CSV.get(12 * i + 6),
                            CSV.get(12 * i + 7),
                            CSV.get(12 * i + 8),
                            CSV.get(12 * i + 9),
                            CSV.get(12 * i + 10),
                            CSV.get(12 * i + 11),
                            "NONE",
                            "NONE",
                            "NONE"
                    ));
                }
                if(Objects.equals(CSV.get(12 * i + 5), "B")) {
                    List.add(new StudentB(
                            CSV.get(12 * i),
                            CSV.get(12 * i + 1),
                            CSV.get(12 * i + 2),
                            CSV.get(12 * i + 3),
                            CSV.get(12 * i + 4),
                            CSV.get(12 * i + 5), // tipo
                            CSV.get(12 * i + 6),
                            CSV.get(12 * i + 7),
                            CSV.get(12 * i + 8),
                            CSV.get(12 * i + 9),
                            CSV.get(12 * i + 10),
                            CSV.get(12 * i + 11),
                            "NONE",
                            "NONE",
                            "NONE"
                    ));
                }
            }

            Table.refresh(); // ya esto permite agregar elementos a la tabla





        }
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