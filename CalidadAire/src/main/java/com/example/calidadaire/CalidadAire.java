package com.example.calidadaire;


import java.util.ArrayList;
import java.util.List;

public class CalidadAire {
    // Hora local Gandia Epoch del 7.10.2021 de las 8:00 am a las 17:00 pm
    static long FECHA[] = {1633586400000L, 1633590000000L, 1633593600000L, 1633597200000L, 1633600800000L, 1633604400000L, 1633608000000L, 1633611600000L, 1633615200000L, 1633618800000L};

    // Mediciones de la concentración de CO2 (calidad del aire en partículas por millón, ppm) en las aulas
    static int LELECTRONICA[] = {500, 650, 700, 850, 875, 600, 550, 650, 850, 600};
    static int LTELEMATICA[] = {450, 500, 675, 875, 850, 700, 750, 880, 700, 600};
    static int AULA9[] = {450, 500, 550, 650, 700, 800, 750, 600, 650, 600};

    //En la clase CalidadAire, crea una variable que lea los datos representados en las tres constantes y los almacene en una lista de objetos de tipo MedidaCO2.
    public static void main(String[] args){

        //Crea una lista para despues almacenar
        List<MedidaCO2> ListaNueva= new ArrayList<>();

        for(int i =0; i<FECHA.length; i++){
            MedidaCO2 a = new MedidaCO2((int) FECHA[i], LELECTRONICA[i], LTELEMATICA[i],AULA9[i]);
            ListaNueva.add(a);
            System.out.println(a);
        }

    }

}


}