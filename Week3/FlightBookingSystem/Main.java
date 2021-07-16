package FlightBookingSystem;
import java.util.Scanner;

public class Main
{
    public static void main (String [] args)
    {
        FlightBooking THY = new THYBookingSystem(11);
        FlightBooking Pegasus = new PegasusBookingSystem(11);
        while (true) {
            System.out.println("Welcome ! Please press 1 for THY, press 2 for Pegasus, press any key for quit ");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            if(choice==1)
            {
                System.out.println("Welcome to THY flight booking system ");
                THY.getRezervation();
            }
            else if (choice==2)
            {
                System.out.println("Welcome to Pegasus flight booking system ");
                Pegasus.getRezervation();
            }
            else
            {
                return;
            }
        }


    }
}
