package IO_and_NIO.serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {
    public static void main(String[] args) {
        Employee employee = new Employee("Андрей","Сургиневич","Java Developer",
                23, 1500, new Car("BMW f10", "black"));
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employee.bin"))){
            outputStream.writeObject(employee);
            System.out.println("done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
