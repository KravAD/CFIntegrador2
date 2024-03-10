package org.example;

import static org.example.SistemaMonitoreo.monitorearHabitat;

public class Main {
    public static void main(String[] args) {

    
            Habitats acuario = new HabitatAcuatico("Acuario", 25, 80, true, 8);
            Habitats selva = new HabitatTerrestre("Selva", 28, 70, true, 60);
            Habitats jaula = new HabitatAviario("Jaula", 20, 60, false, 40);

            monitorearHabitat(acuario);
            monitorearHabitat(selva);
            monitorearHabitat(jaula);
        }







    }
