package adapter;

public class App {
    public static void main(String[] args) {
        //create old printer
        LegacyPrinter legacyPrinter = new OldPrinter();
        //Create the adapter and pass old to the adapter
        NewPrinter newPrinter = new LegacyPrinterAdapter(legacyPrinter);
        newPrinter.printText("Hello");
    }
}
