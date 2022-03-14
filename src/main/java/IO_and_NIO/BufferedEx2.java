package IO_and_NIO;

import java.io.*;

public class BufferedEx2 {
    public static void main(String[] args) {
        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream("/Users/gost/Desktop/IMG_9052.jpg"));
             BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("IMG_9052.jpg"))) {
            int temp;
            while ((temp = input.read()) != -1) {
                output.write(temp);
            }
            System.out.println("Копирование завершено");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
