package com.ueno;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor para algarismo romano");
        String opcao = JOptionPane.showInputDialog(frame, "1 - Converter números inteiros para romanos\n" +
                        "2 - Converter números romanos para inteiro\n"
                ,"Conversor, digite abaixo:"
                , JOptionPane.PLAIN_MESSAGE);
        switch (opcao) {
            case "1":
                String num = JOptionPane.showInputDialog(null, "Digite um número entre 1 " +
                                "e 3999:"
                        ,"Conversor inteiro para romano:"
                        , JOptionPane.PLAIN_MESSAGE);
                if (Integer.parseInt(num) >= 1 && Integer.parseInt(num) <= 3999 ) {
                    Romano romano = new Romano(Integer.parseInt(num));
                    JOptionPane.showMessageDialog(null, romano.convRoman());
                } else {
                    JOptionPane.showMessageDialog(null, "Valor Invalido");
                }
                break;
            case "2":
                String numRoman = JOptionPane.showInputDialog(null, "Digite um número romano "
                        ,"Conversor romano para inteiro:"
                        , JOptionPane.PLAIN_MESSAGE);
                Inteiro inteiro = new Inteiro(numRoman);
                JOptionPane.showMessageDialog(null, inteiro.convInt());
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida");
        }
        System.exit(0);
    }
}
