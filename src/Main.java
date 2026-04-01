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
=======
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
>>>>>>> 50cd48814dac2f97740c983b91d281f95fe862ff
        }
    }
}