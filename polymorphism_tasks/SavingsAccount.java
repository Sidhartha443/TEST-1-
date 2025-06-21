class SavingsAccount extends Account {
    SavingsAccount(double balance) { super(balance); }
    double calculateInterest() { return balance * 0.03; }
}
