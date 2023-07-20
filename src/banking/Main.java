package banking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hi User");
        System.out.println("Which bank you want to open your account.? Enter L to open in Lotak Bank Or enter S to open in SBI Bank");

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        RBIBankInterface bankAccount;

        System.out.println("Enter your first deposite and password");
        int initialDepsite = sc.nextInt();
        String password = sc.next();
        double accountNo = Math.abs(Math.random()*Math.pow(10,9));
        String accountNoStringVersion = String.valueOf(accountNo);

        if(str.equals("L") || str.equals("l")){

            bankAccount = new LotakBank(accountNoStringVersion,password,initialDepsite);

        }else {
            bankAccount = new SBIBank(accountNoStringVersion,password,initialDepsite);

        }

        String code = bankAccount.withdraw(70000,password);
        System.out.println(code);

        Double code2 = bankAccount.calculateInterest(3);
        System.out.println(code2);

    }
}