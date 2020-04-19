package com.company;

public class Estudiante extends Persona{

    private int añoDeIngreso;
    private double cuotaMensual;
    private String carrera;


    public Estudiante(int añoDeIngreso,double cuotaMensual, String carrera,int dni,String nombre, String email,String direccion){
        super(dni,nombre,email,direccion);
        this.añoDeIngreso=añoDeIngreso;
        this.cuotaMensual=cuotaMensual;
        this.carrera=carrera;
    }


    public int getAñoDeIngreso() {
        return añoDeIngreso;
    }

    public void setAñoDeIngreso(int añoDeIngreso) {
        this.añoDeIngreso = añoDeIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    @Override
    public String toString() {
        return "Estudiante{"  + super.toString() +
                "añoDeIngreso=" + añoDeIngreso +
                ", cuotaMensual=" + cuotaMensual +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
