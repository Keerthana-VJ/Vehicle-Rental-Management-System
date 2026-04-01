package Model;

public class Booking {
    private int bookingId;
    private Customer customer;
    private Vehicle vehicle;
    private int days;
    private BookingStatus status;

    public Booking(int bookingId, Customer customer, Vehicle vehicle, int days) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
        this.status = BookingStatus.ACTIVE;
    }

    public int getBookingId() { return bookingId; }
    public Vehicle getVehicle() { return vehicle; }
    public int getDays() { return days; }

    public void completeBooking() {
        this.status = BookingStatus.COMPLETED;
    }
}
