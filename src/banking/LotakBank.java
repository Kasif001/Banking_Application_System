package banking;

public class LotakBank implements RBIBankInterface{

    private String accountNo;
    private String password;
    private double balance;
    private double rateOfInterest = 7.5;

    public LotakBank(String accountNo, String password, double balance) {
        this.accountNo = accountNo;
        this.password = password;
        this.balance = balance;
    }

    public String depositMoney(int money) {

        if (money > 0) {
            balance = balance + money;
            return "Money : " + money + " has been add to your account. Total Balance is : " + balance;
        }else {
            return "Please type valid keys";
        }
    }
    public String withdraw(int money, String password) {
        if(password.equals(this.password)){
            if(balance>=money){
                balance-=money;
                return "Money :"+money+" has been withdraw successfully. Now current balance is "+balance;
            }else{
                return "Insufficient Balance";
            }
        }else {
            return "Please enter valid Password";
        }
    }

    public String checkBalance(String password) {
        if(this.password.equals(password)){
            return "The current Balance is :"+balance;
        }else {
            return "Please enter valid password";
        }
    }

    public Double calculateInterest(int time) {
        Double simpleInterest = (balance*time*rateOfInterest)/100;
        return simpleInterest;
    }
}
