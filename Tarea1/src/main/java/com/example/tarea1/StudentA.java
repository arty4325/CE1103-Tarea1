package com.example.tarea1;

class StudentA extends Student {

    public StudentA(String carne,
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
        // Los puedo quitar del constructor y les meto un string vacio
        // Este objeto pertenece a Student, metale estos  parametros
        //ESTA es la funcion que construye el objeto como yo quiero
        //Para esto sirve los constructores
        // Crea el objeto como yo quiero
        //System.out.println(proyecto1);
        //int proy = Integer.parseInt(proyecto1);
        int examenes = Integer.parseInt(promedioExamenes);
        int quices = Integer.parseInt(promedioQuices);
        int tareas = Integer.parseInt(promedioTareas);

        int proExQT;
        proExQT = (examenes + quices + tareas)/3;

        String strProExQT = String.valueOf(proExQT);

        PromedioProyectos = "";
        PromedioExQT = strProExQT;
        NotaFinal = "STUDENTA";
    }


}