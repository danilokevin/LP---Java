/*
Objetivo:       Coletar o valor do lado de um quadrado, calcular sua área e 
                apresentar o resultado
Programador:    Danilo Santos
Data:           06/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex01
{
    public static void main (String args [])
    {
        int L, A;
        L = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado do quadrado: "));
        
        A = (L * L);
        
        System.out.println("A área do quadrado é igual a: " + A);
    }
}
