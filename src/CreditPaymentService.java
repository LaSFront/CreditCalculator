public class CreditPaymentService {
    public int calculator(int creditAmountRub, double creditRatePercent, int periodYear) {
        double exponentiation = Math.pow(1 + creditRatePercent / (12 * 100), periodYear * 12);
        return (int) (creditAmountRub * (creditRatePercent / (12 * 100) * exponentiation) /
                (exponentiation - 1));
    }
}
