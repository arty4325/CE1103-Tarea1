package com.example.tarea1;

import java.util.OptionalDouble;

/**
 * Clase StudentA, se encarga de llamar a los debidos metodos en Calculator para obtener los promedios solicitados y despues ejecutar el programa
 * Es hija de Student
 * @author Arturo Acuna Duran 2022049304
 */
class StudentB extends Student {

    //En esta clase se puede ver el concepto de herencia, la clase StudentB es hija de la clase StudentA, es entonces que no se tienen que redefinir los atributos ya que estos estan
    //en la clase padre, y no se tienen que volver a programar los "Getters"


    public StudentB(
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

        Double promedioproys;
        promedioproys = (Calculator.Average(proyecto1, proyecto2, proyecto3)).getAsDouble();

        Double Final;
        Final = (Calculator.Average(proyecto1, proyecto2, proyecto3, promedioExamenes, promedioQuices, promedioTareas)).getAsDouble();

        this.PromedioProyectos = promedioproys;
        this.PromedioExQT = null;
        this.NotaFinal = Final;


    }


}