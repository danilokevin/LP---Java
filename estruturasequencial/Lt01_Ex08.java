/*
Objetivo:       Receba o valor de um depósito em poupança. Calcule e mostre 
                o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
Programador:    Danilo Santos
Data:           06/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex08
{
    public static void main (String args [])
    {
        float dep, resg;
        dep = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do depósito: "));
        
        resg = (float) (dep * ((1.3/100)+1));
        
        System.out.printf("O valor do resgate após 1 mês de aplicação é: R$ %.2f", resg);
    }
}