package org.example;

public class TesteArrays {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] array2 = array1;
        exibirArray(array1);
        array2[0] = 0;
        array2[2] = 2;
        exibirArray(array1);

        int[][] matriz = new int[5][];
        matriz[0] = new int[]{1, 2, 3, 4, 5};
        matriz[1] = new int[]{1,2,3,4};
        matriz[2] = new int[]{1,2,3};
        matriz[3] = new int[]{1,2};
        matriz[4] = new int[]{1};

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
