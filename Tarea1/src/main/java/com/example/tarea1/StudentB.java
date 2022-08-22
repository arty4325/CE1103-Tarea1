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
                    Integer promedioExamenes,
                    Integer promedioQuices,
                    Integer promedioTareas,
                    Integer proyecto1,
                    Integer proyecto2,
                    Integer proyecto3,
                    Integer promedioProyectos,
                    Integer promedioExQT,
                    Integer notaFinal
    ){
        super(carne, nombre, correo, telefono, nikname, tipo, promedioExamenes, promedioQuices, promedioTareas, proyecto1, proyecto2, proyecto3, promedioProyectos, promedioExQT, notaFinal);

        int promedioproys;

        promedioproys = (proyecto1 + proyecto2 + proyecto3)/3;



        int Final;
        Final = (promedioExamenes + promedioQuices + promedioTareas + proyecto1 + proyecto2 + proyecto3)/6;


        this.PromedioProyectos = promedioproys;
        this.PromedioExQT = null;
        this.NotaFinal = Final;


    }


}