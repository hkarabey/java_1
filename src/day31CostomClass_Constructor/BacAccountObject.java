package day31CostomClass_Constructor;

public class BacAccountObject {

    public static void main(String[] args) {

        BackAccount account1=new BackAccount();
        account1.setInfo("ahmet oz",1231275639);

        System.out.println(account1);

        account1.deposit(100);
        account1.checkBalance();
        account1.withdraw(50);
        account1.checkBalance();
        System.out.println("--------------");

        BackAccount account2=new BackAccount();
        account2.setInfo("halil karabey",1390603521);

        System.out.println(account2);
        account2.checkBalance();

        account2.deposit(10000);
        account2.checkBalance();
        account2.withdraw(5000);
        account2.checkBalance();


    }


}
