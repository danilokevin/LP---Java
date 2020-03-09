/*
Objetivo:      Mostre todas as possibilidades de 2 dados de forma que a soma 
               tenha como resultado 7.
Programador:   Danilo Santos
Data:          20/02/2020
 */
package estruturaderepeticao;

public class Lt01_Ex41 
{
    public static void main(String[] args) 
    {
        int d1, d2;
        
        for (d1=1; d1 <= 6; d1++)
        {
            d2 = (7 - d1);
            
            System.out.println(d1 + " e " + d2);
            d2 = 0;
        }   
    }  
}
