package jar.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FileHandlingInput {
    public File createFile(String pathOfFile, String name, String content) throws IOException {
        File file = new File(pathOfFile + name);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(content);
        fileWriter.flush();
        fileWriter.close();

        return file;
    }

}