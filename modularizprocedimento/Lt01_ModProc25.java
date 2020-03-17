/*
Objetivo:      Receba a hora de início e de final de um jogo (HH,MM) sabendo 
               que o tempo máximo é de 24 horas e pode começar num dia e 
               terminar noutro.
Programador:   Danilo Santos
Data:          11/02/2020
*/

package modularizprocedimento;

import javax.swing.JOptionPane;

public class Lt01_ModProc25 
{
    public static void main(String[] args) 
    {
        int horaIn, horaFin, minIn, minFin;
        
        horaIn = Integer.parseInt(JOptionPane.showInputDialog("Hora inicial do jogo: "));
        minIn = Integer.parseInt(JOptionPane.showInputDialog("Minuto inicial do jogo: "));
        horaFin = Integer.parseInt(JOptionPane.showInputDialog("Hora final do jogo: "));
        minFin = Integer.parseInt(JOptionPane.showInputDialog("Minuto final do jogo: "));
        
        ProcedureJogo(horaIn, minIn, horaFin, minFin);
        
    }
    
    static void ProcedureJogo(int horaIn, int minIn, int horaFin, int minFin)
    {
        int durH, durM;
        
         if (horaIn == horaFin)
        {
            if (minIn < minFin) 
            {
                durM = minFin - minIn;
                System.out.println("Duração do jogo: " + durM + " minutos");
            } else 
            {
                if (minIn > minFin)
                {
                    durH = 23;
                    durM = (60 - minIn) + minFin;
                    System.out.println("Duração do jogo: " + durH + " horas e " + durM + " minutos ");
                } else 
                {
                    System.out.println("ERRO. JOGO NÃO PODE DURAR MAIS DO QUE 24 HORAS");
                }
            }
        } else 
        {
            if (horaIn < horaFin)
            {
                if (minIn == minFin)
                {
                    durH = horaFin - horaIn;
                    System.out.println("Duração do Jogo: " + durH + " horas");
                } else 
                {
                    if (minIn < minFin)
                    {
                        durH = horaFin - horaIn;
                        durM = minFin - minIn;
                        System.out.println("Duração do jogo: " + durH + " horas e " + durM + " minutos");
                    } else 
                    {
                        durH = (horaFin - horaIn) - 1;
                        durM = (60 - minIn) + minFin;
                        System.out.println("Duração do jogo: " + durH + " horas e " + durM + " minutos");
                    }
                }
            } else 
            {
                if (minIn == minFin)
                {
                    durH = (24-horaIn)+horaFin;
                    System.out.println("Duração do jogo: " + durH + " horas");
                } else 
                {
                    if (minIn < minFin)
                    {
                        durH = (24-horaIn)+horaFin;
                        durM = minFin - minIn;
                        System.out.println("Duração do jogo: " + durH + " horas e " + durM + " minutos");
                    } else 
                    {
                        durH = (24 - horaIn) + (horaFin-1);
                        durM = (60 - minIn) + minFin;
                        System.out.println("Duração do jogo: " + durH + " horas e " + durM + " minutos");
                    }
                }
            }
        }
        
    }
}
