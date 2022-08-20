package com.example.tarea1;


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




}
