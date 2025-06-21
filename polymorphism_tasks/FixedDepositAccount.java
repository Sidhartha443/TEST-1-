class FixedDepositAccount extends Account {
    FixedDepositAccount(double balance) { super(balance); }
    double calculateInterest() { return balance * 0.06; }
}
