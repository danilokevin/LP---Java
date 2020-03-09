/*
Receber números aleatórios em um Vetor e ordená-lo em ordem crescente.
 */

import javax.swing.JOptionPane;

public class OrdenaVetor 
{
    public static void main(String[] args) 
    {
        int vet[] = new int [5];
        int ant, pro, aux;
        
        for (ant=0; ant <=4 ; ant++)
        {
            vet[ant] = Integer.parseInt(JOptionPane.showInputDialog("Declare um número: "));
        }
        
        for (ant=0; ant <= 3; ant ++)
        {
            for (pro=(ant+1); pro <= 4; pro++)
            {
                if (vet[ant] > vet[pro])
                {
                    aux = vet[ant];
                    vet [ant] = vet[pro];
                    vet[pro] = aux;
                }
            }
        }
        
        for (ant=0; ant <= 4; ant++)
        {
            System.out.println(vet[ant]);
        }
        
    }
    
}
