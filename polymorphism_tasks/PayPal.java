class PayPal extends PaymentMethod {
    void validate() { System.out.println("Validating PayPal account..."); }
    void transact() { System.out.println("Transaction via PayPal complete."); }
}
