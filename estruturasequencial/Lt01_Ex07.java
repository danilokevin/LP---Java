/*
Objetivo:       Receba os valores do comprimento, largura e altura de um 
                paralelepípedo. Calcule e mostre seu volume.
Programador:    Danilo Santos
Data:           06/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex07
{
    public static void main (String args [])
    {
        float comp, larg, alt, vol;
        comp = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do comprimento: "));
        larg = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da largura: "));
        alt = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura: "));
        
        vol = (comp*larg*alt);
        
        System.out.println("O valor do volume é igual a: " + vol);
    }
}
