import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try{
        
        System.out.println("\n\n-----------Usando o Try e Catch exceções-------\n\n");

    
Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

System.out.println("Digite Seu Nome: ");
String nome = scanner.next();

System.out.println("Digite seu sobrenome: ");
String sobremone = scanner.next();

System.out.println("Digite Sua Idade: ");
int idade = scanner.nextInt();

System.out.println("digite Sua Altura: ");
double altura = scanner.nextDouble();

//impressão dos dados coletados

System.out.println("Olá, me chamo  " + nome.toUpperCase() + " " + sobremone.toLowerCase());
System.out.println("Tenho " + idade + " anos. ");
System.out.println("Minha Altura é : " + altura + "cm");
scanner.close();}
catch (InputMismatchException e){
    System.out.println("Os dados Idade e altura devem conter apenas numeros");
 
}

}
}
        
    

