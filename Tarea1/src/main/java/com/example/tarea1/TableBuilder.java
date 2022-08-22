  package com.example.tarea1;


import javafx.collections.ObservableList;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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

    public static ObservableList<Student> InstanciateStudents(ObservableList<Student> List, List<String> FileAsList, int Counter){

        if (Objects.equals(FileAsList.get(Counter + 5), "A")) {
            List.add(new StudentA(
                    FileAsList.get(Counter),
                    FileAsList.get(Counter + 1),
                    FileAsList.get(Counter + 2),
                    FileAsList.get(Counter + 3),
                    FileAsList.get(Counter + 4),
                    FileAsList.get(Counter + 5), // tipo
                    Integer.parseInt(FileAsList.get(Counter + 6)),
                    Integer.parseInt(FileAsList.get(Counter + 7)),
                    Integer.parseInt(FileAsList.get(Counter + 8)),
                    Integer.parseInt(FileAsList.get(Counter + 9)),
                    Integer.parseInt(FileAsList.get(Counter + 10)),
                    Integer.parseInt(FileAsList.get(Counter + 11)),
                    null,
                    null,
                    null
            ));
        } else {
            List.add(new StudentB(
                    FileAsList.get(Counter),
                    FileAsList.get(Counter + 1),
                    FileAsList.get(Counter + 2),
                    FileAsList.get(Counter + 3),
                    FileAsList.get(Counter + 4),
                    FileAsList.get(Counter + 5), // tipo
                    Integer.parseInt(FileAsList.get(Counter + 6)),
                    Integer.parseInt(FileAsList.get(Counter + 7)),
                    Integer.parseInt(FileAsList.get(Counter + 8)),
                    Integer.parseInt(FileAsList.get(Counter + 9)),
                    Integer.parseInt(FileAsList.get(Counter + 10)),
                    Integer.parseInt(FileAsList.get(Counter + 11)),
                    null,
                    null,
                    null
            ));

        }if(Counter < (FileAsList.size() - 12)){
            return InstanciateStudents(List, FileAsList, Counter + 12); // Recursividad de Cola
        } else{
            return List;}
        }
    }










