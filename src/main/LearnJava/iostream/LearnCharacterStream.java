package iostream;

import java.io.FileReader;
import java.io.FileWriter;

class LearnCharacterStream{
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("C:\\Users\\Danish Ahmad\\Desktop\\oracle\\src\\main\\java\\com\\oracle\\learn\\input.txt")) {
            // Use the inputStream to read from the file
            // For example:
            FileWriter fos = new FileWriter("src\\main\\java\\com\\oracle\\learn\\output.txt");
            int data;
            while ((data = fileReader.read()) != -1) {
                // Process the data as needed
               // System.out.print((char) data); // Assuming it's text data
               fos.write(data);
            }
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
