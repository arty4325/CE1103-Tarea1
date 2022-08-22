package com.example.tarea1;

import java.util.OptionalDouble;

class StudentA extends Student { // Aqui se puede evidenciar el concepto de Clase, se sabe que el concepto de clase corresponde al "Molde" que se utiliza para poder
    // instanciar un objeto, en este caso la clase StudentA es el "Molde" que permite instanciar a los estudiantes de tipo A
    // Crear dos metodos que hagan una operacion aritmetica
    // Cuando se les mete en la tabla que funcione la vara bien

    public StudentA(  // En el presente constructor se puede evidenciar el concepto de métodos, ya que el Objeto StudentA tiene la capacidad de calcular las notas promedio de
                      // los estudiantes, esta capacidad se puede ver evidenciada en las formulas que se ejecutan antes del output
                    String carne,
                    String nombre,
                    String correo,
                    String telefono,
                    String nikname,
                    String tipo,
                    Integer promedioExamenes,
                    Integer promedioQuices,
                    Integer promedioTareas, // Se puede castear, obligar el dato a ser de un tipo (Tipo)
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