import utils.ComUtilsService;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello word");
        //TODO: Put your code here
        File file = new File("testMain");
        try {
            file.createNewFile();
            ComUtilsService comUtilsService = new ComUtilsService(new FileInputStream(file), new FileOutputStream(file));
            comUtilsService.writeTest();
            System.out.println(comUtilsService.readTest());
        }
        catch(IOException e)
        {
            System.out.println("Error Found during Operation:" + e.getMessage());
            e.printStackTrace();
        }
    }

}