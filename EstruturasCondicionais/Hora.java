package EstruturasCondicionais; 
import java.util.Scanner;
public class Hora{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
            
        System.out.println("Digite uma hora: ");
        int hora = sc.nextInt();

        if (hora > 0 && hora < 12){
            System.out.println("Bom dia !");
        }
        if (hora >= 12 && hora < 18 ){
            System.out.println("Boa tarde!");
        }
        else{
            System.out.println("Boa noite !");
        }

            

        
        sc.close();
    }
}