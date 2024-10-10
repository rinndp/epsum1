package epsum.curso.accd.alumnosregistros.clases;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayAlumnos {
    ArrayList<Alumno> arrayAlumnos;

    public ArrayAlumnos() {}

    public ArrayList<Alumno> getAlumnos() {
        return arrayAlumnos;
    }

    public void setAlumnos(File file) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            String delimitador = ",";

            while (((linea = br.readLine()) != null)) {
                String [] atributoAlumno = new String[4];
                atributoAlumno = linea.split(delimitador);

                Alumno alumno = new Alumno();

                alumno.setNombre(atributoAlumno[0]);
                alumno.setEdad(Integer.parseInt(atributoAlumno[1]));
                alumno.setCiclo(atributoAlumno[2]);
                alumno.setNotaMedia(Double.parseDouble(atributoAlumno[3]));

                alumnos.add(alumno);
            }

            br.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.arrayAlumnos = alumnos;
    }

    public void mostrarListaAlumnos() {
        for (Alumno alumno : arrayAlumnos) {
            System.out.println(alumno.toString());
        }
    }

    public void mostrarListaAlumnosTXT (File file) throws FileNotFoundException {
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while (((linea = br.readLine())) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void mostrarNotaMasAlta () {
        ArrayList<Double> notasEstudiantes = new ArrayList<>();
        for (Alumno alumno : this.arrayAlumnos) {
            notasEstudiantes.add(alumno.getNotaMedia());
        }
        System.out.println("La nota media más alta es un: "+ Collections.max(notasEstudiantes));
    }

    public void guardarAlumnosAprobados () {
        FileWriter ficheroAlumnosAporbados = null;
        try {

            ficheroAlumnosAporbados = new FileWriter("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\alumnosregistros\\alumnosAporbados.txt");

            for (Alumno alumno : this.arrayAlumnos) {
                if (alumno.getNotaMedia() >= 5) {
                    ficheroAlumnosAporbados.write(alumno.nombre + "," + alumno.getEdad() + "," + alumno.getCiclo() + "," + alumno.getNotaMedia() + "\n");
                }
            }

            ficheroAlumnosAporbados.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Se ha creado el archivo.txt con los alumnos aprobados");
    }
}
