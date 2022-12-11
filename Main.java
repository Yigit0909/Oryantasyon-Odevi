import java.util.Scanner;



public class Main
{

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Bir Sayı Girin:");

            int num = reader.nextInt();
            int sayac=num;
            long faktoriyel = 1;
            while(sayac>1)
            {
                faktoriyel*=sayac;
                sayac--;
            }
            System.out.printf("%d Sayısının Faktöriyeli = %d \n", num, faktoriyel);
        }


}