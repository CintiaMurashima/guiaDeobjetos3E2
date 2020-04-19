package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("-----------------------EJE 1-----------------------------");
        Estudiante estudiant1= new Estudiante(2018,10000,"Programacion",343434,"cintia","cin@hotamil.com","ruta 226");
        Estudiante estudiant2= new Estudiante(2018,10000,"Programacion",343434,"jor","jor@hotamil.com","ruta 226");
        Estudiante estudiant3= new Estudiante(2018,15000,"Programacion",343434,"lore","lore@hotamil.com","ruta 226");
        Estudiante estudiant4= new Estudiante(2018,20000,"Programacion",343434,"paula","pau@hotamil.com","ruta 226");
        System.out.println(estudiant1);
        System.out.println(estudiant2);
        System.out.println(estudiant3);
        System.out.println(estudiant4);

        System.out.println("-----------------------EJE 2-----------------------------");

        Staff staff1=new Staff(20000,"mañana",348884905,"Manuel","hola@hot","Argentina 2222");
        Staff staff2=new Staff(25000,"noche",342224905,"Marcelo","hola@hot","Cuba 1898");
        Staff staff3=new Staff(30000,"noche",348594655,"Ricardo","hola@hot","santiago 7777");
        Staff staff4=new Staff(40000,"mañana",348555905,"Cristina","hola@hot","Republic 1808");

        System.out.println(staff1);
        System.out.println(staff2);
        System.out.println(staff3);
        System.out.println(staff4);

        System.out.println("-----------------------EJE 3-----------------------------");

        Persona [] listadoStaffyAlumnos= new Persona[8];

        listadoStaffyAlumnos[0]= estudiant1;
        listadoStaffyAlumnos[1]= estudiant2;
        listadoStaffyAlumnos[2]= estudiant3;
        listadoStaffyAlumnos[3]= estudiant4;
        listadoStaffyAlumnos[4]= staff1;
        listadoStaffyAlumnos[5]= staff2;
        listadoStaffyAlumnos[6]= staff3;
        listadoStaffyAlumnos[7]= staff4;

        for(int i=0; i< listadoStaffyAlumnos.length; i++) {
            System.out.println(listadoStaffyAlumnos[i]);
        }

        System.out.println("-----------------------EJE 5-----------------------------");

        int contStaff=0;

        for(int i=0; i< listadoStaffyAlumnos.length; i++) {
            if(listadoStaffyAlumnos[i] instanceof Staff)
                contStaff++;

        }

        System.out.println("Cantidad de Alumnos: "+ (listadoStaffyAlumnos.length-contStaff));
        System.out.println("Cantidad de Staff: "+ contStaff);

        System.out.println("-----------------------EJE 6-----------------------------");

        double sumaMensual=0;
        Estudiante a;

        for(int i=0; i< listadoStaffyAlumnos.length; i++) {
            if(listadoStaffyAlumnos[i] instanceof Estudiante) {
                a = (Estudiante) listadoStaffyAlumnos[i];
                sumaMensual = sumaMensual + a.getCuotaMensual();
            }
        }
        System.out.println("La suma final es: "sumaMensual);
    }
}

