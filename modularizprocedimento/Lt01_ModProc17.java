/*
Objetivo:      Calcule a quantidade de litros gastos em uma viagem, 
               sabendo que o automóvel faz 12 km/l. Receber o tempo de 
               percurso e a velocidade média
Programador:   Danilo Santos
Data:          06/02/2020
*/
package modularizprocedimento;

import javax.swing.JOptionPane;

public class Lt01_ModProc17 
{
    public static void main(String[] args) 
    {
        float tempoPerc, velocMedia;
        
        tempoPerc = Float.parseFloat(JOptionPane.showInputDialog("Tempo de percurso em horas: "));
        velocMedia = Float.parseFloat(JOptionPane.showInputDialog("Velocidade Média: "));
        
        ProcedureLitros(tempoPerc, velocMedia);
        
    }
    
    static void ProcedureLitros(float tempoPerc, float velocMedia)
    {
        float km, litros;
        
        km = tempoPerc * velocMedia;
        litros = km / 12;
        
        System.out.println("Litros necessários: " + litros + " litros");
    }
    
}
