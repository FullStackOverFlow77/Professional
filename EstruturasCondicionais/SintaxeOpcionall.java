import java.util.Locale;
import java.util.Scanner;

public class SintaxeOpcionall{
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
       
        Scanner sc = new Scanner (System.in);

        int minutos =sc.nextInt();

        double conta = 50.0; 

        if(minutos> 100){
            conta = conta - (minutos - 100) * 2.0;
        }

        System.out.printf("Valor a pagar: %.2f " , conta);

    }
}