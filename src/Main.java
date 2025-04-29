import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro ");
        int primeiroParametro = terminal.nextInt();
        System.out.println("Digite o segundo parametro ");
        int segundoParametro = terminal.nextInt();

        try{
            Contador.contar(primeiroParametro, segundoParametro);
        }catch(ParametrosInvalidosException e){
            System.out.println("erro: " + e.getMessage());
        }

        terminal.close();

    }

}
