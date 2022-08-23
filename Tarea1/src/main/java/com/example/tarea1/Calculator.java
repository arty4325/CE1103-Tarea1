package com.example.tarea1;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * Calcula los promedios que se despliegan en la tabla de JavaFX
 * Utiliza la sobrecarga, ya que hay dos funciones que se llaman igual pero tienen parametros distintos
 * @author Oscar Arturo Acuna Duran 2022049304
 */
public class Calculator {
    /**
     *
     * @param Val1 Proyecto1 o Examen
     * @param Val2 Proyecto2 o Quiz
     * @param Val3 Proyecto3 o Tarea
     * @return El promedio de estos valores
     * @author Oscar Arturo Acuna Duran 2022049304
     */
    public static OptionalDouble Average(Integer Val1, Integer Val2, Integer Val3){
        // El concepto de Sobrecarga hace referencia a la creacion de Metodos que tienen el mismo nombre pero que ejecutan
        // Distintas funciones dependiendo de los parametros, en este caso se puede evidenciar esto ya que
        // La Clase Calculator tiene dos Metodos Average que se utilizan dependiendo de
        // La cantidad de parametros que se le den

        //Informacion Obtenida de https://www.tutorialspoint.com/intstream-average-method-in-java
        IntStream ValsAverage = IntStream.of(Val1, Val2, Val3);
        OptionalDouble ReturnableAvg = ValsAverage.average();
        return ReturnableAvg;
    }

    /**
     *
     * @param Proyecto1 Nota en el primer proyecto
     * @param Proyecto2 Nota en el segundo proyecto
     * @param Proyecto3 Nota en el Tercer proyecto
     * @param PromedioExamenes Nota promedio de los examenes
     * @param PromedioQuices Nota promedio de los Quices
     * @param PromedioTareas Nota promedio de las Tareas
     * @return Devuelve la nota final asumiendo que cada uno de los componentes valen lo mismo
     * @author Oscar Arturo Acuna Duran 2022049304
     */
    public static OptionalDouble Average(Integer Proyecto1, Integer Proyecto2, Integer Proyecto3, Integer PromedioExamenes, Integer PromedioQuices, Integer PromedioTareas){
        // Se puede evidenciar el concepto metodos, ya que en la clase Calculator se tiene el Metodo Averate que ejecuta la operacion matematica de promedio

        // Informacion obtenida de https://www.tutorialspoint.com/intstream-average-method-in-java
        IntStream AllAverage = IntStream.of(Proyecto1, Proyecto2, Proyecto3, PromedioExamenes, PromedioQuices, PromedioTareas);
        OptionalDouble ReturnableAvg = AllAverage.average();
        return ReturnableAvg;
    }

}
