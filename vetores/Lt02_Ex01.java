/*
Objetivo:      Criar e coletar um vetor [50] inteiro. Calcular e exibir:
               a. A média dos valores entre 10 e 200;
               b. A soma dos números ímpares.
Programador:   Danilo Santos
Data:          05/03/2020
*/
package vetores;

import javax.swing.JOptionPane;

public class Lt02_Ex01 
{
    public static void main(String[] args) 
    {
        int vet[] = new int [10];
        int ind, contador, somaImp;
        double media;
        
        contador = 0;
        media = 0;
        somaImp = 0;
        
        for (ind = 0; ind <= 9; ind++)
        {
            vet[ind] = Integer.parseInt(JOptionPane.showInputDialog("Declare um número: "));
        }
        
        for (ind = 0; ind <= 9; ind++)
        {
            if (vet[ind] >= 10 && vet[ind] <= 200)
            {
                contador++;
                media += vet[ind];
            }
        }
        
        media /= contador;
        
        for (ind = 0; ind <= 9; ind++)
        {
            if (vet[ind] % 2 == 1)
            {
                somaImp += vet[ind];
            }
        }
        
        System.out.println("A média dos números entre 10 e 200 é igual a: " + media);
        System.out.println("A soma de todos os números ímpares digitados é igual a: " + somaImp);
    }
    
}
