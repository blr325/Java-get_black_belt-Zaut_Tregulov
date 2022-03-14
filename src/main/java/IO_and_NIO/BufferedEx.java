package IO_and_NIO;

import java.io.*;

public class BufferedEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("У лукоморья дуб зеленый"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("У лукоморья дуб зеленый(копия)", true))) {
            String line;
            while ((line = reader.readLine()) != null){
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Копирование завершено");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
