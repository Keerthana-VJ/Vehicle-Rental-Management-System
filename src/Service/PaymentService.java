package Service;

import Model.Booking;
import Model.Payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {
    public static List<Payment> payments=new ArrayList<>();
    public void makePayment(int paymentId, Booking booking) {

        double amount = booking.getDays() * booking.getVehicle().getPricePerDay();

        Payment payment = new Payment(paymentId, booking, amount);
        payments.add(payment);

        System.out.println("Payment Done: ₹" + amount);
    }
}
