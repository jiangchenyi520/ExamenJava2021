package com.example.calidadaire;

/*
Tiempo en milisegundos en que se realizó la lectura.
o    Concentración en ppm de CO2 en el Laboratorio de Electrónica.
o    Concentración en ppm de CO2 en el Laboratorio de Telemática.
o    Concentración en ppm de CO2 en el Aula 9.
Crea el método constructor de la clase los métodos Get y Set para acceder a estos atributos.
 */
public class MedidaCO2 {
    private long fecha;
    private int CO2Elect;
    private int CO2Telem;
    private int Aula9;

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public int getCO2Elect() {
        return CO2Elect;
    }

    public void setCO2Elect(int CO2Elect) {
        this.CO2Elect = CO2Elect;
    }

    public int getCO2Telem() {
        return CO2Telem;
    }

    public void setCO2Telem(int CO2Telem) {
        this.CO2Telem = CO2Telem;
    }

    public int getAula9() {
        return Aula9;
    }

    public void setAula9(int aula9) {
        Aula9 = aula9;
    }

    public MedidaCO2(long fecha, int CO2Elect, int CO2Telem, int aula9) {
        this.fecha = fecha;
        this.CO2Elect = CO2Elect;
        this.CO2Telem = CO2Telem;
        Aula9 = aula9;
    }
}

