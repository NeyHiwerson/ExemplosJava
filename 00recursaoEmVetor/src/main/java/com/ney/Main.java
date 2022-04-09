package com.ney;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[]{3, 7, 2, 5, 9, 1, 7};
        for (int valor : numeros) {
            System.out.print(valor + " - ");
        }
        System.out.println();
        bubblesort(numeros);

        for (int valor : numeros) {
            System.out.print(valor + " - ");
        }

    }

    private static void bubblesort(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1 ; j++) {
                if (vet[j] > vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }

}