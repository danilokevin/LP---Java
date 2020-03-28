/*
Objetivo:      Criar e coletar valores inteiros nos vetores VT1[3] e 
               VT2[3]. Concatenar esses valores em um 3º vetor (VT3[6]) e 
               mostrar os seus dados
Programador:   Danilo Santos
Data:          05/03/2020
*/
package vetores;

import javax.swing.JOptionPane;

public class Lt02_Ex03 
{
    public static void main(String[] args) 
    {
        int vet1[] = new int [3];
        int vet2[] = new int [3];
        int vet3[] = new int [6];
        int indic;
        
        for (indic = 0; indic <= 2; indic++)
        {
            vet1[indic] = Integer.parseInt(JOptionPane.showInputDialog("Declare o " + (indic+1) + "º número do Vetor 1: "));
            vet2[indic] = Integer.parseInt(JOptionPane.showInputDialog("Declare o " + (indic+1) + "º número do Vetor 2: "));
        }
        
        for (indic = 0; indic <= 5; indic ++)
        {
            if (indic <= 2)
            {
                vet3[indic] = vet1[indic]; 
            } else 
            {
                vet3[indic] = vet2[indic-3];
            }
            
            System.out.println(vet3[indic]);
        } 
    }
}
