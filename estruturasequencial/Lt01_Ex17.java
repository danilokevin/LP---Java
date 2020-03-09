/*
Objetivo:      Calcule a quantidade de litros gastos em uma viagem, 
               sabendo que o automóvel faz 12 km/l. Receber o tempo de 
               percurso e a velocidade média
Programador:   Danilo Santos
Data:          06/02/2020
*/

import java.util.Scanner;


public class Lt01_Ex17 
{
    public static void main(String[] args) 
    {
        Scanner tec = new Scanner(System.in);
        System.out.print("Qual a velocidade média (km/h): ");
        float vm = tec.nextFloat();
        System.out.print("Tempo de percurso (horas): ");
        float hr = tec.nextFloat();
        
        float km = vm*hr;
        
        int litros = (int) Math.ceil(km/12);
        
        System.out.println("Será necessário no mínimo " + litros + " litros para esta viagem."); 
    }
}