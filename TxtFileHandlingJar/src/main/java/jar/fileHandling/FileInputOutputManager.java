package jar.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileInputOutputManager {
    FileHandlingInput fileHandlingInput = new FileHandlingInput();
    FileHandlingOutput fileHandlingOutput = new FileHandlingOutput();

    public File createFile(String content, String name) throws IOException {
        String path = "./";
        return fileHandlingInput.createFile(path, name, content);
    }

    public File createFile(String pathOfFile, String name, String content) throws IOException {
        return fileHandlingInput.createFile(pathOfFile, name, content);
    }

    public String contentInFile(String pathOfFile) throws IOException {
        return fileHandlingOutput.contentInFile(pathOfFile);
    }
}
