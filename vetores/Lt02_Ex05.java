/*
Objetivo:      Criar e coletar em um vetor [20] inteiro. Calcule e exiba, 
               segundo:
               10
               ∑ (A[1] – A[21–1])
               i = 1
Programador:   Danilo Santos
Data:          05/03/2020
*/
package vetores;

import javax.swing.JOptionPane;

public class Lt02_Ex05 
{
    public static void main(String[] args) 
    {
        int vet[] = new int [6];
        int somaExtrem, x, ind;
        
        somaExtrem = 0;
        
        for (ind = 0; ind <= 5 ; ind++)
        {
            vet[ind] = Integer.parseInt(JOptionPane.showInputDialog("Declare o: " + (ind+1) + "º número: "));            
        }
        for (ind = 0; ind <= 2; ind++)
        {
            x = vet[ind]-vet[5-ind];
            somaExtrem += x;
        }
        
        System.out.println("Resultado final: " + somaExtrem);
    }
}
