/*
Objetivo:      Mostre todas as possibilidades de 2 dados de forma que a soma 
               tenha como resultado 7.
Programador:   Danilo Santos
Data:          20/02/2020
 */
package modularizfuncao;


public class Lt01_ModFun41 
{
    public static void main(String[] args) 
    {
        int d1;
        for (d1 = 1; d1 <= 6; d1++)
            System.out.println(d1 + " e " + FunctionDado2(d1));
    }
    
    static int FunctionDado2 (int dx)
    {
        int d2;
        d2 = 7 - dx;
        
        return d2;
    }
    
}
