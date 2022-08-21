package com.example.tarea1;

public class Student {
    // Carne, Correo, Nikname, Nombre, NotaFinal, etc... corresponden a los atributos de la clase Student. Se sabe que los atributos son
    // las caracteristicas que tiene un objeto, en este caso el objeto estudiante tiene carne, correo, notas, etc...
    protected String Carne; // Se puede evidenciar el concepto de encapsulación, ya que las variables que se definen aqui solamente son accesables por las clases hijas a student, pero estan encapsuladas para otras clases como Controller
    protected String Correo;
    protected String Nikname;
    protected String Nombre;
    protected String NotaFinal;
    protected String PromedioExQT;
    protected String PromedioExamenes;
    protected String PromedioQuices;
    protected String PromedioTareas;

    protected String PromedioProyectos;
    protected String Proyecto1;
    protected String Proyecto2;
    protected String Proyecto3;
    protected String Telefono;
    protected String Tipo;

    public Student(String carne,
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
        Carne = carne;
        Correo = correo;
        Nikname = nikname;
        Nombre = nombre;
        PromedioExamenes = promedioExamenes;
        PromedioQuices = promedioQuices;
        PromedioTareas = promedioTareas;
        Proyecto1 = proyecto1;
        Proyecto2 = proyecto2;
        Proyecto3 = proyecto3;
        Telefono = telefono;
        Tipo = tipo;
        PromedioProyectos = promedioProyectos;
        PromedioExQT = promedioExQT;
        NotaFinal = notaFinal;
    }

    public String getCarne() { return Carne;}
    public String getCorreo() {return Correo;}
    public String getNikname() {return Nikname;}
    public String getNombre() {return Nombre;}
    public String getNotaFinal() {return NotaFinal;}
    public String getPromedioExQT() {return PromedioExQT;}
    public String getPromedioExamenes() {return PromedioExamenes;}
    public String getPromedioQuices() { return PromedioQuices;}
    public String getPromedioTareas() {return PromedioTareas;}
    public String getPromedioProyectos() {return PromedioProyectos;}
    public String getProyecto1() {return Proyecto1;}
    public String getProyecto2() {return Proyecto2;}
    public String getProyecto3() {return Proyecto3;}
    public String getTelefono() {return Telefono;}
    public String getTipo() {return Tipo;}
}




