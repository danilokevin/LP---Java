/*
Objetivo:       Receba o salário de um funcionário e mostre o novo salário com 
                reajuste de 15%.
Programador:    Danilo Santos
Data:           06/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex02
{
    public static void main (String args [])
    {
        float salAtual, salNovo;
        salAtual = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário atual: "));
        
        salNovo = (float) (salAtual * 1.15);
        
        System.out.printf("O salário após reajuste é igual a: R$ %.2f ", salNovo);
    }
}
