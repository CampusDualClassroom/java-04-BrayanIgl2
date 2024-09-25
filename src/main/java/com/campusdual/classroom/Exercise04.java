package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));


        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));


        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));


        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");
        sumEvenNum(20);
    }

    public static int sumNum(int num) {

        //Resultado
        int resultado = 0;

        //Suma los primeros 5 numeros a partir del numero pasado por parametro.
        for (int i = num; i > 0; i--) {
            resultado += i;

        }


        return resultado;

    }

    public static int sumEvenNum(int num) {

        //Resultado
        int resultado = 0;

        int n = 0;

        //Contador de numeros pares
        int contador = -1;

        //Mientras no se llegue a los numeros pares objetivo, el bucle sigue
        while (contador < num) {

            //Comprueba que el numero sea par
            if (n % 2 == 0) {
                resultado += n;
                contador++;

            }
            //Se añade otro numero
            n++;
        }

        return resultado;
    }

    public static int factorial(int num) {

        int facto = 1;

        //Calcula el factorial del numero obtenido por parámetro
        for (int i = num; i > 1; i--) {
            facto *= i;
        }
        return facto;
    }

    public static int recursiveFactorial(int num) {

        if (num <= 1) return num;
        return num * recursiveFactorial(num - 1);
    }
}
