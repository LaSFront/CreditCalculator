public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int myPayment = service.calculator(1_000_000, 9.99, 3);
        System.out.println("Ежемесячный платеж " + myPayment + " руб.");
    }
}