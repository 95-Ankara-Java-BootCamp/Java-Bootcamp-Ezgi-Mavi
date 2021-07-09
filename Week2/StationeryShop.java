import java.util.*;
public class StationeryShop
{
    /*
    Bu programda bir kırtasiyeye gelen malların kaydını tutuyoruz
    Ürünlerimiz kalem ve silgi
    Programın herhangi bir anında 0'a basarak kayıt işlemini durdurup çıkabiliyoruz.
    Ürün eklemeye devam edebilmek için 1'e basıyoruz.
    Biz kayıt ekledikçe, hangi üründen kaç tane alındığını ve toplamda alınan
    ürün miktarını ekrana yazıyor.
     */

    public static void main (String [] args)
    {

        int Pencil =0;
        int Eraser=0;

        while(true)
        {
            System.out.println("Please press 0 for quit, press 1 for add product"); //ürün eklemek için 1, çıkmak için 0 yazın
            Scanner input = new Scanner(System.in);
            int quit = input.nextInt();
            if(quit==0) // eğer 0 yazarsak programın herhangi bir anında çıkabiliyoruz
            {
            break;
            }
          else{
                System.out.println("Enter the product name: Pencil or Eraser "); //kayıt edilecek ürün adını yazın
                Scanner kayit = new Scanner(System.in);
                String product = kayit.nextLine();


                System.out.println("Enter the number of products: "); //ürün adedini yazın
                Scanner adet = new Scanner(System.in);
                int number = adet.nextInt();

                if (product.equals("Pencil"))
                {
                    Pencil+= number;

                }
                else if(product.equals("Eraser"))
                {
                    Eraser+=number;

                }
                else
                {
                    System.out.println("Please only select Pencil or Eraser ");

                }
            }
            System.out.println("In total " +Pencil+ " pencil bought"); //değerleri ekrana yazdırıyoruz
            System.out.println("In total " +Eraser+ " eraser bought " );
            System.out.println("Total number of products bought: "+ (Pencil+Eraser));

        }

    }
}
