/*
Objetivo:      Criar e coletar um vetor [100] inteiro e exibir:
               a. O maior e o menor valor;
               b. A média dos valores.
Programador:   Danilo Santos
Data:          05/03/2020
*/
package vetores;

import javax.swing.JOptionPane;

public class Lt02_Ex02 
{
    public static void main(String[] args) 
    {
        int v[] = new int [10];
        int ind, maiorNum, menorNum, media;
        
        for (ind = 0; ind <= 9; ind++)
        {
            v[ind] = Integer.parseInt(JOptionPane.showInputDialog("Declare o " + ind + "º número: " ));
        }    
        
        ind = 0;
        
        menorNum = v[ind];
        maiorNum = menorNum;
        
        for (ind=1; ind <= 9; ind++)
        {
            if (v[ind] < menorNum)
            {
                menorNum = v[ind];
            } else 
            {
                if (v[ind] > maiorNum)
                {
                    maiorNum = v[ind];
                }
            } 
        }
        JOptionPane.showMessageDialog(null, "O maior número: " + maiorNum + "\nO menor número: " + menorNum); 
    }
    
}
