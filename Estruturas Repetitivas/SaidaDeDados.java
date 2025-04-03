import java.util.Locale;
public class SaidaDeDados{
    public static void main(String[]args){
        int y = 0;
        double x = 10.555;
        
        System.out.println("\nHello");
        System.out.println("\nHello World");
        
        System.out.println("\n" + y);

        System.out.printf("%.2f%n" ,x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n" ,x);
        System.out.println("Resultado= " + x + " Metros\n");
        System.out.printf("Resultado = %f Metros%n" , x ); 

        System.out.println("\n");

        String nome = "João";
        int idade = 17;
        double salario = 4000.0;

        System.out.printf("Meu nome é %s minha idade é %d e minha renda atual é %.2f%n" , nome ,idade , salario);

    }
}