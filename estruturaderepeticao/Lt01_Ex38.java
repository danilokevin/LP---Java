/*
Objetivo:      Receba 100 números inteiros reais. Verifique e mostre o maior 
               e o menos valor. Obs.: somente valores positivos.
Programador:   Danilo Santos
Data:          20/02/2020
*/
package estruturaderepeticao;

import javax.swing.JOptionPane;

public class Lt01_Ex38 
{
    public static void main(String[] args) 
    {
        int x, y, z, maior, menor, cont;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Declare um número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Declare um número: "));
        
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
            } else 
            {
                if (z < menor)
                {
                    menor = z;
                }
                
                cont += 1;
            }
            
        }
        
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
    }
    
}
