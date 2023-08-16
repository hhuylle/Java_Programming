package Sunday_Review.week14.bankTask;

public class UseBank {

    public static void main(String[] args) {

        Bank bank = new Bank(1000,13124124);

        bank.withdraw(400); // had unchecked exception, so exception would occur during runtime

        System.out.println(bank.getBalance());

        System.out.println();

        Bank bank2 = new Bank(0,0);

        try {
            bank2.setBalance(-100);
        } catch (CanNotBeNegativeException e) {
            e.printStackTrace();
        }

        System.out.println("END");


    }
}
