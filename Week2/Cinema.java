import java.util.Scanner;

public class Cinema
{
    public static void main (String [] args)
    {

        System.out.println("Please enter your age: ");
        Scanner scan = new Scanner (System.in);
        int age = scan.nextInt();

        String Category1= "Horror";
        String Category2= "Romance";
        String Category3= "Comedy";
        String Category4= "Action";

        System.out.println("Please select category: ");
        System.out.println("" + Category1 + "\n" + Category2 + "\n" + Category3 + "\n" + Category4);
        Scanner scan1 = new Scanner(System.in);
        String category = scan1.next();

        float price=15;
        float price1;

        if (age<18)
        {
            price1=(price-(price/10));
            System.out.println("Normal price: " +price);
            System.out.println("Discounted price (age): " +price1);
        }
        else if(age>= 18 && age<=25)
        {
            price1=(price-(price/20));
            System.out.println("Normal price: " +price);
            System.out.println("Discounted price (age): " +price1);
        }
        else
        {
            price1=price;
            System.out.println("Price: " +price1);
        }

        if (category.equals("Horror"))
        {
            float price2=(price1-(price1/10));
            System.out.println("Discounted price (horror movie): " +price2);

        }

    }
}
