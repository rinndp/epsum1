package epsum.curso.accd.alumnosregistros.main;

import epsum.curso.accd.alumnosregistros.clases.ArrayAlumnos;

import java.io.*;

public class AlumnosMain {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\alumnosregistros\\informacionAlumnos.txt");

        ArrayAlumnos alumnos = new ArrayAlumnos();
        alumnos.setAlumnos(file);
        alumnos.mostrarListaAlumnos();
        System.out.println("----------------------------------------------");
        alumnos.mostrarNotaMasAlta();
        System.out.println("----------------------------------------------");
        alumnos.guardarAlumnosAprobados();
        System.out.println("----------------------------------------------");
        try {
            alumnos.mostrarListaAlumnosTXT(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
