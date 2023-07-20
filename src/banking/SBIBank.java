package banking;

public class SBIBank implements RBIBankInterface{

    private String accNo;
    private String passCode;
    private double balance;
    private double rateOfInterest = 6;
    private double minimumBalance = 500;

    public SBIBank(String accNo, String passCode, double balance) {
        this.accNo = accNo;
        this.passCode = passCode;
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
        if(password.equals(this.passCode)){
            if(balance-minimumBalance>=money){
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
        if(this.passCode.equals(password)){
            return "The current Balance is :"+balance;
        }else {
            return "Please enter valid password";
        }
    }

    public Double calculateInterest(int time) {
        Double simpleInterst = (balance* time* rateOfInterest)/100;
        return simpleInterst;
    }
}
