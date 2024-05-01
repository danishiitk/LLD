package multithreading.waitnotify;

public class OddEvenPrinter {
    int max;
    static int number;
    boolean isOddTurn = true;
    OddEvenPrinter(int start, int max){
        this.number = start;
        this.max = max;
    }
    public synchronized void printOdd() throws InterruptedException {
        while(number<max) {
            while (!isOddTurn) {
                wait();
            }
            System.out.println("Printed by: "+Thread.currentThread().getName()+ " "+number);
            number += 1;
            isOddTurn = false;
            notify();
        }
    }
    public synchronized void printEven() throws InterruptedException {
        while(number<=max){
            while(isOddTurn){
                wait();
            }
            System.out.println("Printed by: "+Thread.currentThread().getName()+ " "+number);
            number+=1;
            isOddTurn = true;
            notify();
        }
    }
}
