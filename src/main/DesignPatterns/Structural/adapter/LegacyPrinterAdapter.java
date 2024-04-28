package adapter;

public class LegacyPrinterAdapter implements NewPrinter{
    LegacyPrinter legacyPrinter;
    public LegacyPrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }
    @Override
    public void printText(String text){
        legacyPrinter.print(text);
    }
}
