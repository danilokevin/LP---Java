/*
Objetivo:      Receba um número inteiro. Calcule e mostre a série de 
               Fibonacci até o seu N’nésimo termo.
Programador:   Danilo Santos
Data:          20/02/2020
*/
package modularizfuncao;

import javax.swing.JOptionPane;

public class Lt01_ModFun37 
{
    public static void main(String[] args) 
    {
        int n, t1, t2, t3, cont;
        
        t1=0;
        t2=1;
        t3=0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Declare a quantidade de termos desejados da série: "));
        
        if (n<=2)
        {
            if(n==1)
            {
                System.out.println(t1);
            } else 
            {
                System.out.println(t1 + " e " + t2);
            }
        } else 
        {
            System.out.println(t1);
            System.out.println(t2);
            
            cont = 3;
            
            while (cont <= n)
            {
                t3 = FunctionFibonacci(t1, t2);
                System.out.println(t3);
                t1 = t2;
                t2 = t3;
                
                cont ++;
            }                  
        }
    }
    
    static int FunctionFibonacci(int termo1, int termo2)
    {
        int n3;
        n3 = termo1 + termo2;
        return n3;        
    }
    
}
