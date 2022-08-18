package com.example.tarea1;

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
                    String promedioExamenes,
                    String promedioQuices,
                    String promedioTareas,
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

        int promedioproys;

        promedioproys = (proy1 + proy2 + proy3)/3;

        String strPromedioProys = String.valueOf(promedioproys);

        int Final;
        Final = (examenes + quices + tareas + proy1 + proy2 + proy3)/6;
        String strFinal = String.valueOf(Final);

        PromedioProyectos = strPromedioProys;
        PromedioExQT = "";
        NotaFinal = strFinal;


    }


}