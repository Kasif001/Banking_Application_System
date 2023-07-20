package banking;

public interface RBIBankInterface {
    public String depositMoney(int money);
    public String withdraw(int money, String password);
    public String checkBalance(String password);
    public Double calculateInterest(int time);
}
