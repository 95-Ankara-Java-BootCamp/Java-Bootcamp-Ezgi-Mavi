import java.util.*;
public class ExamGrade
{
    /*
    Bu programda öğrenci vize ve final notlarını giriyor
    Program, vizenin %40'ını finalin de %60ını alarak
    bir ortalama hesaplıyor. Bu ortalamaya denk gelen harf notunu
    ve ortalamayı ekrana yazdırıyor.
     */

public static void main (String [] args)
    {
       System.out.println("Enter your midterm score: ");
       Scanner midterm = new Scanner(System.in);
       float midtermScore = midterm.nextFloat();

       System.out.println("Enter your final score: ");
       Scanner final1= new Scanner(System.in);
       float finalScore = final1.nextFloat();

       float average = ((midtermScore*2/5) + (finalScore*3/5));

       if (average >= 0 && average<=20)
       {
           System.out.println(" Your letter grade: FF \n Your score: " +average);
       }

       else if (average>20 && average <= 50)
       {
           System.out.println(" Your letter grade: CB \n Your score:  "+average);
       }
       else if (average>50 && average <= 70)
       {
           System.out.println(" Your letter grade: BB \n Your score:  "+average);
       }
       else if (average>70 && average <= 100)
       {
           System.out.println(" Your letter grade: AA \n Your score:  "+average);
       }
       else
       {
           System.out.println("Error ! Try again.");
       }
    }
}
