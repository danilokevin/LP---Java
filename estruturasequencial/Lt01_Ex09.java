/*
Objetivo:       Receba os 2 números inteiros. Calcule e mostre a soma dos 
                quadrados
Programador:    Danilo Santos
Data:           06/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex09
{
    public static void main (String args [])
    {
        int X, Y, SOMA;
        X = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        SOMA = ((X*X) + (Y*Y));
        
        System.out.println("A soma dos quadrados dos números digitados é igual a: " + SOMA);
    }
}
