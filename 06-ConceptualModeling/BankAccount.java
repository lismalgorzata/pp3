public class BankAccount{
    private String owner;
    private String AccountNr;
    private String login;
    private String password;
    private double balance;
    private String type;

    public BankAccount(String owner, String accountNr, String login, String password, double balance, String type) {
        this.owner = owner;
        AccountNr = accountNr;
        this.login = login;
        this.password = password;
        this.balance = balance;
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccountNr() {
        return AccountNr;
    }

    public void setAccountNr(String accountNr) {
        AccountNr = accountNr;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double Withdraw(double sum) {
        if (sum<this.balance && sum<500) {
            this.balance = this.balance-sum;
        }
        return this.balance;
    }

    public double Deposit(int sum) {
        return (this.balance + sum);
    }

    public void DisplayBalance(){
        System.out.println("Balance: "+ this.balance);
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount("M.Lis", "1234567890", "abc123", "drzewo13", 1200, "studenckie");

        ba.Deposit(500);
        ba.DisplayBalance();
        ba.Deposit(200);
        ba.DisplayBalance();
        ba.Withdraw(300);
        ba.DisplayBalance();

    }






}