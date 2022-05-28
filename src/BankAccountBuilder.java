public class BankAccountBuilder {
    private String owner;
    private String place;
    private double interest;
    private double balance;

    public BankAccountBuilder setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public BankAccountBuilder setPlace(String place) {
        this.place = place;
        return this;
    }

    public BankAccountBuilder setInterest(double interest) {
        this.interest = interest;
        return this;
    }

    public BankAccountBuilder setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public BankAccount createBankAccount() {
        return new BankAccount(owner, place, interest, balance);
    }
}