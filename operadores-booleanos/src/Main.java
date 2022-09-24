public class Main {
    public static void main(String[] args) {
        boolean fim_De_Semana = true;
        boolean fazendo_Sol = true;
        boolean vamos_A_Praia = fim_De_Semana && fazendo_Sol;

        String mensagem = fim_De_Semana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
        mensagem = fazendo_Sol ? "Está fazendo sol" : "Não está fazendo sol";
        System.out.println(mensagem);
        mensagem = vamos_A_Praia ? "Então vamos à praia" : "Então não vamos à praia";
        System.out.println(mensagem);

        //Tabelas verdade

        //Operador && (AND)
        //true && true === true
        //true && false === false
        //false && true === false
        //false && false === false

        //Operador || (OR)
        //true || true === true
        //true || false === true
        //false || true === true
        //false || false === false
    }
}