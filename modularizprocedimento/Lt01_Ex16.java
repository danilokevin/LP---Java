/*
Objetivo:      Receba a quantidade de horas trabalhadas, o valor por hora, 
               o percentual de desconto e o número de descendentes. Calcule o 
               salário que serão as horas trabalhadas x o valor por hora. 
               Calcule o salário líquido (= Salário Bruto – desconto). 
               A cada dependente será acrescido R$ 100 no Salário Líquido. 
               Exiba o salário a receber.
Programador:   Danilo Santos
Data:          06/02/2020
*/
package modularizprocedimento;

import javax.swing.JOptionPane;

public class Lt01_Ex16 
{
    public static void main(String[] args) 
    {
        float horTrab, valHora, percDesc, salLiq;
        int depend;
        
        horTrab = Float.parseFloat(JOptionPane.showInputDialog("Horas trabalhadas: "));
        valHora = Float.parseFloat(JOptionPane.showInputDialog("Valor da hora: R$ "));
        percDesc = Float.parseFloat(JOptionPane.showInputDialog("Percentual de desconto: "));
        depend = Integer.parseInt(JOptionPane.showInputDialog("Número de dependentes: "));
        
        ProcedureSalario(horTrab, valHora, percDesc, depend);
       
    }
    
    static void ProcedureSalario(float horTrab, float valHora, float percDesc, int depend)
    {
        double  salLiq;
        
        salLiq = horTrab * valHora;
        salLiq *= (1-(percDesc/100));
        salLiq += (depend*100);
        
        System.out.printf("Salário Líquido: R$ %.2f \n", salLiq);
        
    }
}
