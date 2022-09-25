import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = ler.nextLine();
        saudacao(nome);
        float x, y;
        System.out.println("Digite o número x: ");
        x = ler.nextFloat();
        System.out.println("Digite o número y: ");
        y = ler.nextFloat();
        float resultado = soma(x,y);
        System.out.println("O resultado da função soma(x, y) é: " + resultado);
    }
    public static void saudacao(String nome){
        System.out.println("Olá, " + nome);
    }
    public static float soma(float x, float y){
        return x + y;
    }
}