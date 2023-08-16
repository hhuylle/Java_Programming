package day18_garbageCollection;

public class TestBankAccountObject {

    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Harry Le",123456789);

        System.out.println(obj1);

        obj1.deposit(5000);
        obj1.checkBalance();

        obj1.withdraw(2000);
        obj1.checkBalance();

        obj1.deposit(-5000);
        obj1.checkBalance();

        obj1.withdraw(5000);
        obj1.checkBalance();

        System.out.println("-------------------------------------------------------");

        BankAccount account1 = new BankAccount();

        BankAccount account2 = new BankAccount();

        account1.setInfo("Jenny Ngo",987654321);

        account2.setInfo("Hanna Cao",456123789);

        account1.deposit(5000);
        account2.deposit(10000);

        System.out.println(account1);
        System.out.println(account2);

        account1.withdraw(4995);

        System.out.println(account1);
        System.out.println(account2);

        account1.checkBalance();








    }
}
