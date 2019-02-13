package utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ComUtilsService {
    private ComUtils comUtils;

    public ComUtilsService(InputStream inputStream, OutputStream outputStream) throws IOException {
        comUtils = new ComUtils(inputStream, outputStream);
    }

    public void writeTest() {
        //TODO: put your code here
        try {
            comUtils.write_string("Albert i Enric");
            comUtils.write_int32(2);
            comUtils.write_string_variable(2,"Estem molt contents :)");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readTest() {
        String result = "";
        //TODO: put your code here
        try {
            result += comUtils.read_string()+"\n";
            result += comUtils.read_int32()+"\n";
            result += comUtils.read_string_variable(2);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }



}
