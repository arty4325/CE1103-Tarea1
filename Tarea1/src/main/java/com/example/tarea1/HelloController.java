package com.example.tarea1;
import java.io.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;

public class HelloController {

    @FXML
    private Button btn1;

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
                //System.out.println(values[]);
            }
        }
    }
}
