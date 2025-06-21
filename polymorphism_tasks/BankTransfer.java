class BankTransfer extends PaymentMethod {
    void validate() { System.out.println("Validating Bank Transfer..."); }
    void transact() { System.out.println("Transaction via Bank Transfer complete."); }
}
