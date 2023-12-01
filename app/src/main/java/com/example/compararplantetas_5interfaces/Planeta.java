package com.example.compararplantetas_5interfaces;

public class Planeta {
    private String nombre;
    private double diametro;
    private double distanciaSol;
    private int densidad;

    public Planeta(String nombre, double diametro, double distanciaSol, int densidad) {
        this.nombre = nombre;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.densidad = densidad;
    }

    // Getters
    public String getNombre() { return nombre; }
    public double getDiametro() { return diametro; }
    public double getDistanciaSol() { return distanciaSol; }
    public int getDensidad() { return densidad; }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nDiametro: " + diametro +
                "\nDistancia al Sol: " + distanciaSol +
                "\nDensidad: " + densidad;
    }

}

