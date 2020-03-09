/*
Objetivo:      Calcule a quantidade de grãos contidos em um tabuleiro de 
               xadrez onde: 
               Casa: 1 2 3 4 ... 64 
                Qte: 1 2 4 8 ... N
Programador:   Danilo Santos
Data:          20/02/2020
 */
package estruturaderepeticao;

import javax.swing.JOptionPane;

public class Lt01_Ex39 
{
    public static void main(String[] args) 
    {
        int gr, casa, cont;
        
        gr = 1;
        
        casa = Integer.parseInt(JOptionPane.showInputDialog("Casa: "));
        
        for (cont=2; cont <= casa; cont++)
        {
            gr *= 2;
        }
        
        System.out.println("Quantidade de grãos nesta casa: " + gr);   
    }
}
