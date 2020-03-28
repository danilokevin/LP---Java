/*
Objetivo:      Receba 100 números inteiros reais. Verifique e mostre o maior 
               e o menos valor. Obs.: somente valores positivos.
Programador:   Danilo Santos
Data:          20/02/2020
*/
package modularizfuncao;

import javax.swing.JOptionPane;

public class Lt01_ModFun38 
{
    public static void main(String[] args) 
    {
        int x, y;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Declare um número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Declare um número: "));
        
        System.out.println(FunctionVerificar(x, y));
    }
    
    static String FunctionVerificar(int x, int y)
    {
        int maior, menor, z, cont;
        String mostra;
        
        if (x>y)
        {
            maior = x;
            menor = y;
        } else 
        {
            menor = x;
            maior = y;
        }
        
        cont = 3;
        
        while (cont <= 10)
        {
            z = Integer.parseInt(JOptionPane.showInputDialog("Declare outro número: "));
            
            if (z > maior)
            {
                maior = z;
                cont += 1;
            } 
            else 
            {
                if (z < menor)
                {
                    menor = z;
                }
                cont += 1;
            }       
        }
        mostra = ("Maior: " + maior + " e Menor: " + menor);
        return mostra;
    }  
}
