package epsum.curso.accd.clase.main;

import epsum.curso.accd.clase.clases.AulaDeClase;
import epsum.curso.accd.clase.clases.Estudiante;

import java.util.ArrayList;

public class EstudianteMain {
    public static void main(String[] args) {

        ArrayList <Estudiante> lista = new ArrayList();

        Estudiante estudiante1 = new Estudiante("Axel", 18, 8.5);
        Estudiante estudiante2 = new Estudiante("Enrique", 20, 6);
        Estudiante estudiante3 = new Estudiante("Pepe", 22,10);
        Estudiante estudiante4 = new Estudiante("María", 19, 9.5);

        AulaDeClase aulaDeClase = new AulaDeClase(lista);

        aulaDeClase.añadirEstudiante(estudiante1);
        aulaDeClase.añadirEstudiante(estudiante2);
        aulaDeClase.añadirEstudiante(estudiante3);
        aulaDeClase.añadirEstudiante(estudiante4);

        System.out.println("-------------------------------------");
        aulaDeClase.mostrarLista();
        System.out.println("-------------------------------------");
        aulaDeClase.eliminarEstudiante("Enrique");
        System.out.println("-------------------------------------");
        aulaDeClase.mostrarLista();
        System.out.println("-------------------------------------");
        aulaDeClase.calcularNotaMedia();
        System.out.println("--------------------------------------");
        aulaDeClase.notaMasAlta();
    }
}
