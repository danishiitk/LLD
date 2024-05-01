package iostream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

class BufferedStream{
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // Use the inputStream to read from the file
            // For example:
            FileWriter fos = new FileWriter("src\\main\\java\\com\\oracle\\learn\\output.txt");
            String consoleInput = reader.readLine(); //Input from the console
            fos.write(consoleInput); //write in output file
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
