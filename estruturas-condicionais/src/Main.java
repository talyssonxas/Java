import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int nota_1, nota_2, nota_3, media, nota_Recuperacao;
        Scanner ler = new Scanner(System.in);
        String conceito;
        System.out.println("Digite a nota da prova 1: ");
        nota_1 = ler.nextInt();
        System.out.println("Digite a nota da prova 2: ");
        nota_2 = ler.nextInt();
        System.out.println("Digite a nota da prova 3: ");
        nota_3 = ler.nextInt();
        media = ((nota_1)+(nota_2 * 2)+(nota_3 * 3))/6;
        //Critério para aprovação: Média maior ou igual a 70
        //Critério para recuperação: Média maior ou igual a 40
        System.out.println("A média atingida foi: " + media);
        if (media >= 70){
            conceito = "A";
            System.out.println("Aluno aprovado");
        } else if (media >= 40) {
            System.out.println("Aluno de recuperação");
            System.out.println("Digite a nota da prova de recuperação: ");
            nota_Recuperacao = ler.nextInt();
            //Critério para aprovação na recuperação: Média + Nota da Recuperação deve ser maior ou igual 100
            if((nota_Recuperacao + media)>=100){
                System.out.println("Aluno aprovado na recuperação");
                media = (media + nota_Recuperacao)/2;
                conceito = "B";
            }else {
                System.out.println("Aluno reprovado");
                media = (media + nota_Recuperacao)/2;
                conceito = "F";
            }
        }else {
            System.out.println("Aluno reprovado");
            conceito = "F";
        }
        switch (conceito) {
            case "A" -> System.out.println("Nota final: " + media + "\nConceito: " + conceito);
            case "B" -> System.out.println("Nota final: " + media + "\nConceito: " + conceito);
            case "F" -> System.out.println("Nota final: " + media + "\nConceito: " + conceito);
        }
    }
}