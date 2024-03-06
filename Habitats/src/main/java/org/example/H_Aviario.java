package org.example;

class HabitatAviario extends Habitats{
    private int nivelRuido;

    public HabitatAviario(String nombre, double temperatura, double humedad, boolean limpieza, int nivelRuido) {
        super(nombre, temperatura, humedad, limpieza);
        this.nivelRuido = nivelRuido;
    }


    @Override
    public String obtenerDescripcion() {
        return "Hábitat aviario: " + getNombre();
    }

    @Override
    public String analizarHabitat() {
        String estado = "Buen estado";
        if (getTemperatura() > 25 || getHumedad() < 50 || !isLimpieza() || nivelRuido > 60) {
            estado = "Atención requerida";
        }
        return estado;
    }
}