import java.util.*;

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter passenger name: ");
        passengerName = scanner.nextLine();

        System.out.print("Enter bus number: ");
        busNo = scanner.nextInt();

        System.out.print("Enter date (dd-mm-yyyy): ");
        String dateInput = scanner.next();

        date = new Date(); // simplified
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses){
        int capacity = 0;

        for(Bus bus : buses){
            if(bus.getBusNo() == busNo){
                capacity = bus.getCapacity();
            }
        }

        int booked = 0;
        for(Booking b : bookings){
            if(b.busNo == busNo){
                booked++;
            }
        }

        return booked < capacity;
    }
}