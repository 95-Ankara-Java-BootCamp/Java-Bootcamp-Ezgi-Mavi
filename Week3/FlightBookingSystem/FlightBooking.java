package FlightBookingSystem;

public abstract class FlightBooking
{
     int seatNumber;
     boolean[] seats;

    public FlightBooking(int seatNumber) {
        if (seatNumber<10)
        {
            System.out.println("Seat number should be 10 at least \n Seat number has been set to 10 ");
            this.seatNumber=10;
        }
        else
        {
            this.seatNumber = seatNumber;
        }

        this.seats= new boolean[this.seatNumber];
    }
    public void FlightBookingSystem()
    {
        setSeatNumber(10);
    }

    public boolean isBusinessFull ()
    {
        for (int i=1; i<=5; i++)
        {
          if (seats[i]==false)
          {
           System.out.println("Business class seats are available");
           return false;
          }

        }
        System.out.println("Sorry, business class seats are full..");
        return true;
    }

    public boolean isEconomyFull ()
    {
       for (int i=6; i<=seats.length; i++)
       {
           if (seats[i]==false)
           {
               System.out.println("Economy class seats are available");
               return false;
           }
       }
        System.out.println("Sorry, economy class seats are full..");
        return true;
    }

    public boolean isFlightFull ()
    {
       if( isBusinessFull()==true && isEconomyFull()==true)
       {
           System.out.println("Sorry, flight is full..");
           return true;
       }
        System.out.println("Flight is available");
        return false;
    }

    public abstract void getRezervation();

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

}
