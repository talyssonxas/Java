import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        String nome, saudacao;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        nome = ler.nextLine();
        Locale brasil = new Locale("pt","BR");
        LocalDate hoje = LocalDate.now();
        String data = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        LocalDateTime agora = LocalDateTime.now();
        float hora = agora.getHour();
        if ((hora >= 0) && (hora < 5)){
            saudacao = "boa madrugada";
        } else if ((hora >= 5) && (hora < 12)) {
            saudacao = "bom dia";
        } else if ((hora >= 12) && (hora < 18)) {
            saudacao = "boa tarde";
        }else{
            saudacao = "boa noite";
        }
        System.out.println("Olá " + nome + ", " + saudacao + ", hoje é " + data +".");
        System.out.println("Seu nome em letras maiúsculas: ");
        System.out.println(nome.toUpperCase());
        System.out.println("Seu nome em letras minúsculas: ");
        System.out.println(nome.toLowerCase());
        System.out.println("Seu nome possui " + nome.length() + " letras");
    }
}