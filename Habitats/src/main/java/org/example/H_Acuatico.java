package org.example;


class HabitatAcuatico extends Habitats{
    private int nivelOxigeno;

    public HabitatAcuatico(String nombre, double temperatura, double humedad, boolean limpieza, int nivelOxigeno) {
        super(nombre, temperatura, humedad, limpieza);
        this.nivelOxigeno = nivelOxigeno;
    }


    @Override
    public String obtenerDescripcion() {
        return "Hábitat acuático: " + getNombre();
    }

    @Override
    public String analizarHabitat() {
        String estado = "Buen estado";
        if (getTemperatura() > 28 || getHumedad() < 60 || !isLimpieza() || nivelOxigeno < 5) {
            estado = "Atención requerida";
        }
        return estado;
    }
}