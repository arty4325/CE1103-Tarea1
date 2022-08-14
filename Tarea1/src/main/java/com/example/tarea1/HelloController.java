package com.example.tarea1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

import java.io.File;

public class HelloController {

    @FXML
    private Button btn1;

    @FXML
    public void SelectFile(MouseEvent event) {
        FileChooser fc = new FileChooser();
        File selectedFile = fc.showOpenDialog(null);

        if (selectedFile != null) {
            System.out.println(selectedFile.getAbsoluteFile());
        } else {
            System.out.println("No");
        }
    }

}
