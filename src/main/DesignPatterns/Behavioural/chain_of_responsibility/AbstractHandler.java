package chain_of_responsibility;

public abstract class AbstractHandler implements Handler{
    Handler nexthandler;
    @Override
    public void setNextHandler(Handler nexthandler){
        this.nexthandler = nexthandler;
    }
}
