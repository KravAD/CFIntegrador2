package org.example;

abstract class Habitats {

    private String nombre;
    private double temperatura;
    private boolean limpieza;
    private float humedad;

    public Habitats (){
        double temperatura = 0.0;
        boolean limpieza = true;
        float humedad = 0.1F;

    }
    public Habitats(double temperatura, boolean limpieza, float humedad) {
        this.temperatura = temperatura;
        this.limpieza = limpieza;
        this.humedad = humedad;
    }
}
