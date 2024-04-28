package chain_of_responsibility;

public class Director extends AbstractHandler{

    @Override
    public void handleRequest(PurchaseRequest request) {
        if(request.getAmount() <= 1000)
            System.out.println("Handled by Director");
        else if(nexthandler != null){
            nexthandler.handleRequest(request);
        }
    }
}
