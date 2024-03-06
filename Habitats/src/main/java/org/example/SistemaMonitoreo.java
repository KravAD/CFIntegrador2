package org.example;

    class SistemaMonitoreo {
        // Método para monitorear un hábitat
        public static void monitorearHabitat(Habitats habitat) {
            System.out.println("Monitoreando " + habitat.obtenerDescripcion() + ":");
            System.out.println("Estado: " + habitat.analizarHabitat());
        }
    }

