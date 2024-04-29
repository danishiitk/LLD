import model.AccountStatus;

public abstract class Account {
    String userName;
    String password;
    AccountStatus accountStatus;
    public boolean resetPassword(){
        System.out.println("Resetting password");
        return true;
    }
}
