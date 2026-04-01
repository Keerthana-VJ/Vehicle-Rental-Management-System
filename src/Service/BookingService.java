package Service;


import Model.Booking;
import Model.Customer;
import Model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
    public static List<Booking> bookings=new ArrayList<>();

    public Booking bookVehicle(int bookingId, Customer c, Vehicle v, int days) {

        if (!v.isAvailable()) {
            System.out.println("Vehicle not available!");
            return null;
        }

        Booking booking = new Booking(bookingId, c, v, days);
        bookings.add(booking);

        v.setAvailable(false);
        System.out.println("Booking successful!");

        return booking;
    }

    public void returnVehicle(int bookingId) {
        for (Booking b : bookings) {
            if (b.getBookingId() == bookingId) {
                b.completeBooking();
                b.getVehicle().setAvailable(true);
                System.out.println("Vehicle returned successfully!");
                return;
            }
        }
    }
}
