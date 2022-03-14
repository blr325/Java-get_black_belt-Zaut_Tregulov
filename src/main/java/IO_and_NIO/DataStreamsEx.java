package IO_and_NIO;

import java.io.*;

public class DataStreamsEx {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_file.bin", true));
             DataInputStream inputStream = new DataInputStream(new FileInputStream("my_file.bin"))) {
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(34999);
            outputStream.writeInt(1232134);
            outputStream.writeLong(234234325235L);
            outputStream.writeFloat(3.14F);
            outputStream.writeDouble(200.234);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
