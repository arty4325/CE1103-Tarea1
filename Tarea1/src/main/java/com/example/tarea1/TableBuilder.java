  package com.example.tarea1;


import javafx.collections.ObservableList;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

  /**
   * Esta clase tiene dos metodos, el primer metodo es el encargado de cargar el archivo CSV y meter cada elemento en una Lista
   * El segundo metodo Lo que hace es instanciar Student y meterlo en una ObservableList
   * @author Oscar Arturo Acuna Duran 2022049304
   */
  public class TableBuilder{
      /**
       * La presente funcion lo que hacce es cargar un archivo CSV en una Lista de Strings dentro de Java
       * El codigo toma muchos elementos de un video de Alex Lee en Youtube, con ciertas modificaciones realizadas por Arturo Acuna
       * @param LoadedPath Esta es la ubicacion de la computadora en donde se puede encontar el
       * @return FileAsList este es el archivo CSV ya cargado en la Lista de Java
       * @author Alex Lee <a href="https://youtu.be/-Aud0cDh-J8">...</a> y Arturo Acuna Duran 2022049304
       */
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

      /**
       * Este metodo lo que hace es cargar las instanciaciones de Student en una ObservableList para despues desplegarlas en el tablero
       * El codigo tiene una alta inspiracion en lo que aparece en un video de Random Code en youtube, pero tiene muchos elementos
       * Programados por Arturo Acuna
       * @param List Este paramtetro Lista es la misma lista que despues se va a retornar con las instanciaciones de Student Cargadas
       * @param FileAsList Esta Lista contiene los elementos del archivo CSV pero cargados en ella como datos independientes
       * @param Counter Este contador permite realizar la recursividad de pila con la cual se ejecuta la repeticion de codigo
       * @return Retorna la Lista con las instanciaciones de Student
       * @author Arturo Acuna Duran 2022049304 y Random Code <a href="https://youtu.be/fnU1AlyuguE">...</a>
       */
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










