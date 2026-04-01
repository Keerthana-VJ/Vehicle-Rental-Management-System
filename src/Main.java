import Service.*;
import Model.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VehicleService vs = new VehicleService();
        CustomerService cs = new CustomerService();
        BookingService bs = new BookingService();
        PaymentService ps = new PaymentService();

        // Sample Data
        vs.addVehicle(new Vehicle(1, "Honda City", "Car", 2000));
        vs.addVehicle(new Vehicle(2, "Yamaha R15", "Bike", 800));

        cs.addCustomer(new Customer(101, "Keerthana", "9999999999"));

        while (true) {
            System.out.println("\n1. Show Vehicles");
            System.out.println("2. Book Vehicle");
            System.out.println("3. Return Vehicle");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    vs.showAvailableVehicles();
                    break;

                case 2:
                    System.out.print("Enter Vehicle ID: ");
                    int vid = sc.nextInt();

                    Vehicle v = vs.getVehicle(vid);
                    Customer c = cs.getCustomer(101);

                    Booking booking = bs.bookVehicle(1, c, v, 3);

                    if (booking != null) {
                        ps.makePayment(1, booking);
                    }
                    break;

                case 3:
                    System.out.print("Enter Booking ID: ");
                    int bid = sc.nextInt();
                    bs.returnVehicle(bid);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}