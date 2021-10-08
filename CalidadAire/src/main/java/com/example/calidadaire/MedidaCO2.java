package com.example.calidadaire;

/*
Tiempo en milisegundos en que se realizó la lectura.
o    Concentración en ppm de CO2 en el Laboratorio de Electrónica.
o    Concentración en ppm de CO2 en el Laboratorio de Telemática.
o    Concentración en ppm de CO2 en el Aula 9.
Crea el método constructor de la clase los métodos Get y Set para acceder a estos atributos.
 */
public class MedidaCO2 {
    private int tiempo;
    private double CO2Elect;
    private double CO2Telem;
    private double Aula9;

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getCO2Elect() {
        return CO2Elect;
    }

    public void setCO2Elect(double CO2Elect) {
        this.CO2Elect = CO2Elect;
    }

    public double getCO2Telem() {
        return CO2Telem;
    }

    public void setCO2Telem(double CO2Telem) {
        this.CO2Telem = CO2Telem;
    }

    public double getAula9() {
        return Aula9;
    }

    public void setAula9(double aula9) {
        Aula9 = aula9;
    }

    public MedidaCO2(int tiempo, double CO2Elect, double CO2Telem, double aula9) {
        this.tiempo = tiempo;
        this.CO2Elect = CO2Elect;
        this.CO2Telem = CO2Telem;
        Aula9 = aula9;
    }
}
