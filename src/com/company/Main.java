package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n1 = 0;
        int n2 = 1;
        int aux;
        int limite = 1000;

        System.out.println(n1);
        System.out.println(n2);

        while (n2 + n1 <= limite) {
            aux = n1;
            n1 = n2;
            n2 = aux + n1;

            System.out.println(n2);
        }


    }
}
