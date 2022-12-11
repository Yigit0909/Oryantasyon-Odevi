import java.util.Scanner;


public class JavaOrnekleri {

    public static void main(String[] args) {
        // Klavyeden okuma yapmak için Scanner nesnesini oluştur.
        Scanner reader = new Scanner(System.in);
        int num;
        int ctoplam=0,ttoplam=0;

        do{

            System.out.print("Bir Sayı Girin: ");
            num = reader.nextInt();

            if(num%2==0)
                ctoplam+=num;
            else
                ttoplam+=num;

        }while(num != 0);

        System.out.println("Tek Sayı Toplamı : " + ttoplam);
        System.out.println("Çift Sayı Toplamı: " + ctoplam);
    }
}