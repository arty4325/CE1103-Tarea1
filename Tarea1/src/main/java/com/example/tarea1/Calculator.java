package com.example.tarea1;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Calculator {
    public static OptionalDouble Average(Integer Val1, Integer Val2, Integer Val3){
        IntStream ValsAverage = IntStream.of(Val1, Val2, Val3);
        OptionalDouble ReturnableAvg = ValsAverage.average();
        return ReturnableAvg;
    }

    public static OptionalDouble Average(Integer Proyecto1, Integer Proyecto2, Integer Proyecto3, Integer PromedioExamenes, Integer PromedioQuices, Integer PromedioTareas){
        IntStream AllAverage = IntStream.of(Proyecto1, Proyecto2, Proyecto3, PromedioExamenes, PromedioQuices, PromedioTareas);
        OptionalDouble ReturnableAvg = AllAverage.average();
        return ReturnableAvg;
    }

}
