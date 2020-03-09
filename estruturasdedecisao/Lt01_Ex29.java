/*
Objetivo:      Receba o tipo de investimento (1 = poupança e 2 = renda fixa) 
               e o valor do investimento. Calcule e mostre o valor corrigido 
               em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
               Demais tipos não serão considerados.
               
Programador:   Danilo Santos
Data:          13/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex29 
{
    public static void main(String[] args) 
    {
        int tipoInv;
        float inv, resg;
        
        inv = Float.parseFloat(JOptionPane.showInputDialog("Valor do Investimento: R$ "));
        tipoInv = Integer.parseInt(JOptionPane.showInputDialog("Tipo de Investimento: \n 1. Poupança (3% a.m) \n 2. Renda Fixa (5% a.m)"));
        
        if (tipoInv == 1)
        {
            resg = (float) (inv*1.03);
            System.out.println("Valor do resgate: R$ " + resg);
            
        } else 
        {
            if (tipoInv == 2)
            {
                resg = (float) (inv*1.05);
                System.out.println("Valor do resgate: R$ " + resg);
                
            } else 
            {
                System.out.println("Opção de Investimento não reconhecida. Tente novamente!");
            }
        }
    }
}
