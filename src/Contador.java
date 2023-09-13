import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int primeiroParametro = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = scanner.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } 
        catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        // Validando se o primeiro parâmetro é MAIOR que o segundo parâmetro
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = segundoParametro - primeiroParametro;

        for (int i = primeiroParametro; i <= segundoParametro; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}