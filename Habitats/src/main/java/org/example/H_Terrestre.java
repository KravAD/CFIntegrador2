package org.example;

class HabitatTerrestre extends Habitats{
    private int nivelContaminacion;

    public HabitatTerrestre(String nombre, double temperatura, double humedad, boolean limpieza, int nivelContaminacion) {
        super(nombre, temperatura, humedad, limpieza);
        this.nivelContaminacion = nivelContaminacion;
    }


    @Override
    public String obtenerDescripcion() {
        return "Hábitat terrestre: " + getNombre();
    }

    @Override
    public String analizarHabitat() {
        String estado = "Buen estado";
        if (getTemperatura() > 30 || getHumedad() < 40 || !isLimpieza() || nivelContaminacion > 70) {
            estado = "Atención requerida";
        }
        return estado;
    }
}