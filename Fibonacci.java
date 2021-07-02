import java.util.Random;
public class Fibonacci
{
    public static void main(String[] args) {
        Random ran=new Random();
        int r=ran.nextInt(10);
        System.out.println("gelen random sayi: " + r);

        int sayi1=0;
        int sayi2=1;
        int i;
        System.out.println(r+" sayisinin fibonacci serisi: ");

        for (i=0; i<r; i++)
        {
            System.out.println( ""+ sayi1);
            int toplam = sayi1 + sayi2;
            sayi1 =sayi2;
            sayi2 = toplam;

        }
    }
}