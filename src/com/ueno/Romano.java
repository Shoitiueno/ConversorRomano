package com.ueno;

/**
 * Created by shoit on 14/06/2017.
 */
public class Romano {
    private int num;
    private String charRoman = "";

    public Romano(int num) {
        this.num = num;
    }

    public String convRoman(){
        int numTemp;
        numTemp = num / 1000;
        if(numTemp >= 1 || numTemp <= 3){
            while (numTemp >= 1){
                charRoman = charRoman + "M";
                numTemp = numTemp - 1;
            }
        }
        num = num % 1000;
        numTemp = num / 100;
        if(numTemp == 9){
            charRoman = charRoman + "CM";
        } else if(numTemp >= 5 || numTemp >= 8 ){
            charRoman = charRoman + "D";
            while (numTemp >= 6){
                charRoman = charRoman + "C";
                numTemp = numTemp - 1;
            }
        } else if(numTemp == 4){
            charRoman = charRoman + "CD";
        } else if(numTemp >= 1 || numTemp <= 3){
            while (numTemp >= 1){
                charRoman = charRoman + "C";
                numTemp = numTemp - 1;
            }
        }
        num = num % 100;
        numTemp = num / 10;
        if(numTemp == 9){
            charRoman = charRoman + "XC";
        } else if(numTemp >= 5 || numTemp >= 8 ){
            charRoman = charRoman + "L";
            while (numTemp >= 6){
                charRoman = charRoman + "X";
                numTemp = numTemp - 1;
            }
        } else if(numTemp == 4){
            charRoman = charRoman + "XL";
        } else if(numTemp >= 1 || numTemp <= 3){
            while (numTemp >= 1){
                charRoman = charRoman + "X";
                numTemp = numTemp - 1;
            }
        }
        num = num % 10;
        numTemp = num / 1;
        if(numTemp == 9){
            charRoman = charRoman + "IX";
        } else if(numTemp >= 5 || numTemp >= 8 ){
            charRoman = charRoman + "V";
            while (numTemp >= 6){
                charRoman = charRoman + "I";
                numTemp = numTemp - 1;
            }
        } else if(numTemp == 4){
            charRoman = charRoman + "IV";
        } else if(numTemp >= 1 || numTemp <= 3){
            while (numTemp >= 1){
                charRoman = charRoman + "I";
                numTemp = numTemp - 1;
            }
        }
        return charRoman;
    }
}
