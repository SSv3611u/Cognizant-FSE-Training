import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        try {
            StringBuffer data = new StringBuffer();
            data.append("File data is written using StringBuffer");

            FileWriter writer = new FileWriter("output.txt");
            writer.write(data.toString());
            writer.close();

            System.out.println("Data written successfully");
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}
