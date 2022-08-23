package com.example.tarea1;

import java.util.OptionalDouble;

/**
 * La presente Super Clase unicamente contiene la definicion de los elementos que aparecen en la tabla, el Constructor y los Getters
 * Esto se hereda en las clases StudentA y StudentB
 * @author Arturo Acuna Duran 2022049304
 */
public class Student {
    // Carne, Correo, Nikname, Nombre, NotaFinal, etc... corresponden a los atributos de la clase Student. Se sabe que los atributos son
    // las caracteristicas que tiene un objeto, en este caso el objeto estudiante tiene carne, correo, notas, etc...
    protected String Carne; // Se puede evidenciar el concepto de encapsulación, ya que las variables que se definen aqui solamente son accesables por las clases hijas a student, pero estan encapsuladas para otras clases como Controller
    protected String Correo;
    protected String Nikname;
    protected String Nombre;
    protected Double NotaFinal;
    protected Double PromedioExQT;
    protected Integer PromedioExamenes;
    protected Integer PromedioQuices;
    protected Integer PromedioTareas;

    protected Double PromedioProyectos;
    protected Integer Proyecto1;
    protected Integer Proyecto2;
    protected Integer Proyecto3;
    protected String Telefono;
    protected String Tipo;

    public Student(String carne,
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
        this.Carne = carne;
        this.Correo = correo;
        this.Nikname = nikname;
        this.Nombre = nombre;
        this.PromedioExamenes = promedioExamenes;
        this.PromedioQuices = promedioQuices;
        this.PromedioTareas = promedioTareas;
        this.Proyecto1 = proyecto1;
        this.Proyecto2 = proyecto2;
        this.Proyecto3 = proyecto3;
        this.Telefono = telefono;
        this.Tipo = tipo;
        this.PromedioProyectos = promedioProyectos;
        this.PromedioExQT = promedioExQT;
        this.NotaFinal = notaFinal;
    }


    public String getCarne() {
        return Carne;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getNikname() {
        return Nikname;
    }

    public String getNombre() {
        return Nombre;
    }

    public Double getNotaFinal() {
        return NotaFinal;
    }

    public Double getPromedioExQT() {
        return PromedioExQT;
    }

    public Integer getPromedioExamenes() {
        return PromedioExamenes;
    }

    public Integer getPromedioQuices() {
        return PromedioQuices;
    }

    public Integer getPromedioTareas() {
        return PromedioTareas;
    }

    public Double getPromedioProyectos() {
        return PromedioProyectos;
    }

    public Integer getProyecto1() {
        return Proyecto1;
    }

    public Integer getProyecto2() {
        return Proyecto2;
    }

    public Integer getProyecto3() {
        return Proyecto3;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getTipo() {
        return Tipo;
    }
}




