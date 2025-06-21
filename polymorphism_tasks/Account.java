class Account {
    double balance;
    Account(double balance) { this.balance = balance; }
    double calculateInterest() { return balance * 0.01; }
}
