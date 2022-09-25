public class Main {
    public static void main(String[] args) {
        //laço for aninhado
        for (int i = 1; i <= 10; i++){
            System.out.println("----------------------------------------");
            System.out.println("Tabuada de multiplicação do número: " + i);
            for (int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
    }
}