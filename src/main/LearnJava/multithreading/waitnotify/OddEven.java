package multithreading.waitnotify;

public class OddEven {
    public static void main(String[] args) {
        int start = 3;
        int n = 10;
        OddEvenPrinter sharedResource = new OddEvenPrinter(start, n);
        Thread oddThread = new Thread(() -> {
            try {
                sharedResource.printOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread evenThread = new Thread(() -> {
            try {
                sharedResource.printEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        oddThread.start();
        evenThread.start();
    }
}
