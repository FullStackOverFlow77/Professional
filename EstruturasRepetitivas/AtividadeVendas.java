import java.util.Locale;
public class AtividadeVendas {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Oficio"; 
        
        int age = 30 ; 
        int code = 5629; 
        char gender = 'F'; 
        
        double price1 = 2100.00; 
        double price2 = 650.50;
        double price3 = 53.234567; 

        System.out.println("Products:\n");

        System.out.printf("%s , O preço do computador é $%.2f%n" ,product1,price1);
        System.out.printf("%s , preço do Oficio é de %.2f%n " , product2,price2);

        System.out.printf("Record: %d anos de idade , seu codigo é %d e seu gênero é %c%n" ,age,code, gender);

        System.out.printf("O preço dos decimais é de %.2f%n" , price3); 
        System.out.printf("O preço dos decimais com 3 casas decimais é de %.3f $n" , price3);
        Locale.setDefault(Locale.US); 
        System.out.printf("Código com Locale é %.3f\n" , price3);




    }
    
}
