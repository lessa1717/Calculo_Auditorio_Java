import java.util.Scanner;

public class Exercicio_EscolhaAuditorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdPessoas,qtdAdicional,qtdTotal;

        System.out.println("Por favor digite a quantidade de pessoas para o seu evento: ");
        qtdPessoas = sc.nextInt();

        if(qtdPessoas>=350 || qtdPessoas<=0){
            System.out.println("A quantidade digitada é inválida, por favor digite valores de 1 até 350");
        }
        if(qtdPessoas <=220 && qtdPessoas >=1){
            System.out.println("Quantas cadeiras adicionais voçê vai precisar? ");
            qtdAdicional = sc.nextInt();
            qtdTotal = (qtdAdicional+qtdPessoas);
            if (qtdTotal<=220){
                System.out.println("Seu evento irá utilizar o total de "+qtdTotal+" assentos e o auditório Alfa é o ideal para voçê!");
            }else{
                System.out.println("Esse valor ultrapassa o limite total do auditório Alfa, portanto o aditório Beta é o ideal para voçê!");
            }
        }


    }
}
