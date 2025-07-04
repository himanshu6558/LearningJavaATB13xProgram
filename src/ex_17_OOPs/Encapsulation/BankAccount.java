package ex_17_OOPs.Encapsulation;

public class BankAccount {
    private int accountNo = 45345435;
    private double bankBalance = 4346.44;
    int contactNo;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo, String user) {
        if(user.equalsIgnoreCase("admin"))
        this.accountNo = accountNo;
        else
            System.out.println("Invalid creds");
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance, String user) {
        if(user.equalsIgnoreCase("admin"))
        this.bankBalance = bankBalance;
        else
            System.out.println("Invalid creds");
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }
}
