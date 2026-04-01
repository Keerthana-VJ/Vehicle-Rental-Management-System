package Model;

public class Payment {
    private int paymentId;
    private Booking booking;
    private double amount;
    private PaymentStatus status;

    public Payment(int paymentId, Booking booking, double amount) {
        this.paymentId = paymentId;
        this.booking = booking;
        this.amount = amount;
        this.status = PaymentStatus.PAID;
    }

    public double getAmount() {
        return amount;
    }
}
