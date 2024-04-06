package org.example;
import java.util.Arrays;

public class TesteArrays {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] array2 = array1;
        exibirArray(array1);
        array2[0] = 0;
        array2[2] = 2;
        exibirArray(array1);

        int[][] matriz = new int[5][];

        for (int i = 0; i < matriz.length; i++){
            matriz[i] = new int [i];
            for (int j = 0; j < i; j++){
                matriz[i][j] = i * j;
            }
        }
        String str = Arrays.toString(matriz[0]);
        System.out.print("[" + str + ", ");
        str = Arrays.toString(matriz[1]);
        System.out.print(str + ", ");
        str = Arrays.toString(matriz[2]);
        System.out.print(str + ", ");
        str = Arrays.toString(matriz[3]);
        System.out.print(str + ", ");
        str = Arrays.toString(matriz[4]);
        System.out.print(str + "] ");

    }
    public static void exibirArray(int[] array) {
        System.out.print("<");
        for (int i = 0; i < array.length; i++) {
            // Imprime um elemento
            System.out.print(array[i]);
            // Imprime uma vírgula como delimitador se não for o
            // último elemento
            if ((i+1) < array.length) {
                System.out.print(", ");
            }
        }
        System.out.println(">");
    }

}
