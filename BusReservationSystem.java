import java.util.*;

public class BusReservationSystem {
    public static void main(String[] args){

        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, false, 50));
        buses.add(new Bus(3, true, 40));

        Scanner scanner = new Scanner(System.in);

        int userOpt = 1;

        while(userOpt == 1){
            System.out.println("\n1. Book Ticket\n2. Exit");
            userOpt = scanner.nextInt();

            if(userOpt == 1){
                Booking booking = new Booking();

                if(booking.isAvailable(bookings, buses)){
                    bookings.add(booking);
                    System.out.println("Booking Confirmed ✅");
                } else {
                    System.out.println("Bus Full ❌ Try another bus.");
                }
            }
        }

        System.out.println("Thank you!");
    }
}