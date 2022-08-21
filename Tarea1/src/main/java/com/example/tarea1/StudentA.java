package com.example.tarea1;

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
                    String promedioExamenes,
                    String promedioQuices,
                    String promedioTareas, // Se puede castear, obligar el dato a ser de un tipo (Tipo)
                    String proyecto1,
                    String proyecto2,
                    String proyecto3,
                    String promedioProyectos,
                    String promedioExQT,
                    String notaFinal
    ){
        super(carne, nombre, correo, telefono, nikname, tipo, promedioExamenes, promedioQuices, promedioTareas, proyecto1, proyecto2, proyecto3, promedioProyectos, promedioExQT, notaFinal);
        int proy1 = Integer.parseInt(proyecto1);
        int proy2 = Integer.parseInt(proyecto2);
        int proy3 = Integer.parseInt(proyecto3);
        int examenes = Integer.parseInt(promedioExamenes);
        int quices = Integer.parseInt(promedioQuices);
        int tareas = Integer.parseInt(promedioTareas);

        int proExQT;
        proExQT = (examenes + quices + tareas)/3;

        String strProExQT = String.valueOf(proExQT);

        int Final;
        Final = (examenes + quices + tareas + proy1 + proy2 + proy3)/6;
        String strFinal = String.valueOf(Final);

        PromedioProyectos = "";
        PromedioExQT = strProExQT;
        NotaFinal = strFinal;
    }


}