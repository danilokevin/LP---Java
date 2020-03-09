/*
Objetivo:       Receba os valores em x e y. Efetua a troca de seus valores e 
                mostre seus conteúdos.
Programador:    Danilo Santos
Data:           06/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex06
{
    public static void main (String args [])
    {
        int X, Y, AUX;
        X = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));
        
        AUX = X;
        X = Y;
        Y = AUX;
        
        System.out.println("O novo valor de X é: " + X);
        System.out.println("O novo valor de Y é: " + Y);
    }
}
