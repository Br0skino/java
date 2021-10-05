package com.company;

import java.util.*;

public class Esercizio11 {
    public static void main(String[] args) {
        int divisore = 1;
        int resto;

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero_a: ");
        int numero_a = sc.nextInt();
        System.out.println("Inserisci un numero_b: ");
        int numero_b = sc.nextInt();
        if (numero_a >=numero_b) {
            while (divisore != numero_a) {
                resto = numero_a % divisore;
                if (resto == 0) {
                    resto = numero_b%divisore;
                    if(resto==0){
                        System.out.println(divisore);

                    }
                }
                divisore = divisore + 1;

            }
        } else {
            if(numero_b>numero_a){
                while(divisore!=numero_b){
                    resto=numero_b%divisore;
                    if(resto==0){
                        resto=numero_a%divisore;
                        if(resto==0){
                            System.out.println(divisore);


                        }

                    }divisore=divisore+1;



                }



            }


        }


    }


}
