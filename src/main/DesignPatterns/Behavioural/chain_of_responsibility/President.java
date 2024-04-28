package chain_of_responsibility;

public class President extends AbstractHandler{
    @Override
    public void handleRequest(PurchaseRequest request){
        if(request.getAmount()>2000){
            System.out.println("Handled by President");
        } else {
            System.out.println("Purchase Request can not be approved");
        }
    }
}
