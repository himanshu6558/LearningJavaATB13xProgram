package ex_17_OOPs.Encapsulation;

public class Encapsulation1 {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        System.out.println("Previous data");
        System.out.println(bankAccount.getBankBalance());
        System.out.println(bankAccount.getAccountNo());
        System.out.println(bankAccount.getContactNo());


        System.out.println("Updated data");
        bankAccount.setBankBalance(5435,"him");
        bankAccount.setAccountNo(5434,"admin");
        bankAccount.setContactNo(4534536);
        System.out.println(bankAccount.getBankBalance());
        System.out.println(bankAccount.getAccountNo());
        System.out.println(bankAccount.getContactNo());

    }
}
