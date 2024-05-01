package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

class LearnByteStream{
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\Danish Ahmad\\Desktop\\oracle\\src\\main\\java\\com\\oracle\\learn\\input.txt")) {
            // Use the inputStream to read from the file
            // For example:
            FileOutputStream fos = new FileOutputStream("src\\main\\java\\com\\oracle\\learn\\output.txt");
            int data;
            while ((data = inputStream.read()) != -1) {
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
