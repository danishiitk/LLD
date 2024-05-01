package multithreading.shared;

public class SharedResource {
    private int count = 0;
    public int getCount(){
        return this.count;
    }
    public synchronized void increment(){
        count+=1;
    }
}
