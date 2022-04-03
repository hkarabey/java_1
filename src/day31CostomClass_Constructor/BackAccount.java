package day31CostomClass_Constructor;

public class BackAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;


    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BackAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=$" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("your avaliable balance is: "+balance);
    }

    public void deposit(double amount){

        if(amount<=0){
            System.out.println("depositing amount can not be zero or negatif");
        return;
        }

        balance+=amount;
    }

    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("your amount does not be grater than balance");
            return;
        }

        if (amount<=0){
            System.out.println("amount does not be zero or negatıf");
            return;
        }
        balance-=amount;

    }
}
