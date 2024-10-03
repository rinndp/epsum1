package epsum.curso.accd.clase.clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AulaDeClase {
    private ArrayList<Estudiante> lista;

    public AulaDeClase() {}

    public AulaDeClase(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }

    public void añadirEstudiante(Estudiante estudiante) {
        lista.add(estudiante);
        System.out.println("Se ha añadido un estudiante: "+ estudiante.getNombre());
    }

    public void eliminarEstudiante(String nombreIntroducido) {
        Iterator<Estudiante> iterator = this.lista.iterator();
        boolean salir = false;
        while (!salir) {
            Estudiante estudiante = iterator.next();
                if (nombreIntroducido.equalsIgnoreCase(estudiante.getNombre())) {
                    iterator.remove();
                    System.out.println("Se ha eliminado un estudiante: " + estudiante.getNombre());
                    salir = true;
                }
        }
    }

    public void mostrarLista() {
        int i = 1;
        for (Estudiante estudiante : this.lista) {
            System.out.println("Estudiante "+i +"\n" + estudiante +"\n");
            i++;
        }
    }

    public void calcularNotaMedia () {
        double notaMedia = 0;
        double sumaNota = 0;
        int cont = 0;
        for (Estudiante estudiante : this.lista) {
            sumaNota += estudiante.getNotaFinal();
            cont++;
        }
        notaMedia = sumaNota / cont;
        System.out.println("la nota media es de un: "+String.format("%.2f",notaMedia));
    }

    public void notaMasAlta () {
        ArrayList<Double> notasEstudiantes = new ArrayList<>();
        for (Estudiante estudiante : this.lista) {
            notasEstudiantes.add(estudiante.getNotaFinal());
        }
        System.out.println("La nota más alta es un: "+ Collections.max(notasEstudiantes));
    }
}
