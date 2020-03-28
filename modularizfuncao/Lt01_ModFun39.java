/*
Objetivo:      Calcule a quantidade de grãos contidos em um tabuleiro de 
               xadrez onde: 
               Casa: 1 2 3 4 ... 64 
                Qte: 1 2 4 8 ... N
Programador:   Danilo Santos
Data:          20/02/2020
 */
package modularizfuncao;

import javax.swing.JOptionPane;

public class Lt01_ModFun39 
{
    public static void main(String[] args) 
    {
        int casa;
        
        casa = Integer.parseInt(JOptionPane.showInputDialog("Casa: "));
        System.out.println(FunctionGraos(casa) + " grãos");
    }
    
    static float FunctionGraos (int casa)
    {
        float graos; 
        int cont;
        
        graos = 1;
        
        for (cont = 2; cont <= casa ; cont++)
            graos *= 2;
        
        return graos;
    }
}
