package com.company;

import java.util.*;

public class Esercizio33 {
    public static void main(String[] args) {
        int divisore = 1;
        int resto;
        Scanner sc = new Scanner(System.in);
        int numero_a = sc.nextInt();
        int numero_b = sc.nextInt();
        int numero_c = sc.nextInt();
        if (numero_a >= numero_b && numero_a >= numero_c) {
            while (divisore != numero_a) {
                resto = numero_a % divisore;
                if (resto == 0) {
                    //numero_a
                    resto = numero_b % divisore;
                    if (resto == 0) {
                        resto = numero_c % divisore;
                        if (resto == 0) {
                            System.out.println(divisore);


                        }

                    }
                }


                divisore = divisore + 1;
            }


        }
        if (numero_b >= numero_a && numero_b >= numero_c) {
            while (divisore != numero_c) {
                resto = numero_b % divisore;
                if (resto == 0) {
                    //numero_a
                    resto = numero_a % divisore;
                    if (resto == 0) {
                        //resto=numero
                        resto = numero_c % divisore;
                        if (resto == 0) {
                            System.out.println(divisore);

                        }
                    }
                }


                divisore = divisore + 1;
            }


        }
        if(numero_c>=numero_a && numero_c>=numero_a){
            while(divisore!=numero_c){
                resto=numero_c%divisore;
                if(resto==0){
                    resto=numero_a%divisore;
                    if(resto==0){
                        resto=numero_b%divisore;
                        if(resto==0){
                            System.out.println(divisore);

                        }



                    }




                }




                divisore=divisore+1;
            }






        }


    }


}
