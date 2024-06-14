
import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
       

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int primeiroNumero = terminal.nextInt();
        System.out.println("Digite o segundo número");
        int segundoNumero = terminal.nextInt();

        try {
            contar(primeiroNumero, segundoNumero);
          }catch (Exception InvalidParametersException) {
            System.out.println("O segundo numero deve ser maior que o primeiro");
    }

    }

    static void contar(int primeiroNumero, int segundoNumero)
    throws InvalidParametersException{
if (primeiroNumero > segundoNumero) throw new  Exception ("ParametrosInvalidosException");
    
int validacao =  segundoNumero - primeiroNumero;

for (int index = 0; index < validacao; index++) {
    int numero = index + 1;
    System.out.printf("Imprimindo o número " + numero + "\n");
}

    }

}

