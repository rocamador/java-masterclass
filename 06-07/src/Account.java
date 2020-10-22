public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {
        //this("0000",0,"Sample name","Sample email address", "sample phone number");
        System.out.println("Empty constructor for Account");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber ) {

        System.out.println("Account constructor with params called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String accountNumber) {
        this.number = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return this.customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public double deposit(int funds) {
        this.balance += funds;
        System.out.println("Current balance is: " + this.balance);
        return this.balance;
    }

    public double withdraw(int funds) {
        if (this.balance > funds)
            this.balance -= funds;
        else
            System.out.println("Insufficient funds.");
        System.out.println("Current balance is: " + this.balance);
        return this.balance;
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(1000);
        account.setNumber("345");
        account.setCustomerName("Pedro Santos");
        account.deposit(40);
        account.withdraw(1100);
        account.withdraw(100);

        Account acc1 = new Account("234",15000,"John Doe","xxx@xxx.net","+351222222222");
        System.out.printf("- '%s' account has balance= %s", acc1.getCustomerName(), acc1.balance );

    }




}
