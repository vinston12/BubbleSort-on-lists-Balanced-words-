package JavaAbstractClasses.Level2;

public class BankA extends Bank{
    @Override
    int getBalance() {
        return 100;
    }

    public static void main(String[] args) {

        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println(bankA.getBalance());
        System.out.println(bankB.getBalance());
        System.out.println(bankC.getBalance());
    }
}
