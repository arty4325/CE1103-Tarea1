package com.example.tarea1;


import javafx.collections.ObservableList;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableBuilder{
    public static List<String> LoadFile(File LoadedPath) throws IOException{
        List<String> FileAsList = new ArrayList<String>();

        if(LoadedPath != null){
            String PathDirection = LoadedPath.getAbsolutePath();
            String line = "";

            BufferedReader br = new BufferedReader(new FileReader(PathDirection));
            while((line = br.readLine()) != null){
                String[] values = line.split(",");
                FileAsList.addAll(Arrays.asList(values).subList(0, 12));
            }

        }
        return FileAsList;
    }

    public static ObservableList<Student> InstanciateStudents(ObservableList<Student> List, List<String> FileAsList){
        for(int i = 1; i < (FileAsList.size())/12; i++){
            if(FileAsList.get(12 * i + 5).equals("A")){
                List.add(new StudentA( // En esta linea de codigo se puede evidenciar el concepto de instanciacion, en este caso se puede ver como se crea un Objeto Estudiante A con la
                        // clase StudentA, y se le da un valor a los atributos en base a lo que se obtiene del archivo CSV.
                        FileAsList.get(12 * i),
                        FileAsList.get(12 * i + 1),
                        FileAsList.get(12 * i + 2),
                        FileAsList.get(12 * i + 3),
                        FileAsList.get(12 * i + 4),
                        FileAsList.get(12 * i + 5), // tipo
                        Integer.parseInt(FileAsList.get(12 * i + 6)),
                        Integer.parseInt(FileAsList.get(12 * i + 7)),
                        Integer.parseInt(FileAsList.get(12 * i + 8)),
                        Integer.parseInt(FileAsList.get(12 * i + 9)),
                        Integer.parseInt(FileAsList.get(12 * i + 10)),
                        Integer.parseInt(FileAsList.get(12 * i + 11)),
                        null,
                        null,
                        null
                ));
            }
            else{
                List.add(new StudentB( // En esta linea de codigo se puede evidenciar el concepto de instanciacion, en este caso se puede ver como se crea un Objeto Estudiante A con la
                        // clase StudentA, y se le da un valor a los atributos en base a lo que se obtiene del archivo CSV.
                        FileAsList.get(12 * i),
                        FileAsList.get(12 * i + 1),
                        FileAsList.get(12 * i + 2),
                        FileAsList.get(12 * i + 3),
                        FileAsList.get(12 * i + 4),
                        FileAsList.get(12 * i + 5), // tipo
                        Integer.parseInt(FileAsList.get(12 * i + 6)),
                        Integer.parseInt(FileAsList.get(12 * i + 7)),
                        Integer.parseInt(FileAsList.get(12 * i + 8)),
                        Integer.parseInt(FileAsList.get(12 * i + 9)),
                        Integer.parseInt(FileAsList.get(12 * i + 10)),
                        Integer.parseInt(FileAsList.get(12 * i + 11)),
                        null,
                        null,
                        null
                ));
            }


        }
        return List;
    }









}
