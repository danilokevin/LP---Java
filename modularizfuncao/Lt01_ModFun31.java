/*
Objetivo:      Calcule e mostre o quadrado dos números entre 10 e 150
Programador:   Danilo Santos
Data:          13/02/2020
*/

package modularizfuncao;


public class Lt01_ModFun31 
{
    public static void main(String[] args) 
    {
        for (int n = 11; n <= 150; n++)
            System.out.println(FunçãoQuadrado(n));
        
    }
    
    static int FunçãoQuadrado(int n1)
    {
        int res = n1 * n1;
        
        return res;
    }
    
}
