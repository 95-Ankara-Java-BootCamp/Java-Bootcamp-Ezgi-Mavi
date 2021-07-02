import java.util.Random;
public class LetterGrade
{
    public static void main (String [] args)
    {
        Random ran=new Random();
        int r=ran.nextInt(100);
        System.out.println("Sinav notunuz: " + r);
        if(r<= 35)
        {
            System.out.println("Harf notunuz FF");
        }
        else if(r>35 && r<=50)
        {
            System.out.println("Harf notunuz DC");
        }
        else if(r>50 && r<=70 )
        {
            System.out.println("Harf notunuz BB");
        }
        else if(r>70 && r<= 100)
        {
            System.out.println("Harf notunuz AA");
        }
        else
        {
        }
    }
}