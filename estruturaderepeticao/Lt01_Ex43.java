/*
Objetivo:      Calcule e mostre quantos anos serão necessários para que Ana 
               seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm 
               ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
Programador:   Danilo Santos
Data:          20/02/2020
 */
package estruturaderepeticao;


public class Lt01_Ex43 
{
    public static void main(String[] args) 
    {
        float ana, maria, ano;
        
        ano = 1;
        ana = (float)1.10;
        maria = (float) 1.50;
        
        while (ana <= maria) 
        {
            ana += 0.03;
            maria += 0.02;
            
            ano += 1;
        }
        
        System.out.println("Ana será maior do que Maria em " + ano + " anos");  
    }
}
