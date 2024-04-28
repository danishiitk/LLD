package adapter;

public class OldPrinter implements LegacyPrinter{
    @Override
    public void print(String text) {
        System.out.println("Printing using legacy printer: "+text);
    }
}
