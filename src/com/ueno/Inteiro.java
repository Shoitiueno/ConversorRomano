package com.ueno;

/**
 * Created by shoit on 14/06/2017.
 */
public class Inteiro {
    private int num;
    private String charRoman = "";

    public Inteiro(String charRoman) {
        this.charRoman = charRoman;
    }

    public int convInt(){
        int cont = 0;
        while(cont < charRoman.length()){
            if(charRoman.charAt(cont) == 'M' ){
                num = num + 1000;
                cont++;
            } else if (charRoman.charAt(cont) == 'C' && cont + 1 < charRoman.length()){
                if(charRoman.charAt(cont + 1) == 'M' ){
                    num = num + 900;
                    cont = cont + 2;
                } else {
                    cont++;
                }
            } else if(charRoman.charAt(cont) == 'D' ){
                num = num + 500;
                cont++;
            } else if (charRoman.charAt(cont) == 'C' && cont + 1 < charRoman.length()) {
                if (charRoman.charAt(cont + 1) == 'D') {
                    num = num + 400;
                    cont = cont + 2;
                } else {
                    cont++;
                }
            } else if(charRoman.charAt(cont) == 'C' ){
                num = num + 100;
                cont++;
            } else if (charRoman.charAt(cont) == 'X' && cont + 1 < charRoman.length()) {
                if (charRoman.charAt(cont + 1) == 'C') {
                    num = num + 90;
                    cont = cont + 2;
                } else {
                    cont++;
                }
            } else if(charRoman.charAt(cont) == 'L' ){
                num = num + 50;
                cont++;
            } else if (charRoman.charAt(cont) == 'X' && cont + 1 < charRoman.length()) {
                if (charRoman.charAt(cont + 1) == 'L') {
                    num = num + 40;
                    cont = cont + 2;
                } else {
                    cont++;
                }
            } else if(charRoman.charAt(cont) == 'X' ) {
                num = num + 10;
                cont++;
            } else if (charRoman.charAt(cont) == 'I' && cont + 1 < charRoman.length()) {
                if (charRoman.charAt(cont + 1) == 'X') {
                    num = num + 9;
                    cont = cont + 2;
                } else {
                    cont++;
                }
            } else if(charRoman.charAt(cont) == 'V' ) {
                num = num + 5;
                cont++;
            } else if (charRoman.charAt(cont) == 'I' && cont + 1 < charRoman.length()) {
                if (charRoman.charAt(cont + 1) == 'V') {
                    num = num + 4;
                    cont = cont + 2;
                } else {
                    cont++;
                }
            }  else if(charRoman.charAt(cont) == 'I' ) {
                num = num + 1;
                cont++;
            } else {
                cont++;
            }
        }
        return num;
    }
}
