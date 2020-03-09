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

import java.util.Scanner;

public class Lt01_Ex16 
{
    public static void main(String[] args) 
    {
        Scanner tec = new Scanner(System.in);
        System.out.print("Horas trabalhadas: ");
        float ht = tec.nextFloat();
        System.out.print("Valor por hora: ");
        float vh = tec.nextFloat();
        System.out.print("Percentual de desconto: ");
        float pd = tec.nextFloat();
        
        float sb = ht*vh;
        sb *= (100-pd)/100;
        
        System.out.println("Salário Bruto: R$ " + sb);
        
        System.out.print("Número de dependentes: ");
        int dep = tec.nextInt();
        
        float sl = sb+(dep*100);
        
        System.out.printf("Salário Líquido: R$ %.2f \n", sl);
        
    }   
}
