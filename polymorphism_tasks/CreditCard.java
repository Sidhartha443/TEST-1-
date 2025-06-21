class CreditCard extends PaymentMethod {
    void validate() { System.out.println("Validating Credit Card..."); }
    void transact() { System.out.println("Transaction via Credit Card complete."); }
}
