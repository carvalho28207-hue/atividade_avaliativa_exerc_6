import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.println("Qual o seu nome ?");
        nome = entrada.nextLine();
        
        int idade;
        System.out.println("Qual a sua idade ?");
        idade = entrada.nextInt();
        entrada.nextLine();

        String cidade;
        System.out.println("Qual a sua cidade ?");
        cidade = entrada.nextLine();

    System.out.println("Cadastro" + "\n" + "Nome: " + nome + "\n" + "Idade: "+ idade + "\n" + "Cidade: " + cidade);

    }
}
