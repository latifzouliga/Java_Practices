package randomPackage.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStream {


    public static void main(String[] args) throws IOException {

        FileOutputStream writer = new FileOutputStream("FileOutputStream.txt");

        writer.write(23);



    }
}
