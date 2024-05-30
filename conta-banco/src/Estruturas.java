import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Estruturas {
    public static void main(String[] args) {
        //contador de carneirinhos
    for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++){
        System.out.println("contando carneirinhos: " + carneirinhos);
        } 
    System.out.println("joãozinho Dormiu");

    //Criando um Array com for

    System.out.println("---------------Lista Aluno com indice------------");

    String aluno[] = {"Felipe", "Jonas", "julia", "Marcos"};

    for (int x = 0; x < aluno.length; x++){
    
        System.out.println("O aluno no indice x= " + x + " é " + aluno [x]);
    }
    System.out.println("------------Lista Aluno sem os indices--------------");

        //forma abreviada de trabalhar com array em for

        for (String seuNome : aluno ){
        System.out.println("Nome do Aluno é :  " + seuNome);
        }

        //for com break e continue

        System.out.println("------NOVO COMANDO--------");

        for (int numero = 1; numero <= 5; numero ++){
                        if(numero == 3)
                                    break;  
//exemplo de break

                        System.out.println(numero);
        }

        System.out.println("testando o continue");
    for (int cachorro = 1; cachorro <=5; cachorro ++){
            if(cachorro == 2)
                continue;
                System.out.println(cachorro);
    }


System.out.println("*****************simulação de compra de doces com mesada*****************");
    
    //Comando While

    double mesada = 50.0;

    while (mesada > 0) {

        Double valorDoce = ValorAleatorio();
        if(valorDoce > mesada)
        valorDoce = mesada;

        System.out.println("Doce do valor: " + valorDoce + "Adicionado no carrinho");
        mesada = mesada - valorDoce;
    }
    System.out.println("Mesada: " + mesada);
    System.out.println("Joãozinho gastou toda sua mesada em doces");


    // comando do while e while

    System.out.println("Comando Do while e While");
    System.out.println("|");
    System.out.println("|");
    System.out.println("V");

    System.out.println("Discando.....");

    do{ 

    System.out.println("Telefone tocando.");

}while(tocando());

System.out.println("Alô!!!");
    }

    private static double ValorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
}
private static boolean tocando(){
boolean atendeu = new Random().nextInt(3)==1;
System.out.println("Atendeu? " + atendeu);
return ! atendeu;
}
}