package IO_and_NIO.serialization.programmer2;

import IO_and_NIO.serialization.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableEx {
    public static void main(String[] args) {
        Employee employee;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employee.bin"))){
            employee = (Employee) inputStream.readObject();
            System.out.println(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
