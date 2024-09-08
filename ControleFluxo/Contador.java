import java.util.Scanner;

public class Contador {

    public static void contar(int param1, int param2) throws ParametrosInvalidosException {
        if (param2 <= param1) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int total = param2 - param1;
        for (int i = 1; i <= total; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        try {
            contar(num1, num2); 
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
