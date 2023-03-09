package view;

import java.util.Random;

import controller.ThreadVetor;

public class principal {

    public static void main(String[] args) {
        Random Gerador = new Random();
        int vt[] = new int[1000];
        
        for(int i=0;i<1000;i++) {
            vt[i]=Gerador.nextInt(100)+1;
        }
        
        for(int valor=1;valor<=2;valor++) {
            Thread ThreadVetor = new ThreadVetor(valor, vt);
            ThreadVetor.start();
            }

    }

}