package org.example;

abstract class Habitats {
    private String nombre;
    private double temperatura;
    private double humedad;
    private boolean limpieza;

    public Habitats(String nombre, double temperatura, double humedad, boolean limpieza) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }

    public abstract String obtenerDescripcion();
    public abstract String analizarHabitat();

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }
}
