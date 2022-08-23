package com.example.tarea1;

import java.util.OptionalDouble;

/**
 * Clase StudentA, se encarga de llamar a los debidos metodos en Calculator para obtener los promedios solicitados y despues ejecutar el programa
 * Es hija de Student
 * @author Arturo Acuna Duran 2022049304
 */
class StudentA extends Student {

    public StudentA(
                    String carne,
                    String nombre,
                    String correo,
                    String telefono,
                    String nikname,
                    String tipo,
                    Integer promedioExamenes,
                    Integer promedioQuices,
                    Integer promedioTareas,
                    Integer proyecto1,
                    Integer proyecto2,
                    Integer proyecto3,
                    Double promedioProyectos,
                    Double promedioExQT,
                    Double notaFinal
    ){
        super(carne, nombre, correo, telefono, nikname, tipo, promedioExamenes, promedioQuices, promedioTareas, proyecto1, proyecto2, proyecto3, promedioProyectos, promedioExQT, notaFinal);

        promedioExQT = (Calculator.Average(promedioExamenes, promedioQuices, promedioTareas)).getAsDouble();

        notaFinal = (Calculator.Average(proyecto1, proyecto2, proyecto3, promedioExamenes, promedioQuices, promedioTareas)).getAsDouble();

        this.PromedioProyectos = null;
        this.PromedioExQT = promedioExQT;
        this.NotaFinal = notaFinal;
    }


}