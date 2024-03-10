package org.example;

    class SistemaMonitoreo {

        public static void monitorearHabitat(Habitats habitat) {
            System.out.println("Monitoreando " + habitat.obtenerDescripcion() + ":");
            System.out.println("Estado: " + habitat.analizarHabitat());
        }
    }

