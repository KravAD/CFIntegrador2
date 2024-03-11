package org.example;

abstract class Animales {
    private String nombre;
    private int edad;
    private String habitat;

    public Animales(String nombre, int edad, String habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
    }

    public abstract String hacerRuido();
    public abstract void alimentar();





}
