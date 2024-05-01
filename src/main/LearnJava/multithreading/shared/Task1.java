package multithreading.shared;

public class Task1 implements Runnable{

    @Override
    public void run() {
        while(true){
        System.out.println("I am Task1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }
    
}
