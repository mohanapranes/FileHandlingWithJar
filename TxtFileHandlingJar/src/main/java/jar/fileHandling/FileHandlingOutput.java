package jar.fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FileHandlingOutput {
    public String contentInFile(String filePath) throws IOException {
        File file = new File(filePath);
        StringBuilder output = new StringBuilder();
        FileReader fileReader;
        fileReader = new FileReader(file);
        int itr;
        while ((itr = fileReader.read()) != -1)
            output.append((char) itr);
        return output.toString();
    }
}
