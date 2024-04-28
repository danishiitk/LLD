package proxy;

public class App {
    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("sample.jpg");
        proxyImage.display();
        proxyImage.display();
    }
}
