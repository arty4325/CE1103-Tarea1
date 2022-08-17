package com.example.tarea1;

class StudentB extends Student {

    public StudentB(String carne,
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
        int proy1 = Integer.parseInt(proyecto1);
        int proy2 = Integer.parseInt(proyecto2);
        int proy3 = Integer.parseInt(proyecto3);

        int promedioproys;

        promedioproys = (proy1 + proy2 + proy3)/3;

        String strPromedioProys = String.valueOf(promedioproys);

        PromedioProyectos = strPromedioProys;
        PromedioExQT = "";
        NotaFinal = "STUDENTA";


    }


}