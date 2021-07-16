package FlightBookingSystem;

import java.util.Random;
import java.util.Scanner;

public class PegasusBookingSystem extends FlightBooking
{
    public PegasusBookingSystem(int seatNumber)
    {
        super(seatNumber);
    }

    @Override
    public void getRezervation()
    {
        System.out.println("\nFor business class please press 1 \nFor economy class please press 2");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if (choice==1)
        {
            BusinessClass();
        }
        else if(choice==2)
        {
            EconomyClass();
        }
        else
        {
            System.out.println("Error! ");
        }
    }
    public void BusinessClass()
    {
        if(isBusinessFull()==true)
        {
            System.out.println("Sorry, business class is full");
        }
        else
        {
            System.out.println("Please select your seat number. \n Available seats: ");
            for (int i=1; i<=5; i++)
            {
                if (seats[i]== false)
                {
                    System.out.println(" " +i);
                }
            }
            Scanner scan = new Scanner(System.in);
            int seatChoice = scan.nextInt();
            System.out.println( "Seat number " + seatChoice +  " is booked for you");
            seats[seatChoice]=true;
        }
    }

    public void EconomyClass()
    {
        if(isEconomyFull()==true)
        {
            System.out.println("Sorry, economy class is full");
        }

        else
        {
            Random random = new Random();

            int randomSeat = random.nextInt(seats.length);
            if( seats[randomSeat]==true || randomSeat>seats.length || randomSeat<6 )
            {
                randomSeat = random.nextInt(seats.length+1);
            }

            System.out.println( "Seat number " + randomSeat +  " is booked for you");
            seats[randomSeat]=true;
        }

    }

}
