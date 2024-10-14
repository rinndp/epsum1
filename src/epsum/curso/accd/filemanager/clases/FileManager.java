package epsum.curso.accd.filemanager.clases;

import java.io.*;
import java.util.ArrayList;

public class FileManager {
    String ruta;
    ArrayList<Figura> arrayFiguras;

    public FileManager() {}

    public FileManager(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public boolean exists() {
        File file = new File(ruta);
        if (file.exists())
            return true;
        else
            return false;
    }

    public void ImportFromFile () {
        File file = new File(ruta);
        ArrayList <Figura> arrayFigurasAux = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;
            String delimitador = " ";

            while ((linea = bufferedReader.readLine()) != null) {
                String [] atributoFigura;
                atributoFigura = linea.split(delimitador);

                if (atributoFigura[0].equalsIgnoreCase("rectangulo")) {
                    Rectangulo rectangulo = new Rectangulo();

                    rectangulo.setBase(Double.parseDouble(atributoFigura[1]));
                    rectangulo.setAltura(Double.parseDouble(atributoFigura[3]));


                    try {
                        rectangulo.setColor(atributoFigura[5]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.err.println("FIGURA NO VALIDA, FALTA EL COLOR EN UNA FIGURA 'RECTÁNGULO'");
                    }


                    arrayFigurasAux.add(rectangulo);

                } if (atributoFigura[0].equalsIgnoreCase("circulo")) {
                    Circulo circulo = new Circulo();

                    circulo.setRadio(Double.parseDouble(atributoFigura[1]));

                    try {
                        circulo.setColor(atributoFigura[4]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.err.println("FIGURA NO VALIDA, FALTA EL COLOR EN UNA FIGURA 'CÍRCULO'");
                    }

                    arrayFigurasAux.add(circulo);

                } if (atributoFigura[0].equalsIgnoreCase("cuadrado")) {
                    Cuadrado cuadrado = new Cuadrado();

                    cuadrado.setLado(Double.parseDouble(atributoFigura[1]));

                    try {
                        cuadrado.setColor(atributoFigura[3]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.err.println("FIGURA NO VALIDA, FALTA EL COLOR EN UNA FIGURA 'CUARDADO'");
                    }

                    arrayFigurasAux.add(cuadrado);
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Archivo importado con ÉXITO");
        this.arrayFiguras = arrayFigurasAux;
    }

    public void GetDataFromFile () {
        File file = new File(ruta);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String linea;

            while((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveDataToFile() {
        File file = new File("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\filemanager\\resultados.txt");

        if (file.exists()) {}
        else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(arrayFiguras.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("El contenido se ha guardado CORRECTAMENTE en el archivo externo");
    }

    public void showInformation () {
        for (Figura figura : arrayFiguras) {
            System.out.println(figura.toString());
        }
    }
}
