package IO_and_NIO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("У лукоморья дуб зеленый")) {
            int temp;
            while ((temp = fileReader.read()) != -1){
                System.out.print((char) temp);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
