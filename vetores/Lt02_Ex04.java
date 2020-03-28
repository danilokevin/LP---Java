/*
Objetivo:     Criar e coletar em um vetor [30] real e calcular e exibir:
              a. A média do grupo;
              b. A quantidade de notas acima do grupo;
              c. As posições dos valores abaixo da média do grupo.

Programador:   Danilo Santos
Data:          05/03/2020
*/
package vetores;

import javax.swing.JOptionPane;

public class Lt02_Ex04 
{
    public static void main(String[] args) 
    {
        float vet[] = new float [10];
        float somaTotal = 0, media;
        int acimaMed = 0, indic;
        String mostra = "";
        
        for (indic = 0; indic <= 9; indic++)
        {
            vet[indic] = Float.parseFloat(JOptionPane.showInputDialog("Declare o " + (indic+1) + "º número: "));
            somaTotal += vet[indic];
        }
        
        media = somaTotal / 10;
        System.out.println("Média do grupo: " + media + "\n");
        
        for (indic = 0; indic <= 9; indic++)
        {
            if (vet[indic] > media)
            {
                acimaMed++;
            } else 
            {
                mostra += (indic + "º = " + vet[indic] + " ; ");
            }
        }
        
        System.out.println("Posição dos números abaixo da média do grupo: " + mostra);
        System.out.println("Quantidade de números acima da média: " + acimaMed);
    }  
}
