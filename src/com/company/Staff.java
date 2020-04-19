package com.company;

public class Staff extends Persona {

   private double salario;
   private String turno;


    public Staff(double salario,String turno,int dni,String nombre, String email,String direccion){
        super(dni,nombre,email,direccion);
        this.salario=salario;
        this.turno=turno == "mañana" ? turno : "noche";
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString() +
                "salario=" + salario +
                ", turno='" + turno + '\'' +
                '}';
    }
}
