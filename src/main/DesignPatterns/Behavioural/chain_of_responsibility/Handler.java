package chain_of_responsibility;

public interface Handler {
    public void setNextHandler(Handler handler);
    public void handleRequest(PurchaseRequest request);
}
