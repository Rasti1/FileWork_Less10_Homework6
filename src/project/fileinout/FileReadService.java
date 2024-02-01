package project.fileinout;


import project.utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadService {
    public String readFromFile(String fName) {

        StringBuilder content = new StringBuilder();

        try (FileInputStream fIn = new FileInputStream(Constants.BASE_PATH + fName + ".txt")) {
            int i;
            while ((i = fIn.read()) != -1) {
                content.append((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error! Something gone wrong: " + e);
        }
        return content.toString();

    }
}

