package com.example.tarea1;

public class Student {

    private String Carne;
    private String Correo;
    private String Nikname;
    private String Nombre;
    private String NotaFinal;
    private String PromedioExQT;
    private String PromedioExamenes;
    private String PromedioQuices;
    private String PromedioTareas;
    private String PromedioProyectos;
    private String Proyecto1;
    private String Proyecto2;
    private String Proyecto3;
    private String Telefono;
    private String Tipo; // todos estos son los atributos del programa

    public Student(String carne, String nombre, String correo, String telefono, String nikname, String tipo, String promedioExamenes, String promedioQuices, String promedioTareas, String proyecto1, String proyecto2, String proyecto3, String promedioProyectos, String promedioExQT, String notaFinal) {
        Carne = carne;
        Correo = correo;
        Nikname = nikname;
        Nombre = nombre;
        NotaFinal = notaFinal;
        PromedioExQT = promedioExQT;
        PromedioExamenes = promedioExamenes;
        PromedioQuices = promedioQuices;
        PromedioTareas = promedioTareas;
        PromedioProyectos = promedioProyectos;
        Proyecto1 = proyecto1;
        Proyecto2 = proyecto2;
        Proyecto3 = proyecto3;
        Telefono = telefono;
        Tipo = tipo;
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

    public String getNotaFinal() {
        return NotaFinal;
    }

    public String getPromedioExQT() {
        return PromedioExQT;
    }

    public String getPromedioExamenes() {
        return PromedioExamenes;
    }

    public String getPromedioQuices() {
        return PromedioQuices;
    }

    public String getPromedioTareas() {
        return PromedioTareas;
    }

    public String getPromedioProyectos() {
        return PromedioProyectos;
    }

    public String getProyecto1() {
        return Proyecto1;
    }

    public String getProyecto2() {
        return Proyecto2;
    }

    public String getProyecto3() {
        return Proyecto3;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getTipo() {
        return Tipo;
    }
}