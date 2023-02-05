 public class BankAccount {
    private double balance;
    public BankAccount(){ balance = 0.0;}
    public void deposit(double amount) throws Exception{
        if(amount<=0){
            throw new Exception(" Amount must be greater than zero");
        }
        double oldBalance = balance;
        balance -= amount;
        assert balance > oldBalance;
    }
    public double getBalance(){
        return balance;

    }

    public static void main(String[] args) throws Exception{
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.getBalance();
        System.out.println(account.getBalance());
    }
}
