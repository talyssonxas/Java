import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        //arrays são imutáveis, ou seja, se declararmos uma array de 5 posições não poderemos adicionar um sexto elemento;
        System.out.println("Escrevendo os elementos do array utilizando laços:");
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;
            System.out.println(numeros[i]);
        }
        System.out.println("Escrevendo a array utilizando o 'Arrays.toString'");
        System.out.println(Arrays.toString(numeros));
        System.out.println("Comparando os números utilizando laços");
        int i = 0;
        int aux = 0;
        int soma = 0;
        while (i < numeros.length){
            if (aux <= numeros[i]){
                aux = numeros[i];
            }
            soma = soma + numeros[i];
            i++;
        }
        int media = soma/numeros.length;
        System.out.println("O maior número é o: " + aux);
        System.out.println("A média da soma dos números é: " + media);
    }
}