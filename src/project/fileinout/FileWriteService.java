package project.fileinout;

import project.utils.Constants;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {

    public String writeInFile (String fileName, String text){

        try {
            FileOutputStream fOut = new FileOutputStream(Constants.BASE_PATH + fileName + ".txt");
            fOut.write(text.getBytes());
            fOut.close();
            return "Success!";
        } catch (IOException e){
            return "Error! Something gone wrong: " + e;
        }

    }
}
