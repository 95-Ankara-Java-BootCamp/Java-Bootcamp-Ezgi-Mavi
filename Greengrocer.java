import java.util.Scanner;
public class Greengrocer
{
    public static void main (String [] args)
    {
        System.out.println("Armut kaç kilo? ");
        Scanner a = new Scanner(System.in);
        int armut = a.nextInt();

        System.out.println("Elma kaç kilo? ");
        Scanner e = new Scanner(System.in);
        int elma = e.nextInt();

        System.out.println("Domates kaç kilo? ");
        Scanner d = new Scanner(System.in);
        int domates = d.nextInt();

        System.out.println("Muz kaç kilo? ");
        Scanner m = new Scanner(System.in);
        int muz = m.nextInt();

        System.out.println("Patlıcan kaç kilo? ");
        Scanner p = new Scanner(System.in);
        int patlican = p.nextInt();

        float toplam = (float) ((armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5.00));

        System.out.println("Toplam: " +toplam);

    }

}