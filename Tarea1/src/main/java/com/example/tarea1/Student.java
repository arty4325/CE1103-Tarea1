package com.example.tarea1;


/**
 * La presente Super Clase unicamente contiene la definicion de los elementos que aparecen en la tabla, el Constructor y los Getters
 * Esto se hereda en las clases StudentA y StudentB
 * @author Arturo Acuna Duran 2022049304
 */
public class Student {
    // Evidencia del concepto de Abstraccion, en la realidad existe el objeto y la idea del Objeto (Una idea muy Platonica), La abstraccion
    // Consiste en ese paso entre el objeto y la idea, en este caso existen los estudiantes y la idea del estudiante, ese proceso abstracto se
    // Da en la presente clase, teniendo un claro ejemplo de Abstaccion.

    // Se puede evidenciar el concepto de Clase, recuerdese que desde un punto de vista conceptual la Clase es el "Molde" que se utiliza para poder
    // Crear o Intanciar los objetos, en este cacso la clase Student es el molde con el cual se pueden instanciar los estudiantes y sus distintos atributos
    protected String Carne; // Se puede evidenciar el concepto de encapsulación, ya que las variables que se definen aqui solamente son accesables por las clases hijas a student, pero estan encapsuladas para otras clases como Controller
    protected String Correo; // Ademas se puede ver el concepto de Atributos, ya que el Objeto Estudiante tiene la cualidad de tener Carne, Correo, Nikname, etc...
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

    public Student(
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




