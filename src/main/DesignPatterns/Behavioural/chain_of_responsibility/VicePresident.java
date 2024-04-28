package chain_of_responsibility;

public class VicePresident extends AbstractHandler{
    @Override
    public void handleRequest(PurchaseRequest request) {
        if(request.getAmount() > 1000 && request.getAmount()<=2000)
            System.out.println("Handled by VP");
        else if(nexthandler != null){
            nexthandler.handleRequest(request);
        }
    }
}
