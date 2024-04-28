package chain_of_responsibility;

public class App {
    public static void main(String[] args) {
        //Construct the chain
        Handler director = new Director();
        Handler vp = new VicePresident();
        Handler presi = new President();
        director.setNextHandler(vp);
        vp.setNextHandler(presi);

        //Create Purchase Request
        PurchaseRequest purchaseRequest = new PurchaseRequest(20000);

        director.handleRequest(purchaseRequest);
    }
}
