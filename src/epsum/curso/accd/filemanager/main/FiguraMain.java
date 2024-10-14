package epsum.curso.accd.filemanager.main;

import epsum.curso.accd.filemanager.clases.FileManager;

public class FiguraMain {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\filemanager\\info-figuras.txt");

        System.out.println(fileManager.exists());

        System.out.println("------------------------------------------------------------");

        fileManager.GetDataFromFile();

        System.out.println("------------------------------------------------------------");

        fileManager.ImportFromFile();

        System.out.println("------------------------------------------------------------");

        fileManager.showInformation();

        System.out.println("------------------------------------------------------------");

        fileManager.saveDataToFile();
    }
}
