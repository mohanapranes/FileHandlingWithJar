package task4.grootan;

import jar.fileHandling.FileInputOutputManager;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputOutputManager fileInputOutputManager = new FileInputOutputManager();

        File file = fileInputOutputManager.createFile("mohanapraneswaran", "file.txt");

        String pathOfFile = "/Users/grootan/";
        File file2 = fileInputOutputManager.createFile(pathOfFile, "file2.txt", "hai hello");

        System.out.println(fileInputOutputManager.contentInFile(pathOfFile + "file2.txt"));
    }
}