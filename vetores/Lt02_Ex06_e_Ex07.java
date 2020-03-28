/*
Objetivo:      Criar e coletar em um vetor [20] com números 
               aleatórios. Classificar este vetor em ordem crescente e 
               mostre os dados.

               A partir do exercício 6 (vetor classificado) solicitar 
               um valor qualquer e verificar a sua existência no vetor 
               (utilizar pesquisa binária).

Programador:   Danilo Santos
Data:          05/03/2020
*/

package vetores;

import javax.swing.JOptionPane;

public class Lt02_Ex06_e_Ex07 
{
    public static void main(String[] args) 
    {
        int vet[] = new int [10];
        int ant, pro, aux;
        
        System.out.println("******** EX 6 - CARREGAR E ORDENAR VETOR *********");
        
        for (ant=0; ant <= 9 ; ant++)
        {
            vet[ant] = Integer.parseInt(JOptionPane.showInputDialog("Declare um número: "));
        }
        
        for (ant=0; ant <= 8; ant ++)
        {
            for (pro=(ant+1); pro <= 9; pro++)
            {
                if (vet[ant] > vet[pro])
                {
                    aux = vet[ant];
                    vet [ant] = vet[pro];
                    vet[pro] = aux;
                }
            }
        }
        
        for (ant=0; ant <= 9; ant++)
        {
            System.out.println(vet[ant]);
        }
        
        System.out.println("******** EX: 7 - PESQUISA BINÁRIA ********");
        
        System.out.println(FunctionPesquisaBin(vet));
    }
    
    static String FunctionPesquisaBin (int vet[])
    {
        int inic, fim, numProc, meio;
        boolean x = false;
        String busca = "";
        
        inic = 0;
        fim = 9;
        meio = 0;
        
        numProc = Integer.parseInt(JOptionPane.showInputDialog("Número procurado: "));
        
        while (inic <= fim && x == false)
        {
            meio = (inic + fim)/2;
            if (vet[meio] == numProc)
            {
                x = true;
            } else 
            {
                if (vet[meio] > numProc)
                {
                    fim = meio - 1;
                } else 
                {
                    inic = meio + 1;
                }
            }
        }
        
        if (x == false)
        {
            busca += ("Número não encontrado no Vetor");
        } else 
        {
            busca += ("Número " + numProc + " encontrado na " + (meio+1) + "ª posição do Vetor");
        }
        
        return busca;
    }
}
