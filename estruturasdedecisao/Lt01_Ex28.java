/*
Objetivo:      Receba o preço atual e a média mensal de um produto. Calcule e 
               mostre o novo preço sabendo que:
                Venda Mensal / Preço Atual / Preço Novo
                < 500 / < 30 / +10%
                >= 500 e < 1000 / >= 30 e < 80 / +15%
                >= 1000 / >= 80 /-5%
               Obs.: para outras condições, preço novo será igual ao preço atual.
Programador:   Danilo Santos
Data:          13/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex28 
{
    public static void main(String[] args) 
    {
        int vmm;
        float pa, np;
        
        vmm = Integer.parseInt(JOptionPane.showInputDialog("Venda Média Mensal: "));
        pa = Float.parseFloat(JOptionPane.showInputDialog("Preço Atual: R$ "));
        
        if (vmm < 500 && pa < 30)
        {
            np = (float) (pa * 1.10);
        } else 
        {
            if (vmm < 1000 && pa < 80)
            {
                np = (float) (pa * 1.15);
            } else 
            {
                if (vmm >= 1000 && pa >= 80)
                {
                    np = (float) (pa * 0.95);
                } else 
                {
                    np = pa;
                }
            }
        }
        
        System.out.println("O novo preço do produto é igual a R$: " + np);
    }
}
