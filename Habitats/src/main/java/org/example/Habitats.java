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
    public Habitats(String nombre, double temperatura, boolean limpieza, float humedad) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.limpieza = limpieza;
        this.humedad = humedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }
}
