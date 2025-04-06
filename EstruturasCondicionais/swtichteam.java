import java.util.Scanner;
public class swtichteam {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        String dia; 

        switch (x){
            case 1: 
            dia = "Segunda";
            break;
            case 2 :
            dia = "Terça";
            break;
            case 3 :
            dia = "Quarta";
            break;
            default :
            dia = "Valor invalido";
            break;

            
            
            sc.close();
        }

    }
}
